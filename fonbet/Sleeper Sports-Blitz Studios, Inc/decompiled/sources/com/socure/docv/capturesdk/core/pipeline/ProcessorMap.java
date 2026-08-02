package com.socure.docv.capturesdk.core.pipeline;

import com.braze.ui.actions.brazeactions.steps.ContainerStep;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import com.socure.docv.capturesdk.core.pipeline.model.ScanType;
import com.socure.docv.capturesdk.core.processor.frame.CornerProcessor;
import com.socure.docv.capturesdk.core.processor.image.BarcodeProcessor;
import com.socure.docv.capturesdk.core.processor.image.BlurProcessor;
import com.socure.docv.capturesdk.core.processor.image.BrightnessProcessor;
import com.socure.docv.capturesdk.core.processor.image.GlareProcessor;
import com.socure.docv.capturesdk.core.processor.image.SelfieFaceProcessor;
import com.socure.docv.capturesdk.core.processor.interfaces.IProcessor;
import com.socure.docv.capturesdk.core.processor.model.DetectionType;
import com.socure.docv.capturesdk.di.app.ApplicationComponent;
import com.socure.docv.capturesdk.feature.scanner.presentation.viewmodel.DebugImageCallback;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProcessorMap.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB\u000f\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\u0010\tJ\u0006\u0010\n\u001a\u00020\u000bJ\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/socure/docv/capturesdk/core/pipeline/ProcessorMap;", "", "builder", "Lcom/socure/docv/capturesdk/core/pipeline/ProcessorMap$Builder;", "(Lcom/socure/docv/capturesdk/core/pipeline/ProcessorMap$Builder;)V", "map", "Ljava/util/TreeMap;", "Lcom/socure/docv/capturesdk/core/processor/model/DetectionType;", "Lcom/socure/docv/capturesdk/core/processor/interfaces/IProcessor;", "(Ljava/util/TreeMap;)V", AnalyticsConstantsKt.CLOSE_BUTTON, "", "getMap", "Builder", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ProcessorMap {
    public static final int $stable = 8;
    private final TreeMap<DetectionType, IProcessor> map;

    public /* synthetic */ ProcessorMap(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    public ProcessorMap(TreeMap<DetectionType, IProcessor> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.map = map;
    }

    private ProcessorMap(Builder builder) {
        this(builder.getMap());
    }

    public final TreeMap<DetectionType, IProcessor> getMap() {
        return this.map;
    }

    public final void close() {
        Iterator<Map.Entry<DetectionType, IProcessor>> it = this.map.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().stop();
        }
    }

    /* compiled from: ProcessorMap.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0010H\u0002J\u001f\u0010\u0018\u001a\u00020\u00002\u0012\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u001a\"\u00020\u000f¢\u0006\u0002\u0010\u001bJ\u0006\u0010\u001c\u001a\u00020\u001dJ\b\u0010\u0007\u001a\u00020\u0015H\u0002J\u0010\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001d\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/socure/docv/capturesdk/core/pipeline/ProcessorMap$Builder;", "", "dependencyGraph", "Lcom/socure/docv/capturesdk/di/app/ApplicationComponent;", "scanType", "Lcom/socure/docv/capturesdk/core/pipeline/model/ScanType;", "(Lcom/socure/docv/capturesdk/di/app/ApplicationComponent;Lcom/socure/docv/capturesdk/core/pipeline/model/ScanType;)V", "dic", "Lcom/socure/docv/capturesdk/feature/scanner/presentation/viewmodel/DebugImageCallback;", "getDic", "()Lcom/socure/docv/capturesdk/feature/scanner/presentation/viewmodel/DebugImageCallback;", "setDic", "(Lcom/socure/docv/capturesdk/feature/scanner/presentation/viewmodel/DebugImageCallback;)V", "map", "Ljava/util/TreeMap;", "Lcom/socure/docv/capturesdk/core/processor/model/DetectionType;", "Lcom/socure/docv/capturesdk/core/processor/interfaces/IProcessor;", "getMap", "()Ljava/util/TreeMap;", "addDic", "addProcessor", "", "type", "processor", "addSteps", ContainerStep.STEPS, "", "([Lcom/socure/docv/capturesdk/core/processor/model/DetectionType;)Lcom/socure/docv/capturesdk/core/pipeline/ProcessorMap$Builder;", "build", "Lcom/socure/docv/capturesdk/core/pipeline/ProcessorMap;", "fetchProcessor", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private final ApplicationComponent dependencyGraph;
        private DebugImageCallback dic;
        private final TreeMap<DetectionType, IProcessor> map;
        private final ScanType scanType;

        /* compiled from: ProcessorMap.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[DetectionType.values().length];
                try {
                    iArr[DetectionType.CORNER.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[DetectionType.BLUR.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[DetectionType.GLARE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[DetectionType.BRIGHTNESS.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[DetectionType.SELFIE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[DetectionType.BARCODE.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public Builder(ApplicationComponent dependencyGraph, ScanType scanType) {
            Intrinsics.checkNotNullParameter(dependencyGraph, "dependencyGraph");
            Intrinsics.checkNotNullParameter(scanType, "scanType");
            this.dependencyGraph = dependencyGraph;
            this.scanType = scanType;
            this.map = new TreeMap<>();
        }

        public final TreeMap<DetectionType, IProcessor> getMap() {
            return this.map;
        }

        public final DebugImageCallback getDic() {
            return this.dic;
        }

        public final void setDic(DebugImageCallback debugImageCallback) {
            this.dic = debugImageCallback;
        }

        public final Builder addDic(DebugImageCallback dic) {
            Intrinsics.checkNotNullParameter(dic, "dic");
            this.dic = dic;
            dic();
            return this;
        }

        public final ProcessorMap build() {
            return new ProcessorMap(this, null);
        }

        private final void dic() {
            DebugImageCallback debugImageCallback = this.dic;
            if (debugImageCallback != null) {
                if (this.map.containsKey(DetectionType.CORNER)) {
                    IProcessor iProcessor = this.map.get(DetectionType.CORNER);
                    Intrinsics.checkNotNull(iProcessor, "null cannot be cast to non-null type com.socure.docv.capturesdk.core.processor.frame.CornerProcessor");
                    ((CornerProcessor) iProcessor).setDic$capturesdk_productionRelease(debugImageCallback);
                } else if (this.map.containsKey(DetectionType.SELFIE)) {
                    IProcessor iProcessor2 = this.map.get(DetectionType.SELFIE);
                    Intrinsics.checkNotNull(iProcessor2, "null cannot be cast to non-null type com.socure.docv.capturesdk.core.processor.image.SelfieFaceProcessor");
                    ((SelfieFaceProcessor) iProcessor2).setDic$capturesdk_productionRelease(debugImageCallback);
                }
            }
        }

        private final void addProcessor(DetectionType type, IProcessor processor) {
            if (this.map.containsKey(type)) {
                throw new IllegalArgumentException("Processor of this type already added");
            }
            this.map.put(type, processor);
        }

        private final IProcessor fetchProcessor(DetectionType type) {
            switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
                case 1:
                    return new CornerProcessor(this.dependencyGraph, this.scanType);
                case 2:
                    return new BlurProcessor(this.dependencyGraph);
                case 3:
                    return new GlareProcessor(this.dependencyGraph);
                case 4:
                    return new BrightnessProcessor();
                case 5:
                    return new SelfieFaceProcessor(this.dependencyGraph);
                case 6:
                    return new BarcodeProcessor();
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }

        public final Builder addSteps(DetectionType... steps) {
            Intrinsics.checkNotNullParameter(steps, "steps");
            for (DetectionType detectionType : steps) {
                addProcessor(detectionType, fetchProcessor(detectionType));
            }
            return this;
        }
    }
}
