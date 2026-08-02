package ru.ozon.uni.android.cell.dataAddon;

import Sc.InterfaceC3999a;
import Sc.o;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.helper.widget.Flow;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.R$styleable;
import ru.ozon.uni.android.cell.dataAddon.data.DataTitleSubtitleWrapperPreset;
import ru.ozon.uni.android.cell.dataAddon.data.DataTitleSubtitleWrapperPresets;
import ru.ozon.uni.android.cell.label.TitleSubtitleCellView;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.android.wrappers.main.BackgroundWrapper;
import ru.ozon.uni.android.wrappers.mainaddon.data.Axis;
import ru.ozon.uni.android.wrappers.mainaddonV3.MainAddonWrapperV3;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.utils.AtomLocatableView;

@InterfaceC3999a
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 \\2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005:\u0001\\BE\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0016\u001a\u00020\u0013H\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00132\b\u0010 \u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b!\u0010\u001aJ\u001d\u0010\"\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\"\u0010\u001fJ\u0017\u0010$\u001a\u00020\u00132\b\u0010#\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b$\u0010\u001aJ\u001f\u0010&\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\n2\b\b\u0002\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b&\u0010\u001fJ\u0015\u0010(\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\n¢\u0006\u0004\b(\u0010)R\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010*\u001a\u0004\b\u0010\u0010+R \u0010.\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u00130,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R*\u00101\u001a\u00020\r2\u0006\u00100\u001a\u00020\r8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R*\u00107\u001a\u00020\u000f2\u0006\u00100\u001a\u00020\u000f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010*\u001a\u0004\b7\u0010+\"\u0004\b8\u00109R*\u0010:\u001a\u00020\u00172\u0006\u00100\u001a\u00020\u00178\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010\u001aR\"\u0010?\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010E\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR.\u0010L\u001a\u0004\u0018\u00010K2\b\u00100\u001a\u0004\u0018\u00010K8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR.\u0010R\u001a\u0004\u0018\u00010K2\b\u00100\u001a\u0004\u0018\u00010K8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010M\u001a\u0004\bS\u0010O\"\u0004\bT\u0010QR$\u0010X\u001a\u00020\n2\u0006\u00100\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bU\u0010V\"\u0004\bW\u0010)R$\u0010[\u001a\u00020\n2\u0006\u00100\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bY\u0010V\"\u0004\bZ\u0010)¨\u0006]"}, d2 = {"Lru/ozon/uni/android/cell/dataAddon/DataTitleSubtitleCellView;", "Lru/ozon/uni/android/wrappers/mainaddonV3/MainAddonWrapperV3;", "Lru/ozon/uni/android/cell/label/TitleSubtitleCellView;", "Lru/ozon/uni/android/wrappers/main/BackgroundWrapper;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Lru/ozon/uni/atoms/utils/AtomLocatableView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "Lru/ozon/uni/android/cell/dataAddon/data/DataTitleSubtitleWrapperPreset;", "defPreset", "", "isRootWrapper", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;IILru/ozon/uni/android/cell/dataAddon/data/DataTitleSubtitleWrapperPreset;Z)V", "", "setAddonVisibility$uni_release", "()V", "setAddonVisibility", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "setTitle", "(Ljava/lang/String;)V", "color", "", "alpha", "setTitleColor", "(IF)V", "subtitle", "setSubtitle", "setSubtitleColor", "dataText", "setDataText", "dataTextColor", "setDataTextColor", "colorRes", "setDataBackgroundColor", "(I)V", "Z", "()Z", "Lkotlin/Function1;", "Landroid/view/View;", "locatorInitializer", "Lkotlin/jvm/functions/Function1;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "preset", "Lru/ozon/uni/android/cell/dataAddon/data/DataTitleSubtitleWrapperPreset;", "getPreset", "()Lru/ozon/uni/android/cell/dataAddon/data/DataTitleSubtitleWrapperPreset;", "setPreset", "(Lru/ozon/uni/android/cell/dataAddon/data/DataTitleSubtitleWrapperPreset;)V", "isDataVisible", "setDataVisible", "(Z)V", "locatorTag", "Ljava/lang/String;", "getLocatorTag", "()Ljava/lang/String;", "setLocatorTag", "mainView", "Lru/ozon/uni/android/cell/label/TitleSubtitleCellView;", "getMainView", "()Lru/ozon/uni/android/cell/label/TitleSubtitleCellView;", "setMainView", "(Lru/ozon/uni/android/cell/label/TitleSubtitleCellView;)V", "addonView", "Lru/ozon/uni/android/wrappers/main/BackgroundWrapper;", "getAddonView", "()Lru/ozon/uni/android/wrappers/main/BackgroundWrapper;", "setAddonView", "(Lru/ozon/uni/android/wrappers/main/BackgroundWrapper;)V", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "titleTruncatingMode", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "getTitleTruncatingMode", "()Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "setTitleTruncatingMode", "(Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;)V", "subtitleTruncatingMode", "getSubtitleTruncatingMode", "setSubtitleTruncatingMode", "getTitleNumberOfLines", "()I", "setTitleNumberOfLines", "titleNumberOfLines", "getSubtitleNumberOfLines", "setSubtitleNumberOfLines", "subtitleNumberOfLines", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DataTitleSubtitleCellView extends MainAddonWrapperV3<TitleSubtitleCellView, BackgroundWrapper> implements AtomView, AtomLocatableView {

    @NotNull
    private BackgroundWrapper addonView;
    private boolean isDataVisible;
    private final boolean isRootWrapper;

    @NotNull
    private final Function1<View, Unit> locatorInitializer;

    @NotNull
    private String locatorTag;

    @NotNull
    private TitleSubtitleCellView mainView;

    @NotNull
    private DataTitleSubtitleWrapperPreset preset;
    private CommonAtomLabelDTO.TruncatingMode subtitleTruncatingMode;
    private CommonAtomLabelDTO.TruncatingMode titleTruncatingMode;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/uni/android/cell/dataAddon/DataTitleSubtitleCellView$Companion;", "", "<init>", "()V", "DATA_LOCATOR_TAG", "", "DATA_TITLE_SUBTITLE_LOCATOR_TAG", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Axis.values().length];
            try {
                iArr[Axis.HORIZONTAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Axis.VERTICAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ DataTitleSubtitleCellView(Context context, AttributeSet attributeSet, int i11, int i12, DataTitleSubtitleWrapperPreset dataTitleSubtitleWrapperPreset, boolean z11, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12, (i13 & 16) != 0 ? DataTitleSubtitleWrapperPresets.INSTANCE.getData500CenterEnd500Control500Control500() : dataTitleSubtitleWrapperPreset, (i13 & 32) != 0 ? true : z11);
    }

    @Override // ru.ozon.uni.atoms.utils.AtomLocatableView
    @NotNull
    public String getLocatorTag() {
        return this.locatorTag;
    }

    @NotNull
    public final DataTitleSubtitleWrapperPreset getPreset() {
        return this.preset;
    }

    @Override // ru.ozon.uni.android.wrappers.mainaddonV3.MainAddonWrapperV3
    /* renamed from: isRootWrapper, reason: from getter */
    public boolean getIsRootWrapper() {
        return this.isRootWrapper;
    }

    @Override // ru.ozon.uni.android.wrappers.mainaddonV3.MainAddonWrapperV3
    public void setAddonVisibility$uni_release() {
        Flow flowByViewId;
        super.setAddonVisibility$uni_release();
        Flow flowByViewId2 = getFlowByViewId(getAddonView().getId());
        if (flowByViewId2 == null || (flowByViewId = getFlowByViewId(flowByViewId2.getId())) == null) {
            return;
        }
        Axis axis = getMainAddonSettings().getAxis();
        if (this.isDataVisible) {
            ViewExtKt.show(getAddonView());
            ViewExtKt.show(flowByViewId2);
            int i11 = WhenMappings.$EnumSwitchMapping$0[axis.ordinal()];
            if (i11 == 1) {
                flowByViewId.setHorizontalGap(UiExtKt.toPx(getMainAddonSettings().getGap()));
                return;
            } else {
                if (i11 != 2) {
                    throw new o();
                }
                flowByViewId.setVerticalGap(UiExtKt.toPx(getMainAddonSettings().getGap()));
                return;
            }
        }
        ViewExtKt.gone(getAddonView());
        ViewExtKt.gone(flowByViewId2);
        int i12 = WhenMappings.$EnumSwitchMapping$0[axis.ordinal()];
        if (i12 == 1) {
            flowByViewId.setHorizontalGap(0);
        } else {
            if (i12 != 2) {
                throw new o();
            }
            flowByViewId.setVerticalGap(0);
        }
    }

    public final void setDataBackgroundColor(int colorRes) {
        getAddonView().setCurrentBackgroundColor(new Color.Solid(colorRes));
    }

    public final void setDataText(String dataText) {
        setDataVisible(true ^ (dataText == null || dataText.length() == 0));
        ViewParent addonView = getAddonView();
        Intrinsics.g(addonView, "null cannot be cast to non-null type ru.ozon.uni.android.cell.dataAddon.DataViewApi");
        ((DataViewApi) addonView).setText(dataText);
    }

    public final void setDataTextColor(int dataTextColor, float alpha) {
        ViewParent addonView = getAddonView();
        Intrinsics.g(addonView, "null cannot be cast to non-null type ru.ozon.uni.android.cell.dataAddon.DataViewApi");
        ((DataViewApi) addonView).setTextColor(dataTextColor, alpha);
    }

    public final void setDataVisible(boolean z11) {
        this.isDataVisible = z11;
        changeAddonVisibilityIfNeeded();
    }

    @Override // ru.ozon.uni.atoms.utils.AtomLocatableView
    public void setLocatorTag(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.locatorTag = value;
        setContentDescription(value);
        this.locatorInitializer.invoke(getAddonView());
    }

    public final void setPreset(@NotNull DataTitleSubtitleWrapperPreset value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.preset = value;
        getMainView().setPreset(this.preset.getTitleSubtitleWrapperPreset());
        ViewParent addonView = getAddonView();
        Intrinsics.g(addonView, "null cannot be cast to non-null type ru.ozon.uni.android.cell.dataAddon.DataViewApi");
        ((DataViewApi) addonView).withPreset(this.preset.getDataAddonWrapperPreset().getAddonPreset());
        setMainAddonSettings(this.preset.getDataAddonWrapperPreset().getMainAddonSettings());
    }

    public final void setSubtitle(String subtitle) {
        getMainView().setSubtitleText(subtitle);
    }

    public final void setSubtitleColor(int color, float alpha) {
        getMainView().setSubtitleColor(color, alpha);
    }

    public final void setSubtitleNumberOfLines(int i11) {
        getMainView().setSubtitleNumberOfLines(i11);
    }

    public final void setSubtitleTruncatingMode(CommonAtomLabelDTO.TruncatingMode truncatingMode) {
        this.subtitleTruncatingMode = truncatingMode;
        getMainView().setSubtitleTruncatingMode(this.subtitleTruncatingMode);
    }

    public final void setTitle(@NotNull String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        getMainView().setTitleText(title);
    }

    public final void setTitleColor(int color, float alpha) {
        getMainView().setTitleColor(color, alpha);
    }

    public final void setTitleNumberOfLines(int i11) {
        getMainView().setTitleNumberOfLines(i11);
    }

    public final void setTitleTruncatingMode(CommonAtomLabelDTO.TruncatingMode truncatingMode) {
        this.titleTruncatingMode = truncatingMode;
        getMainView().setTitleTruncatingMode(this.titleTruncatingMode);
    }

    @Override // ru.ozon.uni.android.wrappers.mainaddonV3.MainAddonWrapperV3
    @NotNull
    public BackgroundWrapper getAddonView() {
        return this.addonView;
    }

    @Override // ru.ozon.uni.android.wrappers.mainaddonV3.MainAddonWrapperV3
    @NotNull
    public TitleSubtitleCellView getMainView() {
        return this.mainView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataTitleSubtitleCellView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12, @NotNull DataTitleSubtitleWrapperPreset defPreset, boolean z11) {
        super(context, attributeSet, i11, i12, defPreset.getDataAddonWrapperPreset().getMainAddonSettings(), z11);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(defPreset, "defPreset");
        this.isRootWrapper = z11;
        this.locatorInitializer = new DataTitleSubtitleCellView$locatorInitializer$1(this);
        this.preset = defPreset;
        this.isDataVisible = true;
        this.locatorTag = "dataTitleSubtitleCell";
        this.mainView = new TitleSubtitleCellView(context, attributeSet, 0, 0, this.preset.getTitleSubtitleWrapperPreset(), false, 12, null);
        this.addonView = new DataTitleSubtitleCellView$addonView$1(context, this, attributeSet, i11, i12);
        CommonAtomLabelDTO.TruncatingMode truncatingMode = CommonAtomLabelDTO.TruncatingMode.TAIL;
        this.titleTruncatingMode = truncatingMode;
        this.subtitleTruncatingMode = truncatingMode;
        setViews();
        if (getIsRootWrapper()) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.DataTitleSubtitleCellView);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
            setDataText(obtainStyledAttributes.getString(R$styleable.DataTitleSubtitleCellView_dataText));
            setTitleTruncatingMode(((CommonAtomLabelDTO.TruncatingMode[]) CommonAtomLabelDTO.TruncatingMode.getEntries().toArray(new CommonAtomLabelDTO.TruncatingMode[0]))[obtainStyledAttributes.getInt(R$styleable.DataTitleSubtitleCellView_mainTruncatingMode, truncatingMode.ordinal())]);
            setSubtitleTruncatingMode(((CommonAtomLabelDTO.TruncatingMode[]) CommonAtomLabelDTO.TruncatingMode.getEntries().toArray(new CommonAtomLabelDTO.TruncatingMode[0]))[obtainStyledAttributes.getInt(R$styleable.DataTitleSubtitleCellView_addonTruncatingMode, truncatingMode.ordinal())]);
            int color = obtainStyledAttributes.getColor(R$styleable.DataTitleSubtitleCellView_dataTextColor, -1);
            if (color != -1) {
                setDataTextColor(color, getAlpha());
            }
            int color2 = obtainStyledAttributes.getColor(R$styleable.DataTitleSubtitleCellView_dataBackgroundColor, -1);
            if (color2 != -1) {
                setDataBackgroundColor(color2);
            }
            obtainStyledAttributes.recycle();
        }
    }
}
