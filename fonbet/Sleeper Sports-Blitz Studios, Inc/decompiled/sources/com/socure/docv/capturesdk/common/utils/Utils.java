package com.socure.docv.capturesdk.common.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import androidx.core.content.ContextCompat;
import com.braze.ui.actions.brazeactions.steps.StepData;
import com.google.gson.Gson;
import com.nimbusds.jose.jwk.JWKParameterNames;
import com.socure.docv.capturesdk.BuildConfig;
import com.socure.docv.capturesdk.api.DocumentType;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import com.socure.docv.capturesdk.common.analytics.DocSelection;
import com.socure.docv.capturesdk.common.analytics.model.MetricData;
import com.socure.docv.capturesdk.common.logger.LoggerKt;
import com.socure.docv.capturesdk.common.network.model.stepup.Address;
import com.socure.docv.capturesdk.common.network.model.stepup.ExtractedStepUpData;
import com.socure.docv.capturesdk.common.network.model.stepup.NewLabels;
import com.socure.docv.capturesdk.common.network.model.stepup.UploadImage;
import com.socure.docv.capturesdk.common.network.model.stepup.Websdk;
import com.socure.docv.capturesdk.common.session.SessionManager;
import com.socure.docv.capturesdk.core.extractor.model.BaseExtractedData;
import com.socure.docv.capturesdk.core.extractor.model.ExtractedBarcode;
import com.socure.docv.capturesdk.core.extractor.model.ExtractedMrz;
import com.socure.docv.capturesdk.core.parser.BarcodeParserKt;
import com.socure.docv.capturesdk.core.pipeline.model.Facet;
import com.socure.docv.capturesdk.core.pipeline.model.ScanType;
import com.socure.docv.capturesdk.core.processor.model.CaptureMetadata;
import com.socure.docv.capturesdk.core.processor.model.DetectionMetric;
import com.socure.docv.capturesdk.core.processor.model.DetectionType;
import com.socure.docv.capturesdk.core.processor.model.Output;
import com.socure.docv.capturesdk.feature.scanner.data.DetectionCallback;
import com.socure.docv.capturesdk.feature.scanner.data.Dimension;
import io.sentry.SentryEnvelopeItemHeader;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.CharRange;
import kotlin.text.StringsKt;
import okhttp3.MultipartBody;
import org.jacoco.core.runtime.AgentOptions;

/* compiled from: Utils.kt */
@Metadata(d1 = {"\u0000ê\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\bJW\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n2*\u0010\r\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u000f0\u000e\"\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u000f¢\u0006\u0002\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\u0014J\u0015\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0000¢\u0006\u0002\b\u0018J,\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\"\u0010\u001b\u001a\u001e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001cj\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e`\u001fJ\u000e\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\"J\u001d\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020&H\u0000¢\u0006\u0002\b'J\u0015\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0000¢\u0006\u0002\b,J\r\u0010-\u001a\u00020\u000bH\u0000¢\u0006\u0002\b.J\u0010\u0010/\u001a\u00020\u000b2\b\u0010$\u001a\u0004\u0018\u00010\u001dJ\u001d\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u0010$\u001a\u00020\u001dH\u0000¢\u0006\u0002\b4J\u0015\u00105\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u001dH\u0000¢\u0006\u0002\b6J+\u00107\u001a\u0004\u0018\u00010\u000b2\u0006\u00108\u001a\u00020\u000b2\b\b\u0002\u00109\u001a\u00020\u000b2\b\b\u0002\u0010:\u001a\u00020;H\u0000¢\u0006\u0002\b<J\u0015\u0010=\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u001dH\u0000¢\u0006\u0002\b>J\u001e\u0010?\u001a\u0012\u0012\u0004\u0012\u00020A0@j\b\u0012\u0004\u0012\u00020A`B2\u0006\u0010C\u001a\u00020\u0012J\u000e\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020GJa\u0010H\u001a \u0012\u0004\u0012\u00020\u001e\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u000f0I0\u000f2\u0006\u0010$\u001a\u00020\u001d2\u0006\u0010J\u001a\u00020K2\n\b\u0002\u0010L\u001a\u0004\u0018\u00010M2\u0006\u0010N\u001a\u00020\u000b2\u0006\u0010O\u001a\u00020\u000b2\b\u0010P\u001a\u0004\u0018\u00010EH\u0000¢\u0006\u0002\bQJ\u001e\u0010R\u001a\u0012\u0012\u0004\u0012\u00020A0@j\b\u0012\u0004\u0012\u00020A`B2\u0006\u0010C\u001a\u00020\u0012J\u0015\u0010S\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020&H\u0000¢\u0006\u0002\bTJ&\u0010U\u001a\u0012\u0012\u0004\u0012\u00020A0@j\b\u0012\u0004\u0012\u00020A`B2\u0006\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020\u0012J\u001e\u0010U\u001a\u0012\u0012\u0004\u0012\u00020A0@j\b\u0012\u0004\u0012\u00020A`B2\u0006\u0010Y\u001a\u00020ZJ\u001d\u0010[\u001a\u0012\u0012\u0004\u0012\u00020A0@j\b\u0012\u0004\u0012\u00020A`BH\u0000¢\u0006\u0002\b\\J\r\u0010]\u001a\u00020^H\u0000¢\u0006\u0002\b_J1\u0010`\u001a\b\u0012\u0004\u0012\u00020a0\u000e2\f\u0010b\u001a\b\u0012\u0004\u0012\u00020a0\u000e2\f\u0010c\u001a\b\u0012\u0004\u0012\u00020a0\u000eH\u0000¢\u0006\u0004\bd\u0010eJ\u001d\u0010f\u001a\u00020\u000b2\u0006\u00102\u001a\u0002032\u0006\u0010$\u001a\u00020\u001dH\u0000¢\u0006\u0002\bgJ\u000e\u0010h\u001a\u00020\u00122\u0006\u00102\u001a\u000203J\r\u0010i\u001a\u00020\u0012H\u0000¢\u0006\u0002\bjJ\u0015\u0010k\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u001dH\u0000¢\u0006\u0002\blJ\u0015\u0010m\u001a\u00020\u000b2\u0006\u0010n\u001a\u00020\u0016H\u0000¢\u0006\u0002\boJ\u0012\u0010p\u001a\u0004\u0018\u00010\u001a2\b\u0010L\u001a\u0004\u0018\u00010MJ+\u0010q\u001a\u00020\u000b2\u0006\u0010r\u001a\u00020\u000b2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u001d2\b\u0010s\u001a\u0004\u0018\u00010tH\u0000¢\u0006\u0002\buJ#\u0010v\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000f2\u0006\u0010w\u001a\u00020\u0004H\u0000¢\u0006\u0002\bxJ\r\u0010y\u001a\u00020\u0012H\u0000¢\u0006\u0002\bz¨\u0006{"}, d2 = {"Lcom/socure/docv/capturesdk/common/utils/Utils;", "", "()V", "appendResultAndHorizontalConf", "", "coordinatesArray", "horizontalConf", "", "appendResultAndHorizontalConf$capturesdk_productionRelease", "argsIntoAttrs", "", "", "map", StepData.ARGS, "", "Lkotlin/Pair;", "(Ljava/util/Map;[Lkotlin/Pair;)Ljava/util/Map;", "cornersFound", "", "floatArray", "cornersFound$capturesdk_productionRelease", "dpToPx", "", JWKParameterNames.RSA_FIRST_FACTOR_CRT_EXPONENT, "dpToPx$capturesdk_productionRelease", "getBaseExtractedDataForEnd", "Lcom/socure/docv/capturesdk/common/network/model/stepup/ExtractedStepUpData;", "uploadImageMap", "Ljava/util/LinkedHashMap;", "Lcom/socure/docv/capturesdk/core/pipeline/model/ScanType;", "Lcom/socure/docv/capturesdk/common/network/model/stepup/UploadImage;", "Lkotlin/collections/LinkedHashMap;", "getBytesToHr", "bytes", "", "getContBtnText", "scanType", "newLabels", "Lcom/socure/docv/capturesdk/common/network/model/stepup/NewLabels;", "getContBtnText$capturesdk_productionRelease", "getDetectionCallback", "Lcom/socure/docv/capturesdk/feature/scanner/data/DetectionCallback;", "detectionMetric", "Lcom/socure/docv/capturesdk/core/processor/model/DetectionMetric;", "getDetectionCallback$capturesdk_productionRelease", "getDocSelFacet", "getDocSelFacet$capturesdk_productionRelease", "getEventType", "getExternalScanVideoFolderPath", "Ljava/io/File;", "context", "Landroid/content/Context;", "getExternalScanVideoFolderPath$capturesdk_productionRelease", "getFacet", "getFacet$capturesdk_productionRelease", "getFormattedDate", "date", "format", "locale", "Ljava/util/Locale;", "getFormattedDate$capturesdk_productionRelease", "getLensFacing", "getLensFacing$capturesdk_productionRelease", "getLicFlow", "Ljava/util/ArrayList;", "Lcom/socure/docv/capturesdk/common/utils/Screen;", "Lkotlin/collections/ArrayList;", "enableSelfie", "getMultiPartBodyFromMetricData", "Lokhttp3/MultipartBody$Part;", "metricData", "Lcom/socure/docv/capturesdk/common/analytics/model/MetricData;", "getOutputAndMetaData", "", AgentOptions.OUTPUT, "Lcom/socure/docv/capturesdk/core/processor/model/Output;", "extractedData", "Lcom/socure/docv/capturesdk/core/extractor/model/BaseExtractedData;", "sessionToken", "moduleId", "metricsData", "getOutputAndMetaData$capturesdk_productionRelease", "getPassportFlow", "getRetakeBtnText", "getRetakeBtnText$capturesdk_productionRelease", "getScreenSequence", ApiConstant.DOCUMENT_TYPE, "Lcom/socure/docv/capturesdk/api/DocumentType;", "selfieEnabled", "websdk", "Lcom/socure/docv/capturesdk/common/network/model/stepup/Websdk;", "getSelfieFlow", "getSelfieFlow$capturesdk_productionRelease", "getSelfieGuidingBoxDimension", "Landroid/graphics/RectF;", "getSelfieGuidingBoxDimension$capturesdk_productionRelease", "getSuperSetSteps", "Lcom/socure/docv/capturesdk/core/processor/model/DetectionType;", "autoSteps", "manualCaptureSteps", "getSuperSetSteps$capturesdk_productionRelease", "([Lcom/socure/docv/capturesdk/core/processor/model/DetectionType;[Lcom/socure/docv/capturesdk/core/processor/model/DetectionType;)[Lcom/socure/docv/capturesdk/core/processor/model/DetectionType;", "getVideoPath", "getVideoPath$capturesdk_productionRelease", "hasCameraPermission", "isAutomationFlavor", "isAutomationFlavor$capturesdk_productionRelease", "isSelfie", "isSelfie$capturesdk_productionRelease", "randomString", SentryEnvelopeItemHeader.JsonKeys.LENGTH, "randomString$capturesdk_productionRelease", "rawToStepUpExtractedData", "replacePlaceholders", "event", "docSelection", "Lcom/socure/docv/capturesdk/common/analytics/DocSelection;", "replacePlaceholders$capturesdk_productionRelease", "separateHorizontalConfArray", "combinedArray", "separateHorizontalConfArray$capturesdk_productionRelease", "showDebugImage", "showDebugImage$capturesdk_productionRelease", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Utils {
    public static final Utils INSTANCE = new Utils();

    /* compiled from: Utils.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[ScanType.values().length];
            try {
                iArr[ScanType.LICENSE_FRONT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScanType.PASSPORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ScanType.LICENSE_BACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ScanType.SELFIE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DetectionType.values().length];
            try {
                iArr2[DetectionType.CORNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[DetectionType.BLUR.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[DetectionType.BRIGHTNESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[DetectionType.GLARE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[DetectionType.SELFIE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[DetectionType.BARCODE.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[DocumentType.values().length];
            try {
                iArr3[DocumentType.LICENSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[DocumentType.PASSPORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    private Utils() {
    }

    public final String getBytesToHr(long bytes) {
        if (bytes > 1048576) {
            return (bytes / 1048576) + " MB";
        }
        if (bytes > 1024) {
            return (bytes / 1024) + " KB";
        }
        return bytes + " B";
    }

    public final boolean showDebugImage$capturesdk_productionRelease() {
        return ConstantsKt.getSHOW_DEBUG_SCAN_STAGE();
    }

    public final String getVideoPath$capturesdk_productionRelease(Context context, ScanType scanType) {
        File file;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scanType, "scanType");
        File[] listFiles = getExternalScanVideoFolderPath$capturesdk_productionRelease(context, scanType).listFiles();
        String absolutePath = (listFiles == null || (file = listFiles[0]) == null) ? null : file.getAbsolutePath();
        if (absolutePath == null) {
            absolutePath = "";
        }
        LoggerKt.logDetailed("SDLT_UTIL", "getVideoPath: " + absolutePath);
        return absolutePath;
    }

    public final boolean isAutomationFlavor$capturesdk_productionRelease() {
        return StringsKt.equals(Scanner.FLAVOR_AUTOMATION, BuildConfig.FLAVOR, false);
    }

    public final boolean isSelfie$capturesdk_productionRelease(ScanType scanType) {
        Intrinsics.checkNotNullParameter(scanType, "scanType");
        return scanType == ScanType.SELFIE;
    }

    public final boolean cornersFound$capturesdk_productionRelease(float[] floatArray) {
        Intrinsics.checkNotNullParameter(floatArray, "floatArray");
        return floatArray.length == 12 && floatArray[2] >= 0.9f && floatArray[5] >= 0.9f && floatArray[8] >= 0.9f && floatArray[11] >= 0.9f;
    }

    public final float[] appendResultAndHorizontalConf$capturesdk_productionRelease(float[] coordinatesArray, float horizontalConf) {
        Intrinsics.checkNotNullParameter(coordinatesArray, "coordinatesArray");
        List<Float> mutableList = ArraysKt.toMutableList(coordinatesArray);
        mutableList.add(Float.valueOf(horizontalConf));
        return CollectionsKt.toFloatArray(mutableList);
    }

    public final Pair<float[], float[]> separateHorizontalConfArray$capturesdk_productionRelease(float[] combinedArray) {
        Intrinsics.checkNotNullParameter(combinedArray, "combinedArray");
        if (combinedArray.length != 13) {
            return null;
        }
        return new Pair<>(CollectionsKt.toFloatArray(ArraysKt.takeLast(combinedArray, 1)), CollectionsKt.toFloatArray(ArraysKt.take(combinedArray, 12)));
    }

    public final File getExternalScanVideoFolderPath$capturesdk_productionRelease(Context context, ScanType scanType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scanType, "scanType");
        File externalFilesDir = context.getExternalFilesDir(null);
        return new File((externalFilesDir != null ? externalFilesDir.getAbsolutePath() : null) + File.separator + scanType.name() + File.separator);
    }

    public final int getLensFacing$capturesdk_productionRelease(ScanType scanType) {
        Intrinsics.checkNotNullParameter(scanType, "scanType");
        return scanType != ScanType.SELFIE ? 1 : 0;
    }

    public final RectF getSelfieGuidingBoxDimension$capturesdk_productionRelease() {
        float f = Resources.getSystem().getDisplayMetrics().widthPixels;
        float f2 = 0.65f * f;
        float f3 = 1.3333334f * f2;
        float f4 = (f - f2) / 2;
        float dpToPx$capturesdk_productionRelease = dpToPx$capturesdk_productionRelease(60);
        return new RectF(f4, dpToPx$capturesdk_productionRelease, f2 + f4, f3 + dpToPx$capturesdk_productionRelease);
    }

    public final ArrayList<Screen> getLicFlow(boolean enableSelfie) {
        ArrayList<Screen> arrayList = new ArrayList<>();
        arrayList.add(new Screen(1, State.INCOMPLETE, ScanType.LICENSE_FRONT));
        arrayList.add(new Screen(2, State.INCOMPLETE, ScanType.LICENSE_BACK));
        if (enableSelfie) {
            arrayList.add(new Screen(3, State.INCOMPLETE, ScanType.SELFIE));
        }
        return arrayList;
    }

    public final ArrayList<Screen> getPassportFlow(boolean enableSelfie) {
        ArrayList<Screen> arrayList = new ArrayList<>();
        arrayList.add(new Screen(1, State.INCOMPLETE, ScanType.PASSPORT));
        if (enableSelfie) {
            arrayList.add(new Screen(2, State.INCOMPLETE, ScanType.SELFIE));
        }
        return arrayList;
    }

    public final ArrayList<Screen> getSelfieFlow$capturesdk_productionRelease() {
        ArrayList<Screen> arrayList = new ArrayList<>();
        arrayList.add(new Screen(1, State.INCOMPLETE, ScanType.SELFIE));
        return arrayList;
    }

    public final String getEventType(ScanType scanType) {
        if (scanType != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[scanType.ordinal()];
            if (i == 1 || i == 2) {
                return ApiConstant.LIC_FRONT_UPDATE_EVENT;
            }
            if (i == 3) {
                return ApiConstant.LIC_BACK_UPDATE_EVENT;
            }
            if (i == 4) {
                return ApiConstant.SELFIE_UPDATE_EVENT;
            }
            throw new NoWhenBranchMatchedException();
        }
        return "";
    }

    public final boolean hasCameraPermission(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return ContextCompat.checkSelfPermission(context, "android.permission.CAMERA") == 0;
    }

    public final DetectionCallback getDetectionCallback$capturesdk_productionRelease(DetectionMetric detectionMetric) {
        Intrinsics.checkNotNullParameter(detectionMetric, "detectionMetric");
        switch (WhenMappings.$EnumSwitchMapping$1[detectionMetric.getDetectionType().ordinal()]) {
            case 1:
                if (detectionMetric.getDetectionCallback() == DetectionCallback.DOCUMENT_TOO_CLOSE) {
                    return DetectionCallback.DOCUMENT_TOO_CLOSE;
                }
                return DetectionCallback.CORNER_DETECTION_FAILED;
            case 2:
                return DetectionCallback.BLUR_DETECTED;
            case 3:
                return DetectionCallback.LOW_BRIGHTNESS;
            case 4:
                return DetectionCallback.GLARE_DETECTED;
            case 5:
                DetectionCallback detectionCallback = detectionMetric.getDetectionCallback();
                return detectionCallback == null ? DetectionCallback.FACE_NOT_FOUND : detectionCallback;
            case 6:
                return DetectionCallback.BARCODE_NOT_FOUND;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final Map<String, String> argsIntoAttrs(Map<String, String> map, Pair<String, String>... args) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(args, "args");
        if (args.length == 0) {
            return map;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Pair<String, String> pair : args) {
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        linkedHashMap.putAll(map);
        return linkedHashMap;
    }

    public final String randomString$capturesdk_productionRelease(int length) {
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            Character ch = (Character) CollectionsKt.random(CollectionsKt.plus((Collection) CollectionsKt.plus((Iterable) new CharRange('a', 'z'), (Iterable) new CharRange('A', 'Z')), (Iterable) new CharRange('0', '9')), Random.INSTANCE);
            ch.charValue();
            arrayList.add(ch);
        }
        return CollectionsKt.joinToString$default(arrayList, "", null, null, 0, null, null, 62, null);
    }

    public final String getDocSelFacet$capturesdk_productionRelease() {
        String value;
        DocSelection selectedDocument = SessionManager.INSTANCE.getSelectedDocument();
        return (selectedDocument == null || (value = selectedDocument.getValue()) == null) ? "" : value;
    }

    public static /* synthetic */ String replacePlaceholders$capturesdk_productionRelease$default(Utils utils, String str, ScanType scanType, DocSelection docSelection, int i, Object obj) {
        if ((i & 2) != 0) {
            scanType = null;
        }
        return utils.replacePlaceholders$capturesdk_productionRelease(str, scanType, docSelection);
    }

    public final String replacePlaceholders$capturesdk_productionRelease(String event, ScanType scanType, DocSelection docSelection) {
        Intrinsics.checkNotNullParameter(event, "event");
        String str = event;
        if (StringsKt.contains((CharSequence) str, (CharSequence) AnalyticsConstantsKt.DOCUMENT_TYPE, false) && docSelection != null) {
            event = StringsKt.replace$default(event, AnalyticsConstantsKt.DOCUMENT_TYPE, docSelection.getValue(), false, 4, (Object) null);
        }
        String str2 = event;
        return (scanType == null || !StringsKt.contains((CharSequence) str, (CharSequence) AnalyticsConstantsKt.CAPTURE_TYPE, false)) ? str2 : StringsKt.replace$default(str2, AnalyticsConstantsKt.CAPTURE_TYPE, getFacet$capturesdk_productionRelease(scanType), false, 4, (Object) null);
    }

    public final String getFacet$capturesdk_productionRelease(ScanType scanType) {
        Intrinsics.checkNotNullParameter(scanType, "scanType");
        int i = WhenMappings.$EnumSwitchMapping$0[scanType.ordinal()];
        if (i == 1 || i == 2) {
            return Facet.DOC_FRONT.getValue();
        }
        if (i == 3) {
            return Facet.DOC_BACK.getValue();
        }
        if (i == 4) {
            return Facet.SELFIE.getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final DetectionType[] getSuperSetSteps$capturesdk_productionRelease(DetectionType[] autoSteps, DetectionType[] manualCaptureSteps) {
        Intrinsics.checkNotNullParameter(autoSteps, "autoSteps");
        Intrinsics.checkNotNullParameter(manualCaptureSteps, "manualCaptureSteps");
        Set mutableSet = ArraysKt.toMutableSet(autoSteps);
        mutableSet.addAll(ArraysKt.toHashSet(manualCaptureSteps));
        return (DetectionType[]) mutableSet.toArray(new DetectionType[0]);
    }

    public static /* synthetic */ String getFormattedDate$capturesdk_productionRelease$default(Utils utils, String str, String str2, Locale US, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = BarcodeParserKt.BARCODE_DATE_FORMAT;
        }
        if ((i & 4) != 0) {
            US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
        }
        return utils.getFormattedDate$capturesdk_productionRelease(str, str2, US);
    }

    public final String getFormattedDate$capturesdk_productionRelease(String date, String format, Locale locale) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(locale, "locale");
        try {
            Date parse = new SimpleDateFormat(format, locale).parse(date);
            if (parse != null) {
                return new SimpleDateFormat(ConstantsKt.READABLE_DATE_FORMAT, locale).format(parse).toString();
            }
            return null;
        } catch (Exception e) {
            LoggerKt.logE$default("SDLT_UTIL", "ex in getFormattedDate: " + e.getLocalizedMessage(), null, 4, null);
            return null;
        }
    }

    public final String getContBtnText$capturesdk_productionRelease(ScanType scanType, NewLabels newLabels) {
        Intrinsics.checkNotNullParameter(scanType, "scanType");
        Intrinsics.checkNotNullParameter(newLabels, "newLabels");
        int i = WhenMappings.$EnumSwitchMapping$0[scanType.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return newLabels.getPreviewDocSubmit();
        }
        if (i == 4) {
            return newLabels.getPreviewSelfieSubmit();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String getRetakeBtnText$capturesdk_productionRelease(NewLabels newLabels) {
        Intrinsics.checkNotNullParameter(newLabels, "newLabels");
        return newLabels.getRetake();
    }

    public final ExtractedStepUpData rawToStepUpExtractedData(BaseExtractedData extractedData) {
        ExtractedStepUpData extractedStepUpData;
        ExtractedStepUpData extractedStepUpData2 = null;
        if (extractedData != null) {
            ScanType scanType = extractedData.getScanType();
            int i = scanType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[scanType.ordinal()];
            if (i == 2) {
                ExtractedMrz extractedMrz = (ExtractedMrz) extractedData;
                extractedStepUpData = new ExtractedStepUpData(null, null, null, ConstantsKt.MRZ_TYPE, null, null, null, null, null, null, 1015, null);
                extractedStepUpData.setFirstName(extractedMrz.getFirstName());
                extractedStepUpData.setDob(extractedMrz.getDob());
                extractedStepUpData.setExpirationDate(extractedMrz.getExpirationDate());
                extractedStepUpData.setDocumentNumber(extractedMrz.getDocumentNumber());
                extractedStepUpData.setFullName(extractedMrz.getFullName());
                extractedStepUpData.setSurName(extractedMrz.getSurname());
            } else if (i == 3) {
                ExtractedBarcode extractedBarcode = (ExtractedBarcode) extractedData;
                extractedStepUpData = new ExtractedStepUpData(null, null, null, "barcode", null, null, null, null, null, null, 1015, null);
                extractedStepUpData.setFirstName(extractedBarcode.getFirstName());
                extractedStepUpData.setDob(extractedBarcode.getDob());
                extractedStepUpData.setExpirationDate(extractedBarcode.getExpirationDate());
                extractedStepUpData.setDocumentNumber(extractedBarcode.getDocumentNumber());
                extractedStepUpData.setFullName(extractedBarcode.getFullName());
                extractedStepUpData.setIssueDate(extractedBarcode.getIssueDate());
                extractedStepUpData.setAddress(extractedBarcode.getAddress());
                extractedStepUpData.setParsedAddress(new Address(extractedBarcode.getCountry(), extractedBarcode.getAddress(), extractedBarcode.getAddress2(), extractedBarcode.getCity(), extractedBarcode.getState(), extractedBarcode.getPostalCode()));
            }
            extractedStepUpData2 = extractedStepUpData;
        }
        LoggerKt.logDetailed("SDLT_UTIL", "updateExtractData: " + new Gson().toJson(extractedData));
        return extractedStepUpData2;
    }

    public final ExtractedStepUpData getBaseExtractedDataForEnd(LinkedHashMap<ScanType, UploadImage> uploadImageMap) {
        UploadImage uploadImage;
        Intrinsics.checkNotNullParameter(uploadImageMap, "uploadImageMap");
        LoggerKt.logDetailed("SDLT_UTIL", "getBaseExtractedDataForEnd called");
        if (uploadImageMap.keySet().contains(ScanType.LICENSE_BACK)) {
            UploadImage uploadImage2 = uploadImageMap.get(ScanType.LICENSE_BACK);
            if (uploadImage2 != null) {
                return uploadImage2.getExtractedData();
            }
            return null;
        }
        if (!uploadImageMap.keySet().contains(ScanType.PASSPORT) || (uploadImage = uploadImageMap.get(ScanType.PASSPORT)) == null) {
            return null;
        }
        return uploadImage.getExtractedData();
    }

    public final MultipartBody.Part getMultiPartBodyFromMetricData(MetricData metricData) {
        Intrinsics.checkNotNullParameter(metricData, "metricData");
        String json = new Gson().toJson(metricData);
        Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(metricData)");
        return ApiUtilsKt.toMetricRequestBody(json);
    }

    public final ArrayList<Screen> getScreenSequence(Websdk websdk) {
        Intrinsics.checkNotNullParameter(websdk, "websdk");
        LoggerKt.logDetailed("SDLT_UTIL", "getScreenSequence called");
        String str = (String) CollectionsKt.firstOrNull((List) websdk.getDocumentTypes());
        if (Intrinsics.areEqual(str, ApiConstant.DOCUMENT_TYPE_LICENSE)) {
            return getLicFlow(websdk.getEnableSelfie().getValue());
        }
        if (Intrinsics.areEqual(str, "passport")) {
            return getPassportFlow(websdk.getEnableSelfie().getValue());
        }
        if (str == null) {
            return getSelfieFlow$capturesdk_productionRelease();
        }
        return new ArrayList<>();
    }

    public final ArrayList<Screen> getScreenSequence(DocumentType documentType, boolean selfieEnabled) {
        Intrinsics.checkNotNullParameter(documentType, "documentType");
        LoggerKt.logDetailed("SDLT_UTIL", "getScreenSequence with docType called");
        int i = WhenMappings.$EnumSwitchMapping$2[documentType.ordinal()];
        if (i == 1) {
            return getLicFlow(selfieEnabled);
        }
        if (i == 2) {
            return getPassportFlow(selfieEnabled);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final int dpToPx$capturesdk_productionRelease(int dp) {
        return (int) (dp * Resources.getSystem().getDisplayMetrics().density);
    }

    public static /* synthetic */ Pair getOutputAndMetaData$capturesdk_productionRelease$default(Utils utils, ScanType scanType, Output output, BaseExtractedData baseExtractedData, String str, String str2, MultipartBody.Part part, int i, Object obj) {
        if ((i & 4) != 0) {
            baseExtractedData = null;
        }
        return utils.getOutputAndMetaData$capturesdk_productionRelease(scanType, output, baseExtractedData, str, str2, part);
    }

    public final Pair<UploadImage, List<Pair<String, String>>> getOutputAndMetaData$capturesdk_productionRelease(ScanType scanType, Output output, BaseExtractedData extractedData, String sessionToken, String moduleId, MultipartBody.Part metricsData) {
        Intrinsics.checkNotNullParameter(scanType, "scanType");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(sessionToken, "sessionToken");
        Intrinsics.checkNotNullParameter(moduleId, "moduleId");
        LoggerKt.logDetailed("SDLT_UTIL", "getOutputAndMetaData called");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair(AnalyticsConstantsKt.KEY_COMPRESSED_IMAGE_WIDTH, String.valueOf(output.getFinalBitmap().getWidth())));
        arrayList.add(new Pair(AnalyticsConstantsKt.KEY_COMPRESSED_IMAGE_HEIGHT, String.valueOf(output.getFinalBitmap().getHeight())));
        UploadImage uploadImage = new UploadImage();
        uploadImage.setDocumentBody(ImageUtils.INSTANCE.getMultipartBody$capturesdk_productionRelease(output, scanType, sessionToken, moduleId));
        uploadImage.setScanType(scanType);
        uploadImage.setCaptureType(output.getCaptureType());
        uploadImage.setExtractedData(rawToStepUpExtractedData(extractedData));
        uploadImage.setDimension(new Dimension(output.getFinalBitmap().getWidth(), output.getFinalBitmap().getHeight()));
        uploadImage.setSelfieMetrics(UtilsKt.getSelfieMetrics(output));
        uploadImage.setImage(WatermarkHashGenerator.INSTANCE.processImage(ImageUtils.INSTANCE.bitmapToByteArray$capturesdk_productionRelease(output.getFinalBitmap()), sessionToken, moduleId));
        uploadImage.setMetricsData(metricsData);
        arrayList.add(new Pair(AnalyticsConstantsKt.KEY_COMPRESSED_FILE_SIZE, String.valueOf(uploadImage.getImage().length)));
        CaptureMetadata captureMetadata = output.getCaptureMetadata();
        if (captureMetadata != null) {
            arrayList.add(new Pair(AnalyticsConstantsKt.KEY_CAPTURED_IMAGE_WIDTH, String.valueOf(captureMetadata.getResolution().getWidth())));
            arrayList.add(new Pair(AnalyticsConstantsKt.KEY_CAPTURED_IMAGE_HEIGHT, String.valueOf(captureMetadata.getResolution().getHeight())));
            Integer originalSize = captureMetadata.getOriginalSize();
            if (originalSize != null) {
                arrayList.add(new Pair(AnalyticsConstantsKt.KEY_CAPTURED_FILE_SIZE, String.valueOf(originalSize.intValue())));
            }
        }
        return new Pair<>(uploadImage, arrayList);
    }
}
