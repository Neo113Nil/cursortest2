package ru.ozon.uni.android.cell.listItem;

import Sc.InterfaceC3999a;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$styleable;
import ru.ozon.uni.android.cell.label.SmartLabel;
import ru.ozon.uni.android.cell.label.TitleSubtitleCellApi;
import ru.ozon.uni.android.cell.label.TitleSubtitleCellView;
import ru.ozon.uni.android.cell.listItem.data.ListCellWrapperPreset;
import ru.ozon.uni.android.cell.listItem.data.ListCellWrapperPresets;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.wrappers.mainaddonV3.MainAddonWrapperV3;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;

@InterfaceC3999a
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001e\n\u0002\u0010\r\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BE\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0019\u0010\u0018R\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b\u0010\u0010\u001bR*\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\r8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010#\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010)\u001a\u00020\u00038\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R.\u0010/\u001a\u0004\u0018\u00010\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R*\u00106\u001a\u0002052\u0006\u0010\u001c\u001a\u0002058\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010<\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR$\u0010C\u001a\u0004\u0018\u00010B8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR$\u0010I\u001a\u0004\u0018\u00010B8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bI\u0010D\u001a\u0004\bJ\u0010F\"\u0004\bK\u0010HR.\u0010L\u001a\u0004\u0018\u0001052\b\u0010\u001c\u001a\u0004\u0018\u0001058\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bL\u00107\u001a\u0004\bM\u00109\"\u0004\bN\u0010;R\"\u0010O\u001a\u00020\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bO\u0010=\u001a\u0004\bP\u0010?\"\u0004\bQ\u0010AR*\u0010R\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bR\u0010\u001a\u001a\u0004\bR\u0010\u001b\"\u0004\bS\u0010T¨\u0006U"}, d2 = {"Lru/ozon/uni/android/cell/listItem/OrderedListCellView;", "Lru/ozon/uni/android/wrappers/mainaddonV3/MainAddonWrapperV3;", "Lru/ozon/uni/android/cell/label/TitleSubtitleCellView;", "Lru/ozon/uni/android/cell/label/SmartLabel;", "Lru/ozon/uni/android/cell/label/TitleSubtitleCellApi;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "Lru/ozon/uni/android/cell/listItem/data/ListCellWrapperPreset;", "defPreset", "", "isRootWrapper", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;IILru/ozon/uni/android/cell/listItem/data/ListCellWrapperPreset;Z)V", "color", "", "alpha", "", "setTitleColor", "(IF)V", "setSubtitleColor", "Z", "()Z", AppMeasurementSdk.ConditionalUserProperty.VALUE, "preset", "Lru/ozon/uni/android/cell/listItem/data/ListCellWrapperPreset;", "getPreset", "()Lru/ozon/uni/android/cell/listItem/data/ListCellWrapperPreset;", "setPreset", "(Lru/ozon/uni/android/cell/listItem/data/ListCellWrapperPreset;)V", "mainView", "Lru/ozon/uni/android/cell/label/TitleSubtitleCellView;", "getMainView", "()Lru/ozon/uni/android/cell/label/TitleSubtitleCellView;", "setMainView", "(Lru/ozon/uni/android/cell/label/TitleSubtitleCellView;)V", "addonView", "Lru/ozon/uni/android/cell/label/SmartLabel;", "getAddonView", "()Lru/ozon/uni/android/cell/label/SmartLabel;", "setAddonView", "(Lru/ozon/uni/android/cell/label/SmartLabel;)V", "numberOfItem", "Ljava/lang/Integer;", "getNumberOfItem", "()Ljava/lang/Integer;", "setNumberOfItem", "(Ljava/lang/Integer;)V", "", "titleText", "Ljava/lang/CharSequence;", "getTitleText", "()Ljava/lang/CharSequence;", "setTitleText", "(Ljava/lang/CharSequence;)V", "titleNumberOfLines", "I", "getTitleNumberOfLines", "()I", "setTitleNumberOfLines", "(I)V", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "titleTruncatingMode", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "getTitleTruncatingMode", "()Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "setTitleTruncatingMode", "(Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;)V", "subtitleTruncatingMode", "getSubtitleTruncatingMode", "setSubtitleTruncatingMode", "subtitleText", "getSubtitleText", "setSubtitleText", "subtitleNumberOfLines", "getSubtitleNumberOfLines", "setSubtitleNumberOfLines", "isSubtitleVisible", "setSubtitleVisible", "(Z)V", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OrderedListCellView extends MainAddonWrapperV3<TitleSubtitleCellView, SmartLabel> implements TitleSubtitleCellApi, AtomView {

    @NotNull
    private SmartLabel addonView;
    private final boolean isRootWrapper;
    private boolean isSubtitleVisible;

    @NotNull
    private TitleSubtitleCellView mainView;
    private Integer numberOfItem;

    @NotNull
    private ListCellWrapperPreset preset;
    private int subtitleNumberOfLines;
    private CharSequence subtitleText;
    private CommonAtomLabelDTO.TruncatingMode subtitleTruncatingMode;
    private int titleNumberOfLines;

    @NotNull
    private CharSequence titleText;
    private CommonAtomLabelDTO.TruncatingMode titleTruncatingMode;

    public /* synthetic */ OrderedListCellView(Context context, AttributeSet attributeSet, int i11, int i12, ListCellWrapperPreset listCellWrapperPreset, boolean z11, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12, (i13 & 16) != 0 ? ListCellWrapperPresets.INSTANCE.getCenterEndTrailing500() : listCellWrapperPreset, (i13 & 32) != 0 ? true : z11);
    }

    @Override // ru.ozon.uni.android.wrappers.mainaddonV3.MainAddonWrapperV3
    /* renamed from: isRootWrapper, reason: from getter */
    public boolean getIsRootWrapper() {
        return this.isRootWrapper;
    }

    public final void setNumberOfItem(Integer num) {
        this.numberOfItem = num;
        getAddonView().setText(this.numberOfItem + ".");
    }

    public final void setPreset(@NotNull ListCellWrapperPreset value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.preset = value;
        getAddonView().withSmartLabelPreset(this.preset.getListAddonWrapperPreset().getSmartLabelPreset());
        getMainView().setPreset(this.preset.getTitleSubtitleWrapperPreset());
        setMainAddonSettings(this.preset.getListAddonWrapperPreset().getMainAddonSettings());
    }

    @Override // ru.ozon.uni.android.cell.label.TitleSubtitleCellApi
    public void setSubtitleColor(int color, float alpha) {
        getMainView().setSubtitleColor(color, alpha);
    }

    public void setSubtitleText(CharSequence charSequence) {
        this.subtitleText = charSequence;
        getMainView().setSubtitleText(this.subtitleText);
    }

    @Override // ru.ozon.uni.android.cell.label.TitleSubtitleCellApi
    public void setTitleColor(int color, float alpha) {
        getMainView().setTitleColor(color, alpha);
    }

    public void setTitleText(@NotNull CharSequence value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.titleText = value;
        getMainView().setTitleText(this.titleText);
    }

    @Override // ru.ozon.uni.android.wrappers.mainaddonV3.MainAddonWrapperV3
    @NotNull
    public SmartLabel getAddonView() {
        return this.addonView;
    }

    @Override // ru.ozon.uni.android.wrappers.mainaddonV3.MainAddonWrapperV3
    @NotNull
    public TitleSubtitleCellView getMainView() {
        return this.mainView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderedListCellView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12, @NotNull ListCellWrapperPreset defPreset, boolean z11) {
        super(context, attributeSet, i11, i12, defPreset.getListAddonWrapperPreset().getMainAddonSettings(), z11);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(defPreset, "defPreset");
        this.isRootWrapper = z11;
        this.preset = defPreset;
        int i13 = 0;
        this.mainView = new TitleSubtitleCellView(context, attributeSet, i13, 0, this.preset.getTitleSubtitleWrapperPreset(), false, 12, null);
        this.addonView = new SmartLabel(context, null, i13, 6, null).withSmartLabelPreset(this.preset.getListAddonWrapperPreset().getSmartLabelPreset());
        this.titleText = getMainView().getTitleText();
        this.titleNumberOfLines = Integer.MAX_VALUE;
        CommonAtomLabelDTO.TruncatingMode truncatingMode = CommonAtomLabelDTO.TruncatingMode.TAIL;
        this.titleTruncatingMode = truncatingMode;
        this.subtitleTruncatingMode = truncatingMode;
        this.subtitleText = getMainView().getSubtitleText();
        this.subtitleNumberOfLines = Integer.MAX_VALUE;
        this.isSubtitleVisible = getMainView().getIsSubtitleVisible();
        setViews();
        if (getIsRootWrapper()) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.OrderedListCellView);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
            if (getIsRootWrapper()) {
                String string = obtainStyledAttributes.getString(R$styleable.OrderedListCellView_mainText);
                setTitleText(string == null ? "" : string);
                setSubtitleText(obtainStyledAttributes.getString(R$styleable.OrderedListCellView_addonText));
                int color = obtainStyledAttributes.getColor(R$styleable.OrderedListCellView_addonTextColor, -1);
                if (color != -1) {
                    TitleSubtitleCellApi.DefaultImpls.setTitleColor$default(getMainView(), color, 0.0f, 2, null);
                }
                int color2 = obtainStyledAttributes.getColor(R$styleable.OrderedListCellView_addonTextColor, -1);
                if (color2 != -1) {
                    TitleSubtitleCellApi.DefaultImpls.setSubtitleColor$default(getMainView(), color2, 0.0f, 2, null);
                }
                if (color != -1) {
                    getAddonView().setTextColor(color);
                }
            }
            obtainStyledAttributes.recycle();
        }
        getAddonView().setWidth(UiExtKt.toPx(25, context));
    }
}
