package com.socure.docv.capturesdk.common.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import androidx.core.graphics.ColorUtils;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.material.snackbar.Snackbar;
import com.socure.docv.capturesdk.R;
import com.socure.docv.capturesdk.common.logger.LoggerKt;
import com.socure.docv.capturesdk.common.network.model.stepup.NewLabels;
import com.socure.docv.capturesdk.common.view.model.Button;
import com.socure.docv.capturesdk.common.view.model.HelpViewData;
import com.socure.docv.capturesdk.common.view.model.PreviewData;
import com.socure.docv.capturesdk.common.view.model.TextLabel;
import com.socure.docv.capturesdk.core.pipeline.model.ScanType;
import com.socure.docv.capturesdk.core.processor.model.Output;
import com.socure.docv.capturesdk.databinding.FragmentScannerSocureBinding;
import com.socure.docv.capturesdk.feature.help.presentation.ui.HelpView;
import com.socure.docv.capturesdk.feature.preview.presentation.ui.PreviewView;
import com.socure.docv.capturesdk.models.StartSessionModel;
import io.sentry.metrics.MetricsUnit;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jacoco.core.runtime.AgentOptions;

/* compiled from: HelpPreviewUtils.kt */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bJ\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010J\u001d\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0000¢\u0006\u0002\b\u0017J\u0018\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0018\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u001a\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u001e2\u0006\u0010\u001f\u001a\u00020\u0004J5\u0010 \u001a\u00020!2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010$\u001a\u00020%H\u0000¢\u0006\u0002\b&J\u001d\u0010'\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0000¢\u0006\u0002\b(J\u0016\u0010)\u001a\u00020*2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u0004J\u001d\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0000¢\u0006\u0002\b2J5\u00103\u001a\u00020-2\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u0002052\b\u00107\u001a\u0004\u0018\u0001082\f\u00109\u001a\b\u0012\u0004\u0012\u00020-0:H\u0000¢\u0006\u0002\b;¨\u0006<"}, d2 = {"Lcom/socure/docv/capturesdk/common/utils/HelpPreviewUtils;", "", "()V", "getDimensionRatio", "", "context", "Landroid/content/Context;", "scanType", "Lcom/socure/docv/capturesdk/core/pipeline/model/ScanType;", "isCardVertical", "", "getHelpBannerImage", "", "getHelpInstruction", "", "newLabels", "Lcom/socure/docv/capturesdk/common/network/model/stepup/NewLabels;", "getHelpViewUiData", "Lcom/socure/docv/capturesdk/common/view/model/HelpViewData;", "startSessionModel", "Lcom/socure/docv/capturesdk/models/StartSessionModel;", "getHelpViewData", "Lcom/socure/docv/capturesdk/common/utils/GetHelpViewData;", "getHelpViewUiData$capturesdk_productionRelease", "getLightColor", "color", MetricsUnit.Fraction.RATIO, "", "getPreviewConfirmationText", "getPreviewProgressButtonColors", "Lkotlin/Pair;", "primaryColor", "getPreviewUiData", "Lcom/socure/docv/capturesdk/common/view/model/PreviewData;", AgentOptions.OUTPUT, "Lcom/socure/docv/capturesdk/core/processor/model/Output;", "inputGenerator", "Lcom/socure/docv/capturesdk/common/utils/PreviewDataInputGenerator;", "getPreviewUiData$capturesdk_productionRelease", "getScannerHelpText", "getScannerHelpText$capturesdk_productionRelease", "getSecondaryButtonDrawable", "Landroid/graphics/drawable/Drawable;", ViewProps.BORDER_COLOR, "setVisibilityFocus", "", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "binding", "Lcom/socure/docv/capturesdk/databinding/FragmentScannerSocureBinding;", "setVisibilityFocus$capturesdk_productionRelease", "showPreviewDbgImg", "ivDbgPreviewScan", "Landroid/widget/ImageView;", "icSaveImages", "debugBitmap", "Landroid/graphics/Bitmap;", "saveDebugImage", "Lkotlin/Function0;", "showPreviewDbgImg$capturesdk_productionRelease", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class HelpPreviewUtils {
    public static final HelpPreviewUtils INSTANCE = new HelpPreviewUtils();

    /* compiled from: HelpPreviewUtils.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ScanType.values().length];
            try {
                iArr[ScanType.LICENSE_FRONT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScanType.LICENSE_BACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ScanType.PASSPORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ScanType.SELFIE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private HelpPreviewUtils() {
    }

    public final int getHelpBannerImage(ScanType scanType) {
        Intrinsics.checkNotNullParameter(scanType, "scanType");
        int i = WhenMappings.$EnumSwitchMapping$0[scanType.ordinal()];
        if (i == 1) {
            return R.drawable.socure_help_lic_front;
        }
        if (i == 2) {
            return R.drawable.socure_help_lic_back;
        }
        if (i == 3) {
            return R.drawable.socure_help_passport;
        }
        if (i == 4) {
            return R.drawable.socure_help_selfie;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final List<String> getHelpInstruction(ScanType scanType, NewLabels newLabels) {
        Intrinsics.checkNotNullParameter(scanType, "scanType");
        Intrinsics.checkNotNullParameter(newLabels, "newLabels");
        int i = WhenMappings.$EnumSwitchMapping$0[scanType.ordinal()];
        if (i == 1) {
            return CollectionsKt.listOf((Object[]) new String[]{newLabels.getPlaceIdFlat(), newLabels.getHoldPhoneOverId(), newLabels.getFocusCameraId()});
        }
        if (i == 2) {
            return CollectionsKt.listOf((Object[]) new String[]{newLabels.getFlipYourId(), newLabels.getHoldPhoneOverId(), newLabels.getFocusCameraId()});
        }
        if (i == 3) {
            return CollectionsKt.listOf((Object[]) new String[]{newLabels.getOpenPassport(), newLabels.getHoldPhoneOverPassport(), newLabels.getFocusCameraPassport()});
        }
        if (i == 4) {
            return CollectionsKt.listOf((Object[]) new String[]{newLabels.getAlignFaceFrame(), newLabels.getHoldDevice(), newLabels.getLookDirectly()});
        }
        throw new NoWhenBranchMatchedException();
    }

    public final PreviewData getPreviewUiData$capturesdk_productionRelease(Context context, ScanType scanType, Output output, StartSessionModel startSessionModel, PreviewDataInputGenerator inputGenerator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scanType, "scanType");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(startSessionModel, "startSessionModel");
        Intrinsics.checkNotNullParameter(inputGenerator, "inputGenerator");
        return new PreviewData(getDimensionRatio(context, scanType, output.getFinalBitmap().getHeight() > output.getFinalBitmap().getWidth()), new TextLabel(inputGenerator.getConfirmationTitleText(), startSessionModel.getGlobalConfig().getCustomization().getTheme().getPrimary().getColor()), new TextLabel(inputGenerator.getSubmitImageForValidation(), startSessionModel.getGlobalConfig().getCustomization().getTheme().getPrimary().getColor()), new TextLabel(inputGenerator.getPreviewConfirmationText(), startSessionModel.getGlobalConfig().getCustomization().getTheme().getPrimary().getColor()), output.getFinalBitmap(), new Button(inputGenerator.getContBtnText(), startSessionModel.getGlobalConfig().getCustomization().getTheme().getPrimary().getButton().getPrimary().getColor(), null, startSessionModel.getGlobalConfig().getCustomization().getTheme().getPrimary().getButton().getPrimary().getBackgroundColor(), 4, null), new Button(inputGenerator.getRetakeBtnText(), startSessionModel.getGlobalConfig().getCustomization().getTheme().getPrimary().getButton().getSecondary().getColor(), startSessionModel.getGlobalConfig().getCustomization().getTheme().getPrimary().getButton().getSecondary().getBorderColor(), null, 8, null), output.getDebugBitmap());
    }

    public final HelpViewData getHelpViewUiData$capturesdk_productionRelease(StartSessionModel startSessionModel, GetHelpViewData getHelpViewData) {
        Intrinsics.checkNotNullParameter(startSessionModel, "startSessionModel");
        Intrinsics.checkNotNullParameter(getHelpViewData, "getHelpViewData");
        return new HelpViewData(new TextLabel(getHelpViewData.getHelpTitleText(), startSessionModel.getGlobalConfig().getCustomization().getTheme().getPrimary().getColor()), getHelpViewData.getHelpBannerImage(), getHelpViewData.getHelpInstruction(), startSessionModel.getGlobalConfig().getCustomization().getTheme().getPrimary().getColor(), new Button(getHelpViewData.getBackToScanning(), startSessionModel.getGlobalConfig().getCustomization().getTheme().getPrimary().getButton().getPrimary().getColor(), startSessionModel.getGlobalConfig().getCustomization().getTheme().getPrimary().getButton().getPrimary().getBorderColor(), startSessionModel.getGlobalConfig().getCustomization().getTheme().getPrimary().getButton().getPrimary().getBackgroundColor()));
    }

    private final String getDimensionRatio(Context context, ScanType scanType, boolean isCardVertical) {
        String string;
        int i = WhenMappings.$EnumSwitchMapping$0[scanType.ordinal()];
        if (i == 1 || i == 2) {
            string = context.getResources().getString(isCardVertical ? R.string.socure_vertical_license_aspect_ratio_bg : R.string.socure_license_aspect_ratio_bg);
        } else if (i == 3) {
            string = context.getResources().getString(R.string.socure_passport_aspect_ratio_preview_bg);
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            string = context.getResources().getString(R.string.socure_selfie_preview_ratio);
        }
        Intrinsics.checkNotNullExpressionValue(string, "with(context) {\n        …}\n            }\n        }");
        return string;
    }

    public final void setVisibilityFocus$capturesdk_productionRelease(View view, FragmentScannerSocureBinding binding) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(binding, "binding");
        if (view instanceof PreviewView) {
            binding.bsContainer.helpView.setVisibility(8);
            binding.bsContainer.previewView.show$capturesdk_productionRelease();
        } else if (view instanceof HelpView) {
            binding.bsContainer.previewView.hide$capturesdk_productionRelease();
            binding.bsContainer.helpView.setVisibility(0);
        }
    }

    public final void showPreviewDbgImg$capturesdk_productionRelease(ImageView ivDbgPreviewScan, ImageView icSaveImages, Bitmap debugBitmap, final Function0<Unit> saveDebugImage) {
        Intrinsics.checkNotNullParameter(ivDbgPreviewScan, "ivDbgPreviewScan");
        Intrinsics.checkNotNullParameter(icSaveImages, "icSaveImages");
        Intrinsics.checkNotNullParameter(saveDebugImage, "saveDebugImage");
        if (!Utils.INSTANCE.showDebugImage$capturesdk_productionRelease() || debugBitmap == null || debugBitmap.isRecycled()) {
            LoggerKt.logD("SDLT_HELP_PREVIEW_UTILS", "showDebugImage: " + Utils.INSTANCE.showDebugImage$capturesdk_productionRelease() + " | debug img null: " + (debugBitmap == null) + " | recycled: " + (debugBitmap != null ? Boolean.valueOf(debugBitmap.isRecycled()) : null));
            ivDbgPreviewScan.setVisibility(8);
            icSaveImages.setVisibility(8);
            return;
        }
        LoggerKt.logD("SDLT_HELP_PREVIEW_UTILS", "showing DebugImage");
        icSaveImages.setOnClickListener(new View.OnClickListener() { // from class: com.socure.docv.capturesdk.common.utils.HelpPreviewUtils$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HelpPreviewUtils.showPreviewDbgImg$lambda$2(Function0.this, view);
            }
        });
        ivDbgPreviewScan.setVisibility(0);
        icSaveImages.setVisibility(0);
        ivDbgPreviewScan.setImageBitmap(debugBitmap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showPreviewDbgImg$lambda$2(final Function0 saveDebugImage, View view) {
        Intrinsics.checkNotNullParameter(saveDebugImage, "$saveDebugImage");
        LoggerKt.logD("SDLT_HELP_PREVIEW_UTILS", "Debug image saver clicked");
        Snackbar anchorView = Snackbar.make(view, "Export debug images to disk?", 0).setAction("YES", new View.OnClickListener() { // from class: com.socure.docv.capturesdk.common.utils.HelpPreviewUtils$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                HelpPreviewUtils.showPreviewDbgImg$lambda$2$lambda$1(Function0.this, view2);
            }
        }).setActionTextColor(-16711936).setAnchorView(view);
        Intrinsics.checkNotNullExpressionValue(anchorView, "make(it, \"Export debug i…       .setAnchorView(it)");
        anchorView.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showPreviewDbgImg$lambda$2$lambda$1(Function0 saveDebugImage, View view) {
        Intrinsics.checkNotNullParameter(saveDebugImage, "$saveDebugImage");
        saveDebugImage.invoke();
    }

    private final String getPreviewConfirmationText(ScanType scanType, NewLabels newLabels) {
        int i = WhenMappings.$EnumSwitchMapping$0[scanType.ordinal()];
        if (i == 1) {
            return newLabels.isAllInfoVisible();
        }
        if (i == 2) {
            return newLabels.isAllInfoVisibleBarcode();
        }
        if (i == 3) {
            return newLabels.isAllInfoVisiblePassport();
        }
        if (i == 4) {
            return newLabels.isYourFaceInFrame();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final String getScannerHelpText$capturesdk_productionRelease(ScanType scanType, NewLabels newLabels) {
        Intrinsics.checkNotNullParameter(scanType, "scanType");
        Intrinsics.checkNotNullParameter(newLabels, "newLabels");
        int i = WhenMappings.$EnumSwitchMapping$0[scanType.ordinal()];
        if (i == 1) {
            return newLabels.getPlaceFlatAndHoldId();
        }
        if (i == 2) {
            return newLabels.getFlipIdBarcode();
        }
        if (i == 3) {
            return newLabels.getPlaceFlatAndHoldPassport();
        }
        if (i == 4) {
            return newLabels.getMovePhoneFront();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final Pair<Integer, Integer> getPreviewProgressButtonColors(String primaryColor) {
        Intrinsics.checkNotNullParameter(primaryColor, "primaryColor");
        return new Pair<>(Integer.valueOf(getLightColor(primaryColor, 0.8f)), Integer.valueOf(getLightColor(primaryColor, 0.6f)));
    }

    private final int getLightColor(String color, float ratio) {
        return ColorUtils.blendARGB(Color.parseColor(color), -1, ratio);
    }

    public final Drawable getSecondaryButtonDrawable(Context context, String borderColor) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(borderColor, "borderColor");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setStroke((int) context.getResources().getDimension(R.dimen.stroke_button_stroke_width_socure), Color.parseColor(borderColor));
        gradientDrawable.setCornerRadius(context.getResources().getDimension(R.dimen.stroke_button_corner_radius_socure));
        gradientDrawable.setColor(0);
        return gradientDrawable;
    }
}
