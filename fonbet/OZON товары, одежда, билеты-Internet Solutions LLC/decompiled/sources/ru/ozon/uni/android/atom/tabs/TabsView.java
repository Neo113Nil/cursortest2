package ru.ozon.uni.android.atom.tabs;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$style;
import ru.ozon.uni.R$styleable;
import ru.ozon.uni.android.ds.UniGlobalConfigKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.android.uikitsdk.ext.TypedArrayExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.utils.AtomLocatableView;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 A2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001AB1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0014\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0018R*\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R0\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R*\u0010(\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\u0018\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R*\u0010.\u001a\u00020-2\u0006\u0010\u001a\u001a\u00020-8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R.\u0010;\u001a\u0004\u0018\u00010:2\b\u0010\u001a\u001a\u0004\u0018\u00010:8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@¨\u0006B"}, d2 = {"Lru/ozon/uni/android/atom/tabs/TabsView;", "Landroid/widget/LinearLayout;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Lru/ozon/uni/atoms/utils/AtomLocatableView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "", "setDefaultBackgroundColor", "()V", "Lru/ozon/uni/android/atom/tabs/TabView;", "tab", "unselectTabs", "(Lru/ozon/uni/android/atom/tabs/TabView;)V", "addTab$uni_release", "addTab", "Landroid/content/Context;", "Landroid/util/AttributeSet;", "I", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "locatorTag", "Ljava/lang/String;", "getLocatorTag", "()Ljava/lang/String;", "setLocatorTag", "(Ljava/lang/String;)V", "Lkotlin/Function1;", "selectedTabListener", "Lkotlin/jvm/functions/Function1;", "getSelectedTabListener", "()Lkotlin/jvm/functions/Function1;", "setSelectedTabListener", "(Lkotlin/jvm/functions/Function1;)V", "style", "getStyle", "()I", "setStyle", "(I)V", "", "roundCorners", "Z", "getRoundCorners$uni_release", "()Z", "setRoundCorners$uni_release", "(Z)V", "Landroid/graphics/drawable/GradientDrawable;", "backgroundDrawable", "Landroid/graphics/drawable/GradientDrawable;", "Landroid/widget/LinearLayout$LayoutParams;", "tabLayoutParams", "Landroid/widget/LinearLayout$LayoutParams;", "Lru/ozon/uni/android/uikitsdk/Color;", "backgroundColor", "Lru/ozon/uni/android/uikitsdk/Color;", "getBackgroundColor", "()Lru/ozon/uni/android/uikitsdk/Color;", "setBackgroundColor", "(Lru/ozon/uni/android/uikitsdk/Color;)V", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TabsView extends LinearLayout implements AtomView, AtomLocatableView {
    private final AttributeSet attrs;
    private Color backgroundColor;

    @NotNull
    private final GradientDrawable backgroundDrawable;

    @NotNull
    private final Context context;
    private final int defStyleAttr;
    private final int defStyleRes;

    @NotNull
    private String locatorTag;
    private boolean roundCorners;
    private Function1<? super Integer, Unit> selectedTabListener;
    private int style;

    @NotNull
    private final LinearLayout.LayoutParams tabLayoutParams;
    public static final int $stable = 8;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TabsView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setDefaultBackgroundColor() {
        TypedArray obtainStyledAttributes = this.context.obtainStyledAttributes(this.attrs, R$styleable.TabsView, this.defStyleAttr, this.defStyleRes);
        Intrinsics.f(obtainStyledAttributes);
        TypedArrayExtKt.getGradientOrColor(obtainStyledAttributes, this.context, R$styleable.TabsView_backgroundGradient, R$styleable.TabsView_android_background, -1).applyTo(this.backgroundDrawable);
        obtainStyledAttributes.recycle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void unselectTabs(TabView tab) {
        Iterable<View> children = ViewGroupExtKt.children(this);
        ArrayList<View> arrayList = new ArrayList();
        for (View view : children) {
            if (!Intrinsics.d(view, tab)) {
                arrayList.add(view);
            }
        }
        for (View view2 : arrayList) {
            Intrinsics.g(view2, "null cannot be cast to non-null type ru.ozon.uni.android.atom.tabs.TabView");
            ((TabView) view2).setTabSelected(false);
        }
        Function1<? super Integer, Unit> function1 = this.selectedTabListener;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(indexOfChild(tab)));
        }
    }

    public final void addTab$uni_release() {
        TabView tabView = new TabView(this.context, null, 0, 0, 14, null);
        addView(tabView, this.tabLayoutParams);
        tabView.setOnSelectedListener(new TabsView$addTab$1(this, tabView));
        tabView.setLocatorTag("tabView" + indexOfChild(tabView));
    }

    @Override // ru.ozon.uni.atoms.utils.AtomLocatableView
    @NotNull
    public String getLocatorTag() {
        return this.locatorTag;
    }

    /* renamed from: getRoundCorners$uni_release, reason: from getter */
    public final boolean getRoundCorners() {
        return this.roundCorners;
    }

    public final void setBackgroundColor(Color color) {
        this.backgroundColor = color;
        if (color == null) {
            setDefaultBackgroundColor();
        } else {
            color.applyTo(this.backgroundDrawable);
        }
        invalidate();
    }

    @Override // ru.ozon.uni.atoms.utils.AtomLocatableView
    public void setLocatorTag(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        String str = value + "_TABS";
        this.locatorTag = str;
        setContentDescription(str);
    }

    public final void setRoundCorners$uni_release(boolean z11) {
        this.roundCorners = z11;
        this.backgroundDrawable.setCornerRadius(UiExtKt.toPxF(z11 ? 20 : 16));
    }

    public final void setSelectedTabListener(Function1<? super Integer, Unit> function1) {
        this.selectedTabListener = function1;
    }

    public /* synthetic */ TabsView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? R$style.Tab_Base : i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabsView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.attrs = attributeSet;
        this.defStyleAttr = i11;
        this.defStyleRes = i12;
        this.locatorTag = "TABS";
        this.style = R$style.Tab_Base;
        this.roundCorners = UniGlobalConfigKt.getRoundCornersFlag(context);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(UiExtKt.toPxF(this.roundCorners ? 20 : 16));
        this.backgroundDrawable = gradientDrawable;
        this.tabLayoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        setDefaultBackgroundColor();
        int px = UiExtKt.toPx(2);
        setPadding(px, px, px, px);
        setBackground(gradientDrawable);
        setOrientation(0);
        setGravity(17);
        setContentDescription(getLocatorTag());
        setClipToPadding(false);
    }
}
