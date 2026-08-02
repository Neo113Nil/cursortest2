package ru.ozon.fintech.preferences.ui.nativebridge;

import A90.c;
import A90.d;
import J90.h;
import J90.i;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.o;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import j.C7232a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\bB\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lru/ozon/fintech/preferences/ui/nativebridge/StatusResultView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "a", "fintech-preferences_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StatusResultView extends ConstraintLayout {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f97006n = 0;

    /* renamed from: c, reason: collision with root package name */
    private final int f97007c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f97008d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f97009e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f97010f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f97011g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f97012h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final CheckBox f97013i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final View f97014j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final View f97015k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final h f97016l;

    /* renamed from: m, reason: collision with root package name */
    @NotNull
    private final TextView f97017m;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a ERROR;
        public static final a IDLE;
        public static final a IN_PROGRESS;
        public static final a SUCCESS;

        static {
            a aVar = new a("IDLE", 0);
            IDLE = aVar;
            a aVar2 = new a("IN_PROGRESS", 1);
            IN_PROGRESS = aVar2;
            a aVar3 = new a("SUCCESS", 2);
            SUCCESS = aVar3;
            a aVar4 = new a("ERROR", 3);
            ERROR = aVar4;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
            $VALUES = aVarArr;
            $ENTRIES = Xc.b.a(aVarArr);
        }

        private a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f97018a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.IN_PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.IDLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f97018a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatusResultView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        int px = UiExtKt.toPx(12);
        this.f97007c = px;
        int px2 = UiExtKt.toPx(8);
        int px3 = UiExtKt.toPx(40);
        int px4 = UiExtKt.toPx(120);
        this.f97008d = k.b(new i(context, 0));
        this.f97009e = k.b(new D80.a(context, 1));
        this.f97010f = k.b(new A90.b(context, 1));
        InterfaceC4008j b11 = k.b(new c(context, 1));
        this.f97011g = b11;
        InterfaceC4008j b12 = k.b(new d(context, 1));
        this.f97012h = b12;
        CheckBox checkBox = new CheckBox(context);
        checkBox.setId(View.generateViewId());
        checkBox.setText(context.getString(R.string.append_results));
        checkBox.setTextSize(14.0f);
        checkBox.setTypeface(null, 1);
        checkBox.setTextColor(androidx.core.content.a.getColor(context, R.color.oz_semantic_text_primary));
        this.f97013i = checkBox;
        View view = new View(context);
        view.setId(View.generateViewId());
        int intValue = ((Number) b11.getValue()).intValue();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(intValue);
        gradientDrawable.setSize(px, px);
        view.setBackground(gradientDrawable);
        this.f97014j = view;
        View view2 = new View(context);
        view2.setId(View.generateViewId());
        view2.setBackgroundColor(androidx.core.content.a.getColor(context, R.color.aqua_300));
        this.f97015k = view2;
        h hVar = new h(context);
        hVar.setId(View.generateViewId());
        this.f97016l = hVar;
        TextView textView = new TextView(context);
        textView.setId(View.generateViewId());
        textView.setTextColor(((Number) b12.getValue()).intValue());
        textView.setLineSpacing(0.0f, 1.08f);
        textView.setPadding(px2, px2, 0, 0);
        textView.setGravity(8388659);
        textView.setFocusable(true);
        textView.setFocusableInTouchMode(true);
        textView.setLongClickable(true);
        textView.setTextSize(14.0f);
        textView.setHint(R.string.fintech_testing_nativebridge_append_result);
        textView.setHorizontallyScrolling(false);
        textView.setMovementMethod(null);
        this.f97017m = textView;
        setMinHeight(px4);
        setBackground(C7232a.a(context, R.drawable.fintech_ultra_round_bg));
        addView(view2, new ConstraintLayout.b(0, px3));
        addView(textView, new ConstraintLayout.b(0, -2));
        addView(checkBox, new ConstraintLayout.b(-2, -2));
        addView(view, new ConstraintLayout.b(px, px));
        addView(hVar, new ConstraintLayout.b(-2, 0));
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.p(this);
        dVar.s(view2.getId(), 3, 0, 3);
        dVar.s(view2.getId(), 6, 0, 6);
        dVar.s(view2.getId(), 7, 0, 7);
        dVar.t(checkBox.getId(), 6, view.getId(), 7, px2);
        dVar.s(checkBox.getId(), 3, view2.getId(), 3);
        dVar.s(checkBox.getId(), 4, view2.getId(), 4);
        dVar.t(view.getId(), 6, 0, 6, px2);
        dVar.s(view.getId(), 3, view2.getId(), 3);
        dVar.s(view.getId(), 4, view2.getId(), 4);
        dVar.t(hVar.getId(), 6, 0, 6, px2);
        dVar.s(hVar.getId(), 3, view2.getId(), 4);
        dVar.t(hVar.getId(), 4, 0, 4, px2);
        dVar.t(textView.getId(), 7, 0, 7, px2);
        dVar.s(textView.getId(), 6, hVar.getId(), 7);
        dVar.s(textView.getId(), 3, view2.getId(), 4);
        dVar.f(this);
        hVar.a(textView);
    }

    public final void b() {
        this.f97017m.setText("");
    }

    public final void c() {
        this.f97016l.b();
    }

    @NotNull
    public final String d() {
        String obj;
        CharSequence text = this.f97017m.getText();
        return (text == null || (obj = text.toString()) == null) ? "" : obj;
    }

    public final boolean e() {
        return this.f97013i.isChecked();
    }

    public final void f(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        boolean isChecked = this.f97013i.isChecked();
        TextView textView = this.f97017m;
        if (!isChecked) {
            textView.setText(text);
            return;
        }
        CharSequence text2 = textView.getText();
        Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
        if (text2.length() != 0) {
            textView.append("\n" + text);
        } else {
            textView.append(text + "\n");
        }
    }

    public final void g(@NotNull a status) {
        int intValue;
        Intrinsics.checkNotNullParameter(status, "status");
        int i11 = b.f97018a[status.ordinal()];
        if (i11 == 1) {
            intValue = ((Number) this.f97008d.getValue()).intValue();
        } else if (i11 == 2) {
            intValue = ((Number) this.f97009e.getValue()).intValue();
        } else if (i11 == 3) {
            intValue = ((Number) this.f97010f.getValue()).intValue();
        } else {
            if (i11 != 4) {
                throw new o();
            }
            intValue = ((Number) this.f97011g.getValue()).intValue();
        }
        View view = this.f97014j;
        Drawable background = view.getBackground();
        if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setColor(intValue);
            return;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(intValue);
        int i12 = this.f97007c;
        gradientDrawable.setSize(i12, i12);
        view.setBackground(gradientDrawable);
    }
}
