package io.sentry;

import io.sentry.util.Objects;
import io.sentry.util.Random;
import io.sentry.util.SentryRandom;

/* loaded from: classes7.dex */
final class TracesSampler {
    private static final Double DEFAULT_TRACES_SAMPLE_RATE = Double.valueOf(1.0d);
    private final SentryOptions options;
    private final Random random;

    public TracesSampler(SentryOptions sentryOptions) {
        this((SentryOptions) Objects.requireNonNull(sentryOptions, "options are required"), null);
    }

    TracesSampler(SentryOptions sentryOptions, Random random) {
        this.options = sentryOptions;
        this.random = random;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    TracesSamplingDecision sample(SamplingContext samplingContext) {
        Double sample;
        Double d;
        TracesSamplingDecision parentSamplingDecision;
        TracesSamplingDecision samplingDecision = samplingContext.getTransactionContext().getSamplingDecision();
        if (samplingDecision != null) {
            return samplingDecision;
        }
        if (this.options.getProfilesSampler() != null) {
            try {
                sample = this.options.getProfilesSampler().sample(samplingContext);
            } catch (Throwable th) {
                this.options.getLogger().log(SentryLevel.ERROR, "Error in the 'ProfilesSamplerCallback' callback.", th);
            }
            if (sample == null) {
                sample = this.options.getProfilesSampleRate();
            }
            Boolean valueOf = Boolean.valueOf(sample == null && sample(sample));
            if (this.options.getTracesSampler() != null) {
                try {
                    d = this.options.getTracesSampler().sample(samplingContext);
                } catch (Throwable th2) {
                    this.options.getLogger().log(SentryLevel.ERROR, "Error in the 'TracesSamplerCallback' callback.", th2);
                    d = null;
                }
                if (d != null) {
                    return new TracesSamplingDecision(Boolean.valueOf(sample(d)), d, valueOf, sample);
                }
            }
            parentSamplingDecision = samplingContext.getTransactionContext().getParentSamplingDecision();
            if (parentSamplingDecision == null) {
                return parentSamplingDecision;
            }
            Double tracesSampleRate = this.options.getTracesSampleRate();
            Double d2 = Boolean.TRUE.equals(this.options.getEnableTracing()) ? DEFAULT_TRACES_SAMPLE_RATE : null;
            if (tracesSampleRate == null) {
                tracesSampleRate = d2;
            }
            Double valueOf2 = tracesSampleRate == null ? null : Double.valueOf(tracesSampleRate.doubleValue() / Double.valueOf(Math.pow(2.0d, this.options.getBackpressureMonitor().getDownsampleFactor())).doubleValue());
            if (valueOf2 != null) {
                return new TracesSamplingDecision(Boolean.valueOf(sample(valueOf2)), valueOf2, valueOf, sample);
            }
            return new TracesSamplingDecision(false, null, false, null);
        }
        sample = null;
        if (sample == null) {
        }
        Boolean valueOf3 = Boolean.valueOf(sample == null && sample(sample));
        if (this.options.getTracesSampler() != null) {
        }
        parentSamplingDecision = samplingContext.getTransactionContext().getParentSamplingDecision();
        if (parentSamplingDecision == null) {
        }
    }

    private boolean sample(Double d) {
        return d.doubleValue() >= getRandom().nextDouble();
    }

    private Random getRandom() {
        Random random = this.random;
        return random == null ? SentryRandom.current() : random;
    }
}
