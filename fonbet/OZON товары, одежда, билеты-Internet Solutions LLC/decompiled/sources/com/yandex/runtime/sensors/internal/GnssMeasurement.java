package com.yandex.runtime.sensors.internal;

import com.yandex.runtime.NativeObject;
import com.yandex.runtime.bindings.Archive;
import com.yandex.runtime.bindings.Serializable;

/* loaded from: classes9.dex */
public class GnssMeasurement implements Serializable {
    private double accumulatedDeltaRangeMeters;
    private boolean accumulatedDeltaRangeMeters__is_initialized;
    private int accumulatedDeltaRangeState;
    private boolean accumulatedDeltaRangeState__is_initialized;
    private double accumulatedDeltaRangeUncertaintyMeters;
    private boolean accumulatedDeltaRangeUncertaintyMeters__is_initialized;
    private Long carrierCycles;
    private boolean carrierCycles__is_initialized;
    private Float carrierFrequencyHz;
    private boolean carrierFrequencyHz__is_initialized;
    private Double carrierPhase;
    private Double carrierPhaseUncertainty;
    private boolean carrierPhaseUncertainty__is_initialized;
    private boolean carrierPhase__is_initialized;
    private double cn0DbHz;
    private boolean cn0DbHz__is_initialized;
    private int constellationType;
    private boolean constellationType__is_initialized;
    private int multipathIndicator;
    private boolean multipathIndicator__is_initialized;
    private NativeObject nativeObject;
    private double pseudorangeRateMetersPerSecond;
    private boolean pseudorangeRateMetersPerSecond__is_initialized;
    private double pseudorangeRateUncertaintyMetersPerSecond;
    private boolean pseudorangeRateUncertaintyMetersPerSecond__is_initialized;
    private long receivedSvTimeNanos;
    private boolean receivedSvTimeNanos__is_initialized;
    private long receivedSvTimeUncertaintyNanos;
    private boolean receivedSvTimeUncertaintyNanos__is_initialized;
    private Double snrInDb;
    private boolean snrInDb__is_initialized;
    private int state;
    private boolean state__is_initialized;
    private int svid;
    private boolean svid__is_initialized;
    private double timeOffsetNanos;
    private boolean timeOffsetNanos__is_initialized;

    public GnssMeasurement() {
        this.constellationType__is_initialized = false;
        this.svid__is_initialized = false;
        this.accumulatedDeltaRangeMeters__is_initialized = false;
        this.accumulatedDeltaRangeState__is_initialized = false;
        this.accumulatedDeltaRangeUncertaintyMeters__is_initialized = false;
        this.carrierFrequencyHz__is_initialized = false;
        this.cn0DbHz__is_initialized = false;
        this.pseudorangeRateMetersPerSecond__is_initialized = false;
        this.pseudorangeRateUncertaintyMetersPerSecond__is_initialized = false;
        this.receivedSvTimeNanos__is_initialized = false;
        this.receivedSvTimeUncertaintyNanos__is_initialized = false;
        this.snrInDb__is_initialized = false;
        this.state__is_initialized = false;
        this.timeOffsetNanos__is_initialized = false;
        this.multipathIndicator__is_initialized = false;
        this.carrierCycles__is_initialized = false;
        this.carrierPhase__is_initialized = false;
        this.carrierPhaseUncertainty__is_initialized = false;
    }

    private native double getAccumulatedDeltaRangeMeters__Native();

    private native int getAccumulatedDeltaRangeState__Native();

    private native double getAccumulatedDeltaRangeUncertaintyMeters__Native();

    private native Long getCarrierCycles__Native();

    private native Float getCarrierFrequencyHz__Native();

    private native Double getCarrierPhaseUncertainty__Native();

    private native Double getCarrierPhase__Native();

    private native double getCn0DbHz__Native();

    private native int getConstellationType__Native();

    private native int getMultipathIndicator__Native();

    public static String getNativeName() {
        return "yandex::maps::runtime::sensors::internal::GnssMeasurement";
    }

    private native double getPseudorangeRateMetersPerSecond__Native();

    private native double getPseudorangeRateUncertaintyMetersPerSecond__Native();

    private native long getReceivedSvTimeNanos__Native();

    private native long getReceivedSvTimeUncertaintyNanos__Native();

    private native Double getSnrInDb__Native();

    private native int getState__Native();

    private native int getSvid__Native();

    private native double getTimeOffsetNanos__Native();

    private native NativeObject init(int i11, int i12, double d11, int i13, double d12, Float f7, double d13, double d14, double d15, long j11, long j12, Double d16, int i14, double d17, int i15, Long l11, Double d18, Double d19);

    public synchronized double getAccumulatedDeltaRangeMeters() {
        try {
            if (!this.accumulatedDeltaRangeMeters__is_initialized) {
                this.accumulatedDeltaRangeMeters = getAccumulatedDeltaRangeMeters__Native();
                this.accumulatedDeltaRangeMeters__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.accumulatedDeltaRangeMeters;
    }

    public synchronized int getAccumulatedDeltaRangeState() {
        try {
            if (!this.accumulatedDeltaRangeState__is_initialized) {
                this.accumulatedDeltaRangeState = getAccumulatedDeltaRangeState__Native();
                this.accumulatedDeltaRangeState__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.accumulatedDeltaRangeState;
    }

    public synchronized double getAccumulatedDeltaRangeUncertaintyMeters() {
        try {
            if (!this.accumulatedDeltaRangeUncertaintyMeters__is_initialized) {
                this.accumulatedDeltaRangeUncertaintyMeters = getAccumulatedDeltaRangeUncertaintyMeters__Native();
                this.accumulatedDeltaRangeUncertaintyMeters__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.accumulatedDeltaRangeUncertaintyMeters;
    }

    public synchronized Long getCarrierCycles() {
        try {
            if (!this.carrierCycles__is_initialized) {
                this.carrierCycles = getCarrierCycles__Native();
                this.carrierCycles__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.carrierCycles;
    }

    public synchronized Float getCarrierFrequencyHz() {
        try {
            if (!this.carrierFrequencyHz__is_initialized) {
                this.carrierFrequencyHz = getCarrierFrequencyHz__Native();
                this.carrierFrequencyHz__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.carrierFrequencyHz;
    }

    public synchronized Double getCarrierPhase() {
        try {
            if (!this.carrierPhase__is_initialized) {
                this.carrierPhase = getCarrierPhase__Native();
                this.carrierPhase__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.carrierPhase;
    }

    public synchronized Double getCarrierPhaseUncertainty() {
        try {
            if (!this.carrierPhaseUncertainty__is_initialized) {
                this.carrierPhaseUncertainty = getCarrierPhaseUncertainty__Native();
                this.carrierPhaseUncertainty__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.carrierPhaseUncertainty;
    }

    public synchronized double getCn0DbHz() {
        try {
            if (!this.cn0DbHz__is_initialized) {
                this.cn0DbHz = getCn0DbHz__Native();
                this.cn0DbHz__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.cn0DbHz;
    }

    public synchronized int getConstellationType() {
        try {
            if (!this.constellationType__is_initialized) {
                this.constellationType = getConstellationType__Native();
                this.constellationType__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.constellationType;
    }

    public synchronized int getMultipathIndicator() {
        try {
            if (!this.multipathIndicator__is_initialized) {
                this.multipathIndicator = getMultipathIndicator__Native();
                this.multipathIndicator__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.multipathIndicator;
    }

    public synchronized double getPseudorangeRateMetersPerSecond() {
        try {
            if (!this.pseudorangeRateMetersPerSecond__is_initialized) {
                this.pseudorangeRateMetersPerSecond = getPseudorangeRateMetersPerSecond__Native();
                this.pseudorangeRateMetersPerSecond__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.pseudorangeRateMetersPerSecond;
    }

    public synchronized double getPseudorangeRateUncertaintyMetersPerSecond() {
        try {
            if (!this.pseudorangeRateUncertaintyMetersPerSecond__is_initialized) {
                this.pseudorangeRateUncertaintyMetersPerSecond = getPseudorangeRateUncertaintyMetersPerSecond__Native();
                this.pseudorangeRateUncertaintyMetersPerSecond__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.pseudorangeRateUncertaintyMetersPerSecond;
    }

    public synchronized long getReceivedSvTimeNanos() {
        try {
            if (!this.receivedSvTimeNanos__is_initialized) {
                this.receivedSvTimeNanos = getReceivedSvTimeNanos__Native();
                this.receivedSvTimeNanos__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.receivedSvTimeNanos;
    }

    public synchronized long getReceivedSvTimeUncertaintyNanos() {
        try {
            if (!this.receivedSvTimeUncertaintyNanos__is_initialized) {
                this.receivedSvTimeUncertaintyNanos = getReceivedSvTimeUncertaintyNanos__Native();
                this.receivedSvTimeUncertaintyNanos__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.receivedSvTimeUncertaintyNanos;
    }

    public synchronized Double getSnrInDb() {
        try {
            if (!this.snrInDb__is_initialized) {
                this.snrInDb = getSnrInDb__Native();
                this.snrInDb__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.snrInDb;
    }

    public synchronized int getState() {
        try {
            if (!this.state__is_initialized) {
                this.state = getState__Native();
                this.state__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.state;
    }

    public synchronized int getSvid() {
        try {
            if (!this.svid__is_initialized) {
                this.svid = getSvid__Native();
                this.svid__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.svid;
    }

    public synchronized double getTimeOffsetNanos() {
        try {
            if (!this.timeOffsetNanos__is_initialized) {
                this.timeOffsetNanos = getTimeOffsetNanos__Native();
                this.timeOffsetNanos__is_initialized = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.timeOffsetNanos;
    }

    @Override // com.yandex.runtime.bindings.Serializable
    public void serialize(Archive archive) {
        if (!archive.isReader()) {
            archive.add(getConstellationType());
            archive.add(getSvid());
            archive.add(getAccumulatedDeltaRangeMeters());
            archive.add(getAccumulatedDeltaRangeState());
            archive.add(getAccumulatedDeltaRangeUncertaintyMeters());
            archive.add(getCarrierFrequencyHz(), true);
            archive.add(getCn0DbHz());
            archive.add(getPseudorangeRateMetersPerSecond());
            archive.add(getPseudorangeRateUncertaintyMetersPerSecond());
            archive.add(getReceivedSvTimeNanos());
            archive.add(getReceivedSvTimeUncertaintyNanos());
            archive.add(getSnrInDb(), true);
            archive.add(getState());
            archive.add(getTimeOffsetNanos());
            archive.add(getMultipathIndicator());
            archive.add(getCarrierCycles(), true);
            archive.add(getCarrierPhase(), true);
            archive.add(getCarrierPhaseUncertainty(), true);
            return;
        }
        this.constellationType = archive.add(this.constellationType);
        this.constellationType__is_initialized = true;
        this.svid = archive.add(this.svid);
        this.svid__is_initialized = true;
        this.accumulatedDeltaRangeMeters = archive.add(this.accumulatedDeltaRangeMeters);
        this.accumulatedDeltaRangeMeters__is_initialized = true;
        this.accumulatedDeltaRangeState = archive.add(this.accumulatedDeltaRangeState);
        this.accumulatedDeltaRangeState__is_initialized = true;
        this.accumulatedDeltaRangeUncertaintyMeters = archive.add(this.accumulatedDeltaRangeUncertaintyMeters);
        this.accumulatedDeltaRangeUncertaintyMeters__is_initialized = true;
        this.carrierFrequencyHz = archive.add(this.carrierFrequencyHz, true);
        this.carrierFrequencyHz__is_initialized = true;
        this.cn0DbHz = archive.add(this.cn0DbHz);
        this.cn0DbHz__is_initialized = true;
        this.pseudorangeRateMetersPerSecond = archive.add(this.pseudorangeRateMetersPerSecond);
        this.pseudorangeRateMetersPerSecond__is_initialized = true;
        this.pseudorangeRateUncertaintyMetersPerSecond = archive.add(this.pseudorangeRateUncertaintyMetersPerSecond);
        this.pseudorangeRateUncertaintyMetersPerSecond__is_initialized = true;
        this.receivedSvTimeNanos = archive.add(this.receivedSvTimeNanos);
        this.receivedSvTimeNanos__is_initialized = true;
        this.receivedSvTimeUncertaintyNanos = archive.add(this.receivedSvTimeUncertaintyNanos);
        this.receivedSvTimeUncertaintyNanos__is_initialized = true;
        this.snrInDb = archive.add(this.snrInDb, true);
        this.snrInDb__is_initialized = true;
        this.state = archive.add(this.state);
        this.state__is_initialized = true;
        this.timeOffsetNanos = archive.add(this.timeOffsetNanos);
        this.timeOffsetNanos__is_initialized = true;
        this.multipathIndicator = archive.add(this.multipathIndicator);
        this.multipathIndicator__is_initialized = true;
        this.carrierCycles = archive.add(this.carrierCycles, true);
        this.carrierCycles__is_initialized = true;
        this.carrierPhase = archive.add(this.carrierPhase, true);
        this.carrierPhase__is_initialized = true;
        Double add = archive.add(this.carrierPhaseUncertainty, true);
        this.carrierPhaseUncertainty = add;
        this.carrierPhaseUncertainty__is_initialized = true;
        this.nativeObject = init(this.constellationType, this.svid, this.accumulatedDeltaRangeMeters, this.accumulatedDeltaRangeState, this.accumulatedDeltaRangeUncertaintyMeters, this.carrierFrequencyHz, this.cn0DbHz, this.pseudorangeRateMetersPerSecond, this.pseudorangeRateUncertaintyMetersPerSecond, this.receivedSvTimeNanos, this.receivedSvTimeUncertaintyNanos, this.snrInDb, this.state, this.timeOffsetNanos, this.multipathIndicator, this.carrierCycles, this.carrierPhase, add);
    }

    public GnssMeasurement(int i11, int i12, double d11, int i13, double d12, Float f7, double d13, double d14, double d15, long j11, long j12, Double d16, int i14, double d17, int i15, Long l11, Double d18, Double d19) {
        this.constellationType__is_initialized = false;
        this.svid__is_initialized = false;
        this.accumulatedDeltaRangeMeters__is_initialized = false;
        this.accumulatedDeltaRangeState__is_initialized = false;
        this.accumulatedDeltaRangeUncertaintyMeters__is_initialized = false;
        this.carrierFrequencyHz__is_initialized = false;
        this.cn0DbHz__is_initialized = false;
        this.pseudorangeRateMetersPerSecond__is_initialized = false;
        this.pseudorangeRateUncertaintyMetersPerSecond__is_initialized = false;
        this.receivedSvTimeNanos__is_initialized = false;
        this.receivedSvTimeUncertaintyNanos__is_initialized = false;
        this.snrInDb__is_initialized = false;
        this.state__is_initialized = false;
        this.timeOffsetNanos__is_initialized = false;
        this.multipathIndicator__is_initialized = false;
        this.carrierCycles__is_initialized = false;
        this.carrierPhase__is_initialized = false;
        this.carrierPhaseUncertainty__is_initialized = false;
        this.nativeObject = init(i11, i12, d11, i13, d12, f7, d13, d14, d15, j11, j12, d16, i14, d17, i15, l11, d18, d19);
        this.constellationType = i11;
        this.constellationType__is_initialized = true;
        this.svid = i12;
        this.svid__is_initialized = true;
        this.accumulatedDeltaRangeMeters = d11;
        this.accumulatedDeltaRangeMeters__is_initialized = true;
        this.accumulatedDeltaRangeState = i13;
        this.accumulatedDeltaRangeState__is_initialized = true;
        this.accumulatedDeltaRangeUncertaintyMeters = d12;
        this.accumulatedDeltaRangeUncertaintyMeters__is_initialized = true;
        this.carrierFrequencyHz = f7;
        this.carrierFrequencyHz__is_initialized = true;
        this.cn0DbHz = d13;
        this.cn0DbHz__is_initialized = true;
        this.pseudorangeRateMetersPerSecond = d14;
        this.pseudorangeRateMetersPerSecond__is_initialized = true;
        this.pseudorangeRateUncertaintyMetersPerSecond = d15;
        this.pseudorangeRateUncertaintyMetersPerSecond__is_initialized = true;
        this.receivedSvTimeNanos = j11;
        this.receivedSvTimeNanos__is_initialized = true;
        this.receivedSvTimeUncertaintyNanos = j12;
        this.receivedSvTimeUncertaintyNanos__is_initialized = true;
        this.snrInDb = d16;
        this.snrInDb__is_initialized = true;
        this.state = i14;
        this.state__is_initialized = true;
        this.timeOffsetNanos = d17;
        this.timeOffsetNanos__is_initialized = true;
        this.multipathIndicator = i15;
        this.multipathIndicator__is_initialized = true;
        this.carrierCycles = l11;
        this.carrierCycles__is_initialized = true;
        this.carrierPhase = d18;
        this.carrierPhase__is_initialized = true;
        this.carrierPhaseUncertainty = d19;
        this.carrierPhaseUncertainty__is_initialized = true;
    }

    private GnssMeasurement(NativeObject nativeObject) {
        this.constellationType__is_initialized = false;
        this.svid__is_initialized = false;
        this.accumulatedDeltaRangeMeters__is_initialized = false;
        this.accumulatedDeltaRangeState__is_initialized = false;
        this.accumulatedDeltaRangeUncertaintyMeters__is_initialized = false;
        this.carrierFrequencyHz__is_initialized = false;
        this.cn0DbHz__is_initialized = false;
        this.pseudorangeRateMetersPerSecond__is_initialized = false;
        this.pseudorangeRateUncertaintyMetersPerSecond__is_initialized = false;
        this.receivedSvTimeNanos__is_initialized = false;
        this.receivedSvTimeUncertaintyNanos__is_initialized = false;
        this.snrInDb__is_initialized = false;
        this.state__is_initialized = false;
        this.timeOffsetNanos__is_initialized = false;
        this.multipathIndicator__is_initialized = false;
        this.carrierCycles__is_initialized = false;
        this.carrierPhase__is_initialized = false;
        this.carrierPhaseUncertainty__is_initialized = false;
        this.nativeObject = nativeObject;
    }
}
