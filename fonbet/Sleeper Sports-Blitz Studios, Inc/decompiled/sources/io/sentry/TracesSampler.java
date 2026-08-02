package io.sentry;

import io.sentry.util.Objects;
import io.sentry.util.SampleRateUtils;

/* loaded from: classes9.dex */
public final class TracesSampler {
    private final SentryOptions options;

    public TracesSampler(SentryOptions sentryOptions) {
        this.options = (SentryOptions) Objects.requireNonNull(sentryOptions, "options are required");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TracesSamplingDecision sample(SamplingContext samplingContext) {
        Double sample;
        Double d;
        TracesSamplingDecision parentSamplingDecision;
        Double sampleRand = samplingContext.getSampleRand();
        TracesSamplingDecision samplingDecision = samplingContext.getTransactionContext().getSamplingDecision();
        if (samplingDecision != null) {
            return SampleRateUtils.backfilledSampleRand(samplingDecision);
        }
        Double d2 = null;
        if (this.options.getProfilesSampler() != null) {
            try {
                sample = this.options.getProfilesSampler().sample(samplingContext);
            } catch (Throwable th) {
                this.options.getLogger().log(SentryLevel.ERROR, "Error in the 'ProfilesSamplerCallback' callback.", th);
            }
            if (sample == null) {
                sample = this.options.getProfilesSampleRate();
            }
            Double d3 = sample;
            Boolean valueOf = Boolean.valueOf(d3 == null && sample(d3, sampleRand));
            if (this.options.getTracesSampler() != null) {
                try {
                    d = this.options.getTracesSampler().sample(samplingContext);
                } catch (Throwable th2) {
                    this.options.getLogger().log(SentryLevel.ERROR, "Error in the 'TracesSamplerCallback' callback.", th2);
                    d = null;
                }
                if (d != null) {
                    Double d4 = d;
                    return new TracesSamplingDecision(Boolean.valueOf(sample(d4, sampleRand)), d4, sampleRand, valueOf, d3);
                }
            }
            parentSamplingDecision = samplingContext.getTransactionContext().getParentSamplingDecision();
            if (parentSamplingDecision == null) {
                return SampleRateUtils.backfilledSampleRand(parentSamplingDecision);
            }
            Double tracesSampleRate = this.options.getTracesSampleRate();
            double pow = Math.pow(2.0d, this.options.getBackpressureMonitor().getDownsampleFactor());
            Double valueOf2 = Double.valueOf(pow);
            if (tracesSampleRate != null) {
                double doubleValue = tracesSampleRate.doubleValue();
                valueOf2.getClass();
                d2 = Double.valueOf(doubleValue / pow);
            }
            Double d5 = d2;
            if (d5 != null) {
                return new TracesSamplingDecision(Boolean.valueOf(sample(d5, sampleRand)), d5, sampleRand, valueOf, d3);
            }
            return new TracesSamplingDecision(false, null, sampleRand, false, null);
        }
        sample = null;
        if (sample == null) {
        }
        Double d32 = sample;
        Boolean valueOf3 = Boolean.valueOf(d32 == null && sample(d32, sampleRand));
        if (this.options.getTracesSampler() != null) {
        }
        parentSamplingDecision = samplingContext.getTransactionContext().getParentSamplingDecision();
        if (parentSamplingDecision == null) {
        }
    }

    public boolean sampleSessionProfile(double d) {
        Double profileSessionSampleRate = this.options.getProfileSessionSampleRate();
        return profileSessionSampleRate != null && sample(profileSessionSampleRate, Double.valueOf(d));
    }

    private boolean sample(Double d, Double d2) {
        return d.doubleValue() >= d2.doubleValue();
    }
}
