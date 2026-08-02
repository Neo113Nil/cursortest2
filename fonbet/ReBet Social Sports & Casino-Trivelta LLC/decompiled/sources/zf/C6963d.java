package zf;

import L2.C1376a;
import L2.v;
import ag.A0;
import ag.B0;
import ag.C1956a0;
import ag.C1959c;
import ag.C1960c0;
import ag.C1961d;
import ag.C1966f0;
import ag.C1967g;
import ag.C1968g0;
import ag.C1974j0;
import ag.C1977l;
import ag.C1989r0;
import ag.C1992t;
import ag.C1997v0;
import ag.C1999w0;
import ag.C2001x0;
import ag.C2003y0;
import ag.C2005z0;
import ag.D0;
import ag.H;
import ag.H0;
import ag.K0;
import ag.M0;
import ag.O;
import ag.O0;
import ag.Q0;
import ag.V;
import ag.ViewOnClickListenerC1964e0;
import ag.ViewOnClickListenerC1984o0;
import ag.ViewOnClickListenerC1993t0;
import ag.W;
import ag.Y;
import ag.Z0;
import ag.a1;
import ag.b1;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.provider.Settings;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.text.util.Linkify;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import com.zoho.livechat.android.utils.C3937f;
import com.zoho.livechat.android.utils.L;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.livechat.android.utils.MobilistenUtil;
import com.zoho.livechat.android.utils.P;
import java.text.Bidi;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
import od.AbstractC5886l;
import od.r;
import od.t;
import og.k;
import org.jetbrains.annotations.NotNull;
import rd.C6218a;
import xe.C6822a;
import zf.C6963d;

/* renamed from: zf.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6963d extends RecyclerView.h {

    /* renamed from: i, reason: collision with root package name */
    public static final b f68921i;

    /* renamed from: l, reason: collision with root package name */
    public static int f68924l;

    /* renamed from: n, reason: collision with root package name */
    public static final float f68926n;

    /* renamed from: o, reason: collision with root package name */
    public static final Lazy f68927o;

    /* renamed from: p, reason: collision with root package name */
    public static final Lazy f68928p;

    /* renamed from: q, reason: collision with root package name */
    public static final Lazy f68929q;

    /* renamed from: a, reason: collision with root package name */
    public Function1 f68930a;

    /* renamed from: b, reason: collision with root package name */
    public Function0 f68931b;

    /* renamed from: c, reason: collision with root package name */
    public cg.e f68932c;

    /* renamed from: d, reason: collision with root package name */
    public cg.f f68933d;

    /* renamed from: e, reason: collision with root package name */
    public Hashtable f68934e;

    /* renamed from: f, reason: collision with root package name */
    public List f68935f;

    /* renamed from: g, reason: collision with root package name */
    public SalesIQChat f68936g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f68937h;

    /* renamed from: j, reason: collision with root package name */
    public static int f68922j = k.b(68);

    /* renamed from: k, reason: collision with root package name */
    public static int f68923k = k.b(56);

    /* renamed from: m, reason: collision with root package name */
    public static final Lazy f68925m = LazyKt.lazy(C1009d.f68947d);

    /* renamed from: zf.d$a */
    public static final class a extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final a f68938d = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            Resources resources;
            Application e10 = MobilistenInitProvider.INSTANCE.e();
            return Float.valueOf(TypedValue.applyDimension(0, 14.0f, (e10 == null || (resources = e10.getResources()) == null) ? null : resources.getDisplayMetrics()));
        }
    }

    /* renamed from: zf.d$b */
    public static final class b {

        /* renamed from: zf.d$b$a */
        public static final class a extends C3937f.g {

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ TextView f68939c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(TextView textView, C3937f.g.a aVar, C1008b c1008b) {
                super(aVar, c1008b);
                this.f68939c = textView;
            }

            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint ds) {
                Intrinsics.checkNotNullParameter(ds, "ds");
                ds.setColor(P.e(this.f68939c.getContext(), AbstractC5886l.f59782W0));
                ds.setUnderlineText(false);
            }
        }

        /* renamed from: zf.d$b$b, reason: collision with other inner class name */
        public static final class C1008b extends Lambda implements Function1 {

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Ref.BooleanRef f68940d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ SpannableStringBuilder f68941e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ Ref.ObjectRef f68942f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ Ref.IntRef f68943g;

            /* renamed from: h, reason: collision with root package name */
            public final /* synthetic */ TextView f68944h;

            /* renamed from: i, reason: collision with root package name */
            public final /* synthetic */ Function1 f68945i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1008b(Ref.BooleanRef booleanRef, SpannableStringBuilder spannableStringBuilder, Ref.ObjectRef objectRef, Ref.IntRef intRef, TextView textView, Function1 function1) {
                super(1);
                this.f68940d = booleanRef;
                this.f68941e = spannableStringBuilder;
                this.f68942f = objectRef;
                this.f68943g = intRef;
                this.f68944h = textView;
                this.f68945i = function1;
            }

            public final void a(Boolean bool) {
                Ref.BooleanRef booleanRef = this.f68940d;
                Intrinsics.checkNotNull(bool);
                booleanRef.element = bool.booleanValue();
                TextView textView = this.f68944h;
                Ref.IntRef intRef = this.f68943g;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f68941e);
                boolean z10 = this.f68940d.element;
                SpannableStringBuilder e10 = b.e(textView, intRef, spannableStringBuilder, z10, b.d(this.f68944h, z10), true);
                if (e10 != null) {
                    Object obj = this.f68942f.element;
                    if (obj != null) {
                        e10.setSpan(obj, this.f68943g.element, e10.length(), 33);
                    }
                    this.f68944h.setText(e10);
                    this.f68945i.invoke(Boolean.valueOf(this.f68940d.element));
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Boolean) obj);
                return Unit.INSTANCE;
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final Pair d(TextView textView, boolean z10) {
            return z10 ? new Pair(C3937f.g.a.LESS, textView.getContext().getString(t.f61124u4)) : new Pair(C3937f.g.a.MORE, textView.getContext().getString(t.f61130v4));
        }

        public static final SpannableStringBuilder e(TextView textView, Ref.IntRef intRef, SpannableStringBuilder spannableStringBuilder, boolean z10, Pair pair, boolean z11) {
            int length = spannableStringBuilder.length();
            b bVar = C6963d.f68921i;
            if (length <= bVar.q()) {
                intRef.element = spannableStringBuilder.length();
                textView.setMaxLines(Integer.MAX_VALUE);
                return null;
            }
            if (z10) {
                if (z11) {
                    ViewParent parent = textView.getParent();
                    Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                    C1376a c1376a = new C1376a();
                    c1376a.h0(200L);
                    v.a((ViewGroup) parent, c1376a);
                }
                spannableStringBuilder = f(spannableStringBuilder, intRef, pair);
                textView.setMaxLines(Integer.MAX_VALUE);
            } else {
                spannableStringBuilder.delete(bVar.q(), spannableStringBuilder.length());
                f(spannableStringBuilder, intRef, pair);
                textView.setMaxLines(5);
            }
            spannableStringBuilder.setSpan(new StyleSpan(2), intRef.element, spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new StyleSpan(1), intRef.element, spannableStringBuilder.length(), 33);
            return spannableStringBuilder;
        }

        public static final SpannableStringBuilder f(SpannableStringBuilder spannableStringBuilder, Ref.IntRef intRef, Pair pair) {
            if (pair.getFirst() == C3937f.g.a.MORE) {
                spannableStringBuilder.append("... ");
                intRef.element = spannableStringBuilder.length();
                SpannableStringBuilder append = spannableStringBuilder.append((CharSequence) pair.getSecond());
                Intrinsics.checkNotNull(append);
                return append;
            }
            spannableStringBuilder.append(" ");
            intRef.element = spannableStringBuilder.length();
            SpannableStringBuilder append2 = spannableStringBuilder.append((CharSequence) pair.getSecond());
            Intrinsics.checkNotNull(append2);
            return append2;
        }

        public static /* synthetic */ SpannableStringBuilder g(TextView textView, Ref.IntRef intRef, SpannableStringBuilder spannableStringBuilder, boolean z10, Pair pair, boolean z11, int i10, Object obj) {
            if ((i10 & 32) != 0) {
                z11 = false;
            }
            return e(textView, intRef, spannableStringBuilder, z10, pair, z11);
        }

        public static /* synthetic */ SpannableStringBuilder x(b bVar, TextView textView, String str, Message message, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                message = null;
            }
            Message message2 = message;
            if ((i10 & 16) != 0) {
                z11 = true;
            }
            boolean z13 = z11;
            if ((i10 & 32) != 0) {
                z12 = false;
            }
            return bVar.w(textView, str, message2, z10, z13, z12);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v2, types: [T, java.lang.Object, zf.d$b$a] */
        public final void c(TextView textView, SpannableStringBuilder text, boolean z10, Function1 onExpanded) {
            Intrinsics.checkNotNullParameter(textView, "textView");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(onExpanded, "onExpanded");
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            booleanRef.element = z10;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
            Ref.IntRef intRef = new Ref.IntRef();
            intRef.element = spannableStringBuilder.length();
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            boolean z11 = booleanRef.element;
            SpannableStringBuilder g10 = g(textView, intRef, spannableStringBuilder2, z11, d(textView, z11), false, 32, null);
            if (g10 == 0) {
                return;
            }
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ?? aVar = new a(textView, booleanRef.element ? C3937f.g.a.LESS : C3937f.g.a.MORE, new C1008b(booleanRef, spannableStringBuilder, objectRef, intRef, textView, onExpanded));
            objectRef.element = aVar;
            g10.setSpan(aVar, intRef.element, g10.length(), 33);
            textView.setText(g10);
        }

        public final Triple h(SpannableStringBuilder spannableStringBuilder, TextView textView, String str, Bidi bidi) {
            int i10;
            SpannableStringBuilder append = new SpannableStringBuilder(spannableStringBuilder).append((CharSequence) str);
            int i11 = 0;
            StaticLayout build = StaticLayout.Builder.obtain(append, 0, append.length(), textView.getPaint(), p()).build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            if (!bidi.isMixed()) {
                if (bidi.isLeftToRight()) {
                    textView.setTextDirection(3);
                } else {
                    textView.setTextDirection(4);
                }
            }
            if (og.i.d(Integer.valueOf(build.getLineCount()), 1)) {
                spannableStringBuilder.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                i11 = -1;
                i10 = -1;
            } else {
                boolean m10 = MobilistenUtil.m();
                if (bidi.isMixed() || ((!m10 && bidi.isLeftToRight()) || (m10 && bidi.isRightToLeft()))) {
                    spannableStringBuilder.append((CharSequence) str);
                    int length = spannableStringBuilder.length();
                    i11 = length - str.length();
                    i10 = length;
                } else {
                    spannableStringBuilder.insert(0, (CharSequence) str);
                    i10 = str.length();
                }
            }
            return new Triple(Integer.valueOf(i11), Integer.valueOf(i10), spannableStringBuilder);
        }

        public final int i() {
            return C6963d.f68924l;
        }

        public final Pair j(String str, TextView textView, boolean z10, Message message, boolean z11, boolean z12) {
            String sb2;
            SpannableStringBuilder spannableStringBuilder;
            String replace$default;
            String sb3;
            int intValue;
            int intValue2;
            String string;
            Intrinsics.checkNotNullParameter(textView, "textView");
            textView.setTextDirection(5);
            boolean m10 = MobilistenUtil.m();
            int k10 = k(textView.getContext(), z10);
            if (message != null ? Intrinsics.areEqual(message.isDeleted(), Boolean.TRUE) : false) {
                textView.setTextSize(s());
                StringBuilder sb4 = new StringBuilder();
                if (message.getConsecutiveDeletedCount() == null || message.getConsecutiveDeletedCount().longValue() <= 1) {
                    string = textView.getContext().getString(t.f61117t3);
                    Intrinsics.checkNotNull(string);
                } else {
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    Locale locale = Locale.getDefault();
                    String string2 = textView.getContext().getString(t.f61134w2);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    string = String.format(locale, string2, Arrays.copyOf(new Object[]{message.getConsecutiveDeletedCount()}, 1));
                    Intrinsics.checkNotNullExpressionValue(string, "format(...)");
                }
                sb4.append(string);
                sb4.append(Typography.nbsp);
                sb2 = sb4.toString();
            } else {
                textView.setTextSize(C6963d.f68926n);
                if (str != null) {
                    StringsKt.trim((CharSequence) str).toString();
                }
                StringBuilder sb5 = new StringBuilder();
                String str2 = (message != null ? message.getMeta() : null) != null && (message.getMeta().getMetaType() == Message.Meta.b.ContentModerationWaring || message.getMeta().getMetaType() == Message.Meta.b.ContentModerationClose || message.getMeta().getMetaType() == Message.Meta.b.ContentModerationBlock) ? "     " : null;
                if (str2 == null) {
                    str2 = "";
                }
                sb5.append(str2);
                sb5.append(str == null ? "" : str);
                sb2 = sb5.toString();
            }
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(sb2);
            Bidi bidi = new Bidi(spannableStringBuilder2.toString(), -2);
            Intrinsics.checkNotNull(message);
            SpannableStringBuilder spannableStringBuilder3 = spannableStringBuilder2;
            l(textView, z10, spannableStringBuilder3, message, z11);
            Linkify.addLinks(spannableStringBuilder3, 7);
            if (C6822a.q(false) != null) {
                C6822a.r();
            }
            if (z12) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append("    ");
                Boolean isEdited = message.isEdited();
                Boolean bool = Boolean.TRUE;
                String str3 = (Intrinsics.areEqual(isEdited, bool) && !Intrinsics.areEqual(message.isDeleted(), bool) ? this : null) != null ? textView.getContext().getString(t.f60994b3) + Typography.nbsp : null;
                if (str3 == null) {
                    str3 = "";
                }
                sb6.append(str3);
                if (bidi.isMixed()) {
                    String formattedClientTime = message.getFormattedClientTime();
                    replace$default = StringsKt.repeat(" ", og.i.k(formattedClientTime != null ? Integer.valueOf(formattedClientTime.length()) : null) + 10);
                } else {
                    String formattedClientTime2 = message.getFormattedClientTime();
                    replace$default = formattedClientTime2 != null ? StringsKt.replace$default(formattedClientTime2, " ", " ", false, 4, (Object) null) : null;
                }
                sb6.append(replace$default);
                String sb7 = sb6.toString();
                Bidi bidi2 = new Bidi(sb7, -2);
                if ((m10 && bidi.isRightToLeft() && bidi2.isRightToLeft()) || (!m10 && bidi.isLeftToRight() && bidi2.isLeftToRight())) {
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(' ');
                    sb8.append(sb7);
                    String str4 = !z10 && !Message.f.Companion.b(message.getStatus()) && !Intrinsics.areEqual(message.isDeleted(), bool) ? "        " : null;
                    sb8.append(str4 != null ? str4 : "");
                    sb3 = sb8.toString();
                } else {
                    StringBuilder sb9 = new StringBuilder();
                    String str5 = !z10 && !Message.f.Companion.b(message.getStatus()) && !Intrinsics.areEqual(message.isDeleted(), bool) ? "        " : null;
                    sb9.append(str5 != null ? str5 : "");
                    sb9.append(sb7);
                    sb9.append(' ');
                    sb3 = sb9.toString();
                }
                if (bidi.isMixed() || ((m10 && bidi.isLeftToRight()) || (!m10 && bidi.isRightToLeft()))) {
                    Triple h10 = h(spannableStringBuilder3, textView, sb3, bidi);
                    intValue = ((Number) h10.component1()).intValue();
                    intValue2 = ((Number) h10.component2()).intValue();
                    spannableStringBuilder3 = (SpannableStringBuilder) h10.component3();
                } else if (bidi.isLeftToRight() != bidi2.isLeftToRight()) {
                    Triple h11 = h(spannableStringBuilder3, textView, sb3, bidi);
                    intValue = ((Number) h11.component1()).intValue();
                    intValue2 = ((Number) h11.component2()).intValue();
                    spannableStringBuilder3 = (SpannableStringBuilder) h11.component3();
                } else {
                    spannableStringBuilder3.append((CharSequence) sb3);
                    intValue = spannableStringBuilder3.length() - sb3.length();
                    intValue2 = spannableStringBuilder3.length();
                }
                if (intValue != -1 && intValue2 != -1) {
                    spannableStringBuilder3.setSpan(System.getProperty("enabled_text_alignment_debugging") == null ? new ForegroundColorSpan(0) : new ForegroundColorSpan(-65536), intValue, intValue2, 33);
                    Object[] spans = spannableStringBuilder3.getSpans(intValue, intValue2, ClickableSpan.class);
                    Intrinsics.checkNotNullExpressionValue(spans, "getSpans(...)");
                    for (Object obj : spans) {
                        spannableStringBuilder3.removeSpan((ClickableSpan) obj);
                    }
                    int length = spannableStringBuilder3.length();
                    if (Intrinsics.areEqual(message.isDeleted(), Boolean.TRUE)) {
                        spannableStringBuilder3.setSpan(new RelativeSizeSpan(0.85714287f), intValue, intValue2, 33);
                        int e10 = P.e(textView.getContext(), z10 ? AbstractC5886l.f59735K1 : AbstractC5886l.f59739L1);
                        boolean z13 = bidi.isLeftToRight() != bidi2.isLeftToRight();
                        SpannableStringBuilder spannableStringBuilder4 = spannableStringBuilder3;
                        int indexOf$default = StringsKt.indexOf$default((CharSequence) spannableStringBuilder4, (char) 10680, 0, false, 6, (Object) null);
                        spannableStringBuilder = spannableStringBuilder4;
                        int i10 = 2;
                        if (z13) {
                            indexOf$default = 2;
                        }
                        Object styleSpan = new StyleSpan(2);
                        if (z13 && indexOf$default != 0) {
                            i10 = 0;
                        }
                        spannableStringBuilder.setSpan(styleSpan, i10, (length - sb3.length()) + ((z13 || indexOf$default == 0) ? 0 : -2), 34);
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(e10), 0, length - sb3.length(), 33);
                    } else {
                        spannableStringBuilder = spannableStringBuilder3;
                        spannableStringBuilder.setSpan(new RelativeSizeSpan(0.75f), intValue, intValue2, 33);
                    }
                    return new Pair(Integer.valueOf(k10), spannableStringBuilder);
                }
            }
            spannableStringBuilder = spannableStringBuilder3;
            return new Pair(Integer.valueOf(k10), spannableStringBuilder);
        }

        public final int k(Context context, boolean z10) {
            return z10 ? P.e(context, AbstractC5886l.f59782W0) : P.e(context, AbstractC5886l.f59804b1);
        }

        public final SpannableStringBuilder l(TextView textView, boolean z10, SpannableStringBuilder text, Message message, boolean z11) {
            List<Message.c> markdowns;
            Intrinsics.checkNotNullParameter(textView, "textView");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(message, "message");
            if (!z10 && ((markdowns = message.getMarkdowns()) == null || markdowns.size() != 1 || !message.getMarkdowns().contains(Message.c.Emojis))) {
                return text;
            }
            int e10 = P.e(textView.getContext(), AbstractC5886l.f59782W0);
            int e11 = P.e(textView.getContext(), AbstractC5886l.f59786X0);
            int e12 = P.e(textView.getContext(), AbstractC5886l.f59774U0);
            if (z11) {
                L.a(textView.getContext(), text, e10, e11, e12, false);
            } else {
                L.b(textView.getContext(), text, Integer.valueOf(e10), e11, e12, false, textView.getTextSize(), false, message.getMarkdowns());
            }
            L.l(text, "________________");
            return text;
        }

        public final Linkify.MatchFilter m() {
            return (Linkify.MatchFilter) C6963d.f68929q.getValue();
        }

        public final int n() {
            return C6963d.f68922j;
        }

        public final int o() {
            return C6963d.f68923k;
        }

        public final int p() {
            return ((Number) C6963d.f68925m.getValue()).intValue();
        }

        public final int q() {
            Object m147constructorimpl;
            try {
                Result.Companion companion = Result.INSTANCE;
                Application e10 = MobilistenInitProvider.INSTANCE.e();
                Intrinsics.checkNotNull(e10);
                m147constructorimpl = Result.m147constructorimpl(Float.valueOf(Settings.System.getFloat(e10.getContentResolver(), "font_scale")));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m153isFailureimpl(m147constructorimpl)) {
                m147constructorimpl = null;
            }
            Float f10 = (Float) m147constructorimpl;
            return (int) (70 / (f10 != null ? f10.floatValue() : 1.0f));
        }

        public final Linkify.TransformFilter r() {
            return (Linkify.TransformFilter) C6963d.f68928p.getValue();
        }

        public final float s() {
            return ((Number) C6963d.f68927o.getValue()).floatValue();
        }

        public final void t(int i10) {
            C6963d.f68924l = i10;
        }

        public final SpannableStringBuilder u(TextView textView, String str, Message message, boolean z10) {
            Intrinsics.checkNotNullParameter(textView, "textView");
            return x(this, textView, str, message, z10, false, false, 48, null);
        }

        public final SpannableStringBuilder v(TextView textView, String str, Message message, boolean z10, boolean z11) {
            Intrinsics.checkNotNullParameter(textView, "textView");
            return x(this, textView, str, message, z10, z11, false, 32, null);
        }

        public final SpannableStringBuilder w(TextView textView, String str, Message message, boolean z10, boolean z11, boolean z12) {
            Intrinsics.checkNotNullParameter(textView, "textView");
            if (str == null) {
                if (!(message != null ? Intrinsics.areEqual(message.isDeleted(), Boolean.TRUE) : false)) {
                    return null;
                }
            }
            Pair j10 = j(str, textView, z10, message, z12, z11);
            int intValue = ((Number) j10.getFirst()).intValue();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) j10.getSecond();
            textView.setText(spannableStringBuilder);
            textView.setLinkTextColor(intValue);
            return spannableStringBuilder;
        }

        public b() {
        }
    }

    /* renamed from: zf.d$c */
    public static final class c extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final c f68946d = new c();

        public c() {
            super(0);
        }

        public static final boolean c(CharSequence charSequence, int i10, int i11) {
            return true;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Linkify.MatchFilter invoke() {
            return new Linkify.MatchFilter() { // from class: zf.e
                @Override // android.text.util.Linkify.MatchFilter
                public final boolean acceptMatch(CharSequence charSequence, int i10, int i11) {
                    boolean c10;
                    c10 = C6963d.c.c(charSequence, i10, i11);
                    return c10;
                }
            };
        }
    }

    /* renamed from: zf.d$d, reason: collision with other inner class name */
    public static final class C1009d extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final C1009d f68947d = new C1009d();

        public C1009d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(C6963d.f68921i.i() - C6218a.b(112.0f));
        }
    }

    /* renamed from: zf.d$f */
    public static final class f extends h.b {

        /* renamed from: a, reason: collision with root package name */
        public final List f68949a;

        /* renamed from: b, reason: collision with root package name */
        public final List f68950b;

        public f(List oldData, List newData) {
            Intrinsics.checkNotNullParameter(oldData, "oldData");
            Intrinsics.checkNotNullParameter(newData, "newData");
            this.f68949a = oldData;
            this.f68950b = newData;
        }

        public static final Message a(f fVar, int i10) {
            Object m147constructorimpl;
            try {
                Result.Companion companion = Result.INSTANCE;
                m147constructorimpl = Result.m147constructorimpl((Message) fVar.f68949a.get(RangesKt.coerceAtLeast(i10 - 1, 0)));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m153isFailureimpl(m147constructorimpl)) {
                m147constructorimpl = null;
            }
            return (Message) m147constructorimpl;
        }

        public static final Message b(f fVar, int i10) {
            Object m147constructorimpl;
            try {
                Result.Companion companion = Result.INSTANCE;
                m147constructorimpl = Result.m147constructorimpl((Message) fVar.f68949a.get(RangesKt.coerceAtLeast(i10 - 1, 0)));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m153isFailureimpl(m147constructorimpl)) {
                m147constructorimpl = null;
            }
            return (Message) m147constructorimpl;
        }

        @Override // androidx.recyclerview.widget.h.b
        public boolean areContentsTheSame(int i10, int i11) {
            Message message = (Message) this.f68949a.get(i10);
            Message message2 = (Message) this.f68950b.get(i11);
            if (!c(message, message2)) {
                return false;
            }
            if ((message != null ? message.getStatus() : null) != (message2 != null ? message2.getStatus() : null)) {
                return false;
            }
            if (!Intrinsics.areEqual(message != null ? message.isRead() : null, message2 != null ? message2.isRead() : null)) {
                return false;
            }
            if (!Intrinsics.areEqual(message != null ? message.isEdited() : null, message2 != null ? message2.isEdited() : null)) {
                return false;
            }
            if (!Intrinsics.areEqual(message != null ? message.isDeleted() : null, message2 != null ? message2.isDeleted() : null)) {
                return false;
            }
            if (!Intrinsics.areEqual(message != null ? message.getDisplayName() : null, message2 != null ? message2.getDisplayName() : null)) {
                return false;
            }
            if (Intrinsics.areEqual(message != null ? Boolean.valueOf(message.isLastMessage()) : null, message2 != null ? Boolean.valueOf(message2.isLastMessage()) : null)) {
                return Intrinsics.areEqual(message != null ? message.getContent() : null, message2 != null ? message2.getContent() : null);
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.h.b
        public boolean areItemsTheSame(int i10, int i11) {
            Message message = (Message) this.f68949a.get(i10);
            Message message2 = (Message) this.f68950b.get(i11);
            if (!Intrinsics.areEqual(message != null ? message.getId() : null, message2 != null ? message2.getId() : null)) {
                return false;
            }
            Message b10 = b(this, i10);
            Message.g messageType = b10 != null ? b10.getMessageType() : null;
            Message.g gVar = Message.g.LoadMore;
            if (messageType == gVar) {
                Message a10 = a(this, i11);
                if ((a10 != null ? a10.getMessageType() : null) != gVar) {
                    return false;
                }
            }
            return Intrinsics.areEqual(message != null ? Boolean.valueOf(message.isRightAligned()) : null, message2 != null ? Boolean.valueOf(message2.isRightAligned()) : null);
        }

        public final boolean c(Message message, Message message2) {
            Message.Meta meta;
            Message.Meta meta2;
            Message.Extras extras;
            Message.Extras extras2;
            if (Intrinsics.areEqual(message != null ? message.getContent() : null, message2 != null ? message2.getContent() : null)) {
                if (Intrinsics.areEqual(message != null ? message.getAttachment() : null, message2 != null ? message2.getAttachment() : null)) {
                    if ((message != null ? message.getMessageType() : null) == (message2 != null ? message2.getMessageType() : null)) {
                        if (Intrinsics.areEqual(message != null ? message.isTyping() : null, message2 != null ? message2.isTyping() : null)) {
                            if (Intrinsics.areEqual(message != null ? message.getInfoMessage() : null, message2 != null ? message2.getInfoMessage() : null)) {
                                if (Intrinsics.areEqual(message != null ? message.getExtras() : null, message2 != null ? message2.getExtras() : null)) {
                                    if (Intrinsics.areEqual((message == null || (extras2 = message.getExtras()) == null) ? null : Long.valueOf(extras2.getLocalFileSize()), (message2 == null || (extras = message2.getExtras()) == null) ? null : Long.valueOf(extras.getLocalFileSize()))) {
                                        if (Intrinsics.areEqual(message != null ? Long.valueOf(message.getPreviousMessageTime()) : null, message2 != null ? Long.valueOf(message2.getPreviousMessageTime()) : null)) {
                                            if (Intrinsics.areEqual((message == null || (meta2 = message.getMeta()) == null) ? null : meta2.getHideInput(), (message2 == null || (meta = message2.getMeta()) == null) ? null : meta.getHideInput())) {
                                                if (Intrinsics.areEqual(message != null ? message.getTimeDifferenceContent() : null, message2 != null ? message2.getTimeDifferenceContent() : null)) {
                                                    if (Intrinsics.areEqual(message != null ? message.getComment() : null, message2 != null ? message2.getComment() : null)) {
                                                        String comment = message != null ? message.getComment() : null;
                                                        boolean z10 = comment == null || comment.length() == 0;
                                                        String comment2 = message2 != null ? message2.getComment() : null;
                                                        if (z10 == (comment2 == null || comment2.length() == 0)) {
                                                            if (Intrinsics.areEqual(message != null ? message.getConsecutiveDeletedCount() : null, message2 != null ? message2.getConsecutiveDeletedCount() : null)) {
                                                                if (Intrinsics.areEqual(message != null ? Boolean.valueOf(message.getCanShowSenderAvatar()) : null, message2 != null ? Boolean.valueOf(message2.getCanShowSenderAvatar()) : null)) {
                                                                    if (Intrinsics.areEqual(message != null ? Boolean.valueOf(message.getCanShowSenderName()) : null, message2 != null ? Boolean.valueOf(message2.getCanShowSenderName()) : null)) {
                                                                        return true;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.h.b
        public Object getChangePayload(int i10, int i11) {
            Message message = (Message) this.f68949a.get(i10);
            Message message2 = (Message) this.f68950b.get(i11);
            if (message != null && message2 != null && c(message, message2)) {
                if (!Intrinsics.areEqual(message.isRead(), message2.isRead()) || message.getStatus() != message2.getStatus()) {
                    LiveChatUtil.log("MessageStatus payload status " + message.getStatus() + ' ' + message2.getStatus());
                    return CollectionsKt.listOf(g.StatusChange);
                }
                if (!Intrinsics.areEqual(message.getContent(), message2.getContent())) {
                    LiveChatUtil.log("MessageStatus payload edited sent");
                    return CollectionsKt.listOf(g.MessageEdited, message2.getContent());
                }
                if (!Intrinsics.areEqual(message.getComment(), message2.getComment())) {
                    LiveChatUtil.log("MessageStatus payload comment edited sent");
                    return CollectionsKt.listOf(g.CommentEdited, message2.getComment());
                }
                if (message.isLastMessage() != message2.isLastMessage()) {
                    LiveChatUtil.log("MessageStatus payload last message sent");
                    return CollectionsKt.listOf(g.LastMessageChange);
                }
                if (!Intrinsics.areEqual(message.getConsecutiveDeletedCount(), message2.getConsecutiveDeletedCount())) {
                    LiveChatUtil.log("MessageStatus payload deleted message sent " + message.getConsecutiveDeletedCount() + ' ' + message2.getConsecutiveDeletedCount());
                    return CollectionsKt.listOf(g.MessageDeleted);
                }
            }
            return super.getChangePayload(i10, i11);
        }

        @Override // androidx.recyclerview.widget.h.b
        public int getNewListSize() {
            return this.f68950b.size();
        }

        @Override // androidx.recyclerview.widget.h.b
        public int getOldListSize() {
            return this.f68949a.size();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: zf.d$g */
    public static final class g {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ g[] $VALUES;
        public static final g StatusChange = new g("StatusChange", 0);
        public static final g Progress = new g("Progress", 1);
        public static final g LastMessageChange = new g("LastMessageChange", 2);
        public static final g MessageEdited = new g("MessageEdited", 3);
        public static final g CommentEdited = new g("CommentEdited", 4);
        public static final g MessageDeleted = new g("MessageDeleted", 5);

        private static final /* synthetic */ g[] $values() {
            return new g[]{StatusChange, Progress, LastMessageChange, MessageEdited, CommentEdited, MessageDeleted};
        }

        static {
            g[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private g(String str, int i10) {
        }

        @NotNull
        public static EnumEntries<g> getEntries() {
            return $ENTRIES;
        }

        public static g valueOf(String str) {
            return (g) Enum.valueOf(g.class, str);
        }

        public static g[] values() {
            return (g[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: zf.d$h */
    public static final class h {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ h[] $VALUES;

        @NotNull
        public static final a Companion;
        public static final h Info = new h("Info", 0);
        public static final h Typing = new h("Typing", 1);
        public static final h Loading = new h("Loading", 2);
        public static final h Default = new h("Default", 3);

        /* renamed from: zf.d$h$a */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final h a(int i10) {
                h hVar = h.Info;
                if (i10 == hVar.ordinal()) {
                    return hVar;
                }
                h hVar2 = h.Typing;
                if (i10 == hVar2.ordinal()) {
                    return hVar2;
                }
                h hVar3 = h.Loading;
                return i10 == hVar3.ordinal() ? hVar3 : h.Default;
            }

            public a() {
            }
        }

        private static final /* synthetic */ h[] $values() {
            return new h[]{Info, Typing, Loading, Default};
        }

        static {
            h[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
            Companion = new a(null);
        }

        private h(String str, int i10) {
        }

        @NotNull
        public static EnumEntries<h> getEntries() {
            return $ENTRIES;
        }

        public static h valueOf(String str) {
            return (h) Enum.valueOf(h.class, str);
        }

        public static h[] values() {
            return (h[]) $VALUES.clone();
        }
    }

    /* renamed from: zf.d$i */
    public /* synthetic */ class i {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[h.values().length];
            try {
                iArr[h.Info.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h.Typing.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h.Loading.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    static {
        Resources resources;
        DisplayMetrics displayMetrics = 0;
        displayMetrics = 0;
        f68921i = new b(displayMetrics);
        Application e10 = MobilistenInitProvider.INSTANCE.e();
        if (e10 != null && (resources = e10.getResources()) != null) {
            displayMetrics = resources.getDisplayMetrics();
        }
        f68926n = TypedValue.applyDimension(0, 16.0f, displayMetrics);
        f68927o = LazyKt.lazy(a.f68938d);
        f68928p = LazyKt.lazy(e.f68948d);
        f68929q = LazyKt.lazy(c.f68946d);
    }

    public C6963d() {
        this.f68935f = CollectionsKt.emptyList();
    }

    public static final boolean f(C6963d this$0, TextView textView, String url) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(url, "url");
        for (String str : CollectionsKt.listOf((Object[]) new String[]{"mailto:", "tel:"})) {
            if (StringsKt.startsWith$default(url, str, false, 2, (Object) null)) {
                url = StringsKt.removePrefix(url, (CharSequence) str);
            }
        }
        if (url.length() <= 0) {
            this$0 = null;
        }
        if (this$0 == null) {
            return true;
        }
        LiveChatUtil.copyText(url);
        return true;
    }

    public static final boolean g(TextView textView, String str) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        LiveChatUtil.handleUri(textView.getContext(), str);
        return true;
    }

    public static final void r(TextView textView, SpannableStringBuilder spannableStringBuilder, boolean z10, Function1 function1) {
        f68921i.c(textView, spannableStringBuilder, z10, function1);
    }

    public static final void v(C6963d c6963d, List list, int i10, RecyclerView.F f10, List list2) {
        Message message;
        Object obj;
        String obj2;
        Integer intOrNull;
        Object firstOrNull = CollectionsKt.firstOrNull((List<? extends Object>) list);
        if (firstOrNull == g.StatusChange) {
            Message message2 = (Message) c6963d.f68935f.get(i10);
            if (message2 != null) {
                if (f10 instanceof C1966f0) {
                    H.s1((H) f10, message2, true, null, 4, null);
                    return;
                }
                if (f10 instanceof V) {
                    H.s1((H) f10, message2, true, null, 4, null);
                    return;
                } else if (f10 instanceof C1992t) {
                    H.s1((H) f10, message2, true, null, 4, null);
                    return;
                } else {
                    if (f10 instanceof C1977l) {
                        H.s1((H) f10, message2, true, null, 4, null);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (firstOrNull == g.LastMessageChange) {
            Message message3 = (Message) c6963d.f68935f.get(i10);
            if (message3 != null) {
                Message.Meta meta = message3.getMeta();
                if ((meta != null ? meta.getInputCard() : null) != null) {
                    super.onBindViewHolder(f10, i10, list2);
                    return;
                }
                if (f10 instanceof Y) {
                    ((Y) f10).F1(c6963d.f68936g, message3);
                    return;
                }
                if (f10 instanceof H) {
                    int i11 = i10 - 1;
                    C6963d c6963d2 = i11 >= 0 ? c6963d : null;
                    H h10 = (H) f10;
                    c6963d.q(message3, (Message) (c6963d2 != null ? c6963d2.f68935f.get(i11) : null), h10);
                    h10.i1(message3);
                    return;
                }
                return;
            }
            return;
        }
        if (firstOrNull == g.Progress) {
            if (list.size() >= 3) {
                Object obj3 = list.get(1);
                String obj4 = obj3 != null ? obj3.toString() : null;
                if (obj4 == null || (obj = list.get(2)) == null || (obj2 = obj.toString()) == null || (intOrNull = StringsKt.toIntOrNull(obj2)) == null) {
                    return;
                }
                int intValue = intOrNull.intValue();
                if (f10 instanceof V) {
                    ((V) f10).r2(obj4, intValue);
                    return;
                } else if (f10 instanceof C1992t) {
                    ((C1992t) f10).o2(obj4, intValue);
                    return;
                } else {
                    if (f10 instanceof C1977l) {
                        ((C1977l) f10).g2(obj4, intValue);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (firstOrNull == g.MessageEdited) {
            Message message4 = (Message) c6963d.f68935f.get(i10);
            if (message4 == null || !(f10 instanceof C1966f0)) {
                return;
            }
            ((C1966f0) f10).P1(message4);
            return;
        }
        if (firstOrNull != g.CommentEdited) {
            if (firstOrNull == g.MessageDeleted && (message = (Message) c6963d.f68935f.get(i10)) != null && (f10 instanceof C1966f0)) {
                ((C1966f0) f10).P1(message);
                return;
            }
            return;
        }
        Message message5 = (Message) c6963d.f68935f.get(i10);
        if (message5 != null) {
            H h11 = f10 instanceof H ? (H) f10 : null;
            if (h11 != null) {
                h11.N1(message5);
            }
            if (f10 instanceof C1977l) {
                ((C1977l) f10).d1(message5);
            } else if (f10 instanceof C1992t) {
                ((C1992t) f10).d1(message5);
            } else if (f10 instanceof V) {
                ((V) f10).d1(message5);
            }
        }
    }

    public static final boolean w(C6963d this$0, RecyclerView.F viewHolder, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(viewHolder, "$viewHolder");
        cg.e eVar = this$0.f68932c;
        if (eVar == null) {
            return true;
        }
        eVar.N((Message) this$0.f68935f.get(((H) viewHolder).getBindingAdapterPosition()));
        return true;
    }

    public static final SpannableStringBuilder x(TextView textView, String str, Message message, boolean z10) {
        return f68921i.u(textView, str, message, z10);
    }

    public static final SpannableStringBuilder y(TextView textView, String str, Message message, boolean z10, boolean z11) {
        return f68921i.v(textView, str, message, z10, z11);
    }

    public static final SpannableStringBuilder z(TextView textView, String str, Message message, boolean z10, boolean z11, boolean z12) {
        return f68921i.w(textView, str, message, z10, z11, z12);
    }

    public final void A(Hashtable hashtable) {
        this.f68934e = hashtable;
    }

    public final void B(SalesIQChat salesIQChat) {
        this.f68936g = salesIQChat;
    }

    public final void C(cg.f fVar) {
        this.f68933d = fVar;
    }

    public final void D(List messages) {
        Intrinsics.checkNotNullParameter(messages, "messages");
        this.f68935f = CollectionsKt.toList(messages);
    }

    public final void E(List messages) {
        Intrinsics.checkNotNullParameter(messages, "messages");
        h.e b10 = androidx.recyclerview.widget.h.b(new f(this.f68935f, messages));
        this.f68935f = CollectionsKt.toList(messages);
        b10.c(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return this.f68935f.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i10) {
        Message message = (Message) this.f68935f.get(i10);
        Message.g messageType = message != null ? message.getMessageType() : null;
        if (messageType == null) {
            return h.Loading.ordinal();
        }
        if (messageType == Message.g.InfoMessage) {
            return h.Info.ordinal();
        }
        Boolean isTyping = message.isTyping();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.areEqual(isTyping, bool)) {
            return h.Typing.ordinal();
        }
        return (Intrinsics.areEqual(message.isDeleted(), bool) ? Message.g.Text.ordinal() : messageType.ordinal()) + 10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.F holder, int i10, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        if (payloads.isEmpty()) {
            super.onBindViewHolder(holder, i10, payloads);
            return;
        }
        for (Object obj : payloads) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            v(this, (List) obj, i10, holder, payloads);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x049d  */
    @Override // androidx.recyclerview.widget.RecyclerView.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RecyclerView.F onCreateViewHolder(ViewGroup parent, int i10) {
        final RecyclerView.F c1966f0;
        C6963d c6963d;
        RecyclerView.F o02;
        C6963d c6963d2;
        RecyclerView.F c2005z0;
        Intrinsics.checkNotNullParameter(parent, "parent");
        Object systemService = parent.getContext().getSystemService("layout_inflater");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        LayoutInflater layoutInflater = (LayoutInflater) systemService;
        int i11 = i.$EnumSwitchMapping$0[h.Companion.a(i10).ordinal()];
        if (i11 == 1) {
            View inflate = layoutInflater.inflate(r.f60783f0, parent, false);
            Intrinsics.checkNotNull(inflate, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            return new W((ConstraintLayout) inflate);
        }
        if (i11 == 2) {
            View inflate2 = layoutInflater.inflate(r.f60746K, parent, false);
            Intrinsics.checkNotNull(inflate2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            ConstraintLayout constraintLayout = (ConstraintLayout) inflate2;
            View inflate3 = P.k(constraintLayout.getContext()) == 0 ? layoutInflater.inflate(r.f60743I0, parent, false) : layoutInflater.inflate(r.f60745J0, parent, false);
            Intrinsics.checkNotNull(inflate3, "null cannot be cast to non-null type android.widget.LinearLayout");
            LinearLayout linearLayout = (LinearLayout) inflate3;
            constraintLayout.addView(linearLayout);
            return new C1968g0(constraintLayout, linearLayout);
        }
        if (i11 == 3) {
            View inflate4 = layoutInflater.inflate(r.f60751M0, parent, false);
            Intrinsics.checkNotNullExpressionValue(inflate4, "inflate(...)");
            return new C1961d(inflate4);
        }
        int i12 = i10 - 10;
        View inflate5 = layoutInflater.inflate(r.f60746K, parent, false);
        Intrinsics.checkNotNull(inflate5, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        ConstraintLayout constraintLayout2 = (ConstraintLayout) inflate5;
        if (i12 == Message.g.Text.ordinal() || i12 == Message.g.Question.ordinal() || i12 == Message.g.ReopenQuestion.ordinal() || i12 == Message.g.WidgetCompany.ordinal()) {
            View inflate6 = layoutInflater.inflate(r.f60773a0, parent, false);
            Intrinsics.checkNotNull(inflate6, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            ConstraintLayout constraintLayout3 = (ConstraintLayout) inflate6;
            constraintLayout2.addView(constraintLayout3);
            c1966f0 = new C1966f0(constraintLayout2, constraintLayout3, this.f68932c);
        } else if (i12 == Message.g.Image.ordinal() || i12 == Message.g.Video.ordinal()) {
            View inflate7 = layoutInflater.inflate(r.f60781e0, parent, false);
            Intrinsics.checkNotNull(inflate7, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            ConstraintLayout constraintLayout4 = (ConstraintLayout) inflate7;
            constraintLayout2.addView(constraintLayout4);
            c1966f0 = new V(constraintLayout2, constraintLayout4, this.f68932c);
        } else if (i12 == Message.g.File.ordinal()) {
            View inflate8 = layoutInflater.inflate(r.f60775b0, parent, false);
            Intrinsics.checkNotNull(inflate8, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            ConstraintLayout constraintLayout5 = (ConstraintLayout) inflate8;
            constraintLayout2.addView(constraintLayout5);
            c1966f0 = new C1977l(constraintLayout2, constraintLayout5, this.f68932c);
        } else if (i12 == Message.g.Audio.ordinal()) {
            View inflate9 = layoutInflater.inflate(r.f60777c0, parent, false);
            Intrinsics.checkNotNull(inflate9, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            ConstraintLayout constraintLayout6 = (ConstraintLayout) inflate9;
            constraintLayout2.addView(constraintLayout6);
            c1966f0 = new C1992t(constraintLayout2, constraintLayout6, this.f68932c, this.f68930a);
        } else if (i12 == Message.g.WidgetLocation.ordinal()) {
            View inflate10 = layoutInflater.inflate(r.f60815v0, parent, false);
            Intrinsics.checkNotNull(inflate10, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            ConstraintLayout constraintLayout7 = (ConstraintLayout) inflate10;
            constraintLayout2.addView(constraintLayout7);
            c1966f0 = new H0(constraintLayout2, constraintLayout7, this.f68933d, this.f68932c);
        } else if (i12 == Message.g.Location.ordinal()) {
            View inflate11 = layoutInflater.inflate(r.f60785g0, parent, false);
            Intrinsics.checkNotNull(inflate11, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            ConstraintLayout constraintLayout8 = (ConstraintLayout) inflate11;
            constraintLayout2.addView(constraintLayout8);
            c1966f0 = new C1956a0(constraintLayout2, constraintLayout8);
        } else if (i12 == Message.g.Feedback.ordinal()) {
            View inflate12 = layoutInflater.inflate(r.f60779d0, parent, false);
            Intrinsics.checkNotNull(inflate12, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            ConstraintLayout constraintLayout9 = (ConstraintLayout) inflate12;
            constraintLayout2.addView(constraintLayout9);
            c1966f0 = new O(constraintLayout2, constraintLayout9);
        } else if (i12 == Message.g.RequestLog.ordinal()) {
            View inflate13 = layoutInflater.inflate(r.f60787h0, parent, false);
            Intrinsics.checkNotNull(inflate13, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            ConstraintLayout constraintLayout10 = (ConstraintLayout) inflate13;
            constraintLayout2.addView(constraintLayout10);
            c1966f0 = new C1960c0(constraintLayout2, constraintLayout10, this.f68932c);
        } else {
            if (i12 != Message.g.InlineForm.ordinal()) {
                if (i12 == Message.g.WidgetSingleSelection.ordinal() || i12 == Message.g.WidgetMultiSelect.ordinal()) {
                    View inflate14 = layoutInflater.inflate(r.f60821y0, parent, false);
                    Intrinsics.checkNotNull(inflate14, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                    ConstraintLayout constraintLayout11 = (ConstraintLayout) inflate14;
                    constraintLayout2.addView(constraintLayout11);
                    o02 = new O0(constraintLayout2, constraintLayout11, this.f68933d, Message.g.values()[i12], this.f68932c);
                } else if (i12 == Message.g.WidgetHappinessRating.ordinal()) {
                    View inflate15 = layoutInflater.inflate(r.f60797m0, parent, false);
                    Intrinsics.checkNotNull(inflate15, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                    ConstraintLayout constraintLayout12 = (ConstraintLayout) inflate15;
                    constraintLayout2.addView(constraintLayout12);
                    c1966f0 = new ViewOnClickListenerC1993t0(constraintLayout2, constraintLayout12, this.f68933d, this.f68932c);
                } else if (i12 == Message.g.WidgetLikeRating.ordinal()) {
                    View inflate16 = layoutInflater.inflate(r.f60811t0, parent, false);
                    Intrinsics.checkNotNull(inflate16, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                    ConstraintLayout constraintLayout13 = (ConstraintLayout) inflate16;
                    constraintLayout2.addView(constraintLayout13);
                    c1966f0 = new B0(constraintLayout2, constraintLayout13, this.f68933d, this.f68932c);
                } else if (i12 == Message.g.WidgetStarRating.ordinal()) {
                    View inflate17 = layoutInflater.inflate(r.f60729B0, parent, false);
                    Intrinsics.checkNotNull(inflate17, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                    ConstraintLayout constraintLayout14 = (ConstraintLayout) inflate17;
                    constraintLayout2.addView(constraintLayout14);
                    c1966f0 = new a1(constraintLayout2, constraintLayout14, this.f68933d, this.f68932c);
                } else if (i12 == Message.g.WidgetCalendar.ordinal() || i12 == Message.g.WidgetRangeCalendar.ordinal()) {
                    View inflate18 = layoutInflater.inflate(r.f60793k0, parent, false);
                    Intrinsics.checkNotNull(inflate18, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                    ConstraintLayout constraintLayout15 = (ConstraintLayout) inflate18;
                    constraintLayout2.addView(constraintLayout15);
                    c1966f0 = new ViewOnClickListenerC1984o0(constraintLayout2, constraintLayout15, this.f68933d, this.f68932c);
                } else if (i12 == Message.g.WidgetTimeslots.ordinal() || i12 == Message.g.WidgetDateTimeslots.ordinal()) {
                    View inflate19 = layoutInflater.inflate(r.f60731C0, parent, false);
                    Intrinsics.checkNotNull(inflate19, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                    ConstraintLayout constraintLayout16 = (ConstraintLayout) inflate19;
                    constraintLayout2.addView(constraintLayout16);
                    c1966f0 = new b1(constraintLayout2, constraintLayout16, this.f68933d, this.f68932c);
                } else if (i12 == Message.g.WidgetSlider.ordinal() || i12 == Message.g.WidgetRangeSlider.ordinal()) {
                    View inflate20 = layoutInflater.inflate(r.f60727A0, parent, false);
                    Intrinsics.checkNotNull(inflate20, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                    ConstraintLayout constraintLayout17 = (ConstraintLayout) inflate20;
                    constraintLayout2.addView(constraintLayout17);
                    o02 = new Z0(constraintLayout2, constraintLayout17, this.f68933d, Message.g.values()[i12], this.f68932c);
                } else if (i12 == Message.g.WidgetLinks.ordinal()) {
                    View inflate21 = layoutInflater.inflate(r.f60813u0, parent, false);
                    Intrinsics.checkNotNull(inflate21, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                    ConstraintLayout constraintLayout18 = (ConstraintLayout) inflate21;
                    constraintLayout2.addView(constraintLayout18);
                    c1966f0 = new D0(constraintLayout2, constraintLayout18, this.f68932c);
                } else if (i12 == Message.g.WidgetImage.ordinal() || i12 == Message.g.WidgetVideo.ordinal()) {
                    View inflate22 = layoutInflater.inflate(r.f60799n0, parent, false);
                    Intrinsics.checkNotNull(inflate22, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                    ConstraintLayout constraintLayout19 = (ConstraintLayout) inflate22;
                    constraintLayout2.addView(constraintLayout19);
                    c1966f0 = new C1997v0(constraintLayout2, constraintLayout19, this.f68932c);
                } else {
                    if (i12 != Message.g.WidgetArticles.ordinal()) {
                        if (i12 == Message.g.WidgetInputName.ordinal()) {
                            View inflate23 = layoutInflater.inflate(r.f60803p0, parent, false);
                            Intrinsics.checkNotNull(inflate23, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                            ConstraintLayout constraintLayout20 = (ConstraintLayout) inflate23;
                            constraintLayout2.addView(constraintLayout20);
                            c6963d2 = this;
                            c2005z0 = new C2001x0(constraintLayout2, constraintLayout20, this.f68933d, c6963d2, this.f68932c);
                        } else {
                            c6963d2 = this;
                            if (i12 == Message.g.WidgetInputEmail.ordinal()) {
                                View inflate24 = layoutInflater.inflate(r.f60801o0, parent, false);
                                Intrinsics.checkNotNull(inflate24, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                                ConstraintLayout constraintLayout21 = (ConstraintLayout) inflate24;
                                constraintLayout2.addView(constraintLayout21);
                                c2005z0 = new C1999w0(constraintLayout2, constraintLayout21, c6963d2.f68933d, c6963d2, c6963d2.f68932c);
                            } else if (i12 == Message.g.WidgetInputUrl.ordinal()) {
                                View inflate25 = layoutInflater.inflate(r.f60809s0, parent, false);
                                Intrinsics.checkNotNull(inflate25, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                                ConstraintLayout constraintLayout22 = (ConstraintLayout) inflate25;
                                constraintLayout2.addView(constraintLayout22);
                                c2005z0 = new A0(constraintLayout2, constraintLayout22, c6963d2.f68933d, c6963d2, c6963d2.f68932c);
                            } else {
                                if (i12 != Message.g.WidgetInputTelephone.ordinal()) {
                                    if (i12 != Message.g.WidgetInputPassword.ordinal()) {
                                        c6963d = c6963d2;
                                        if (i12 == Message.g.WidgetSingleProduct.ordinal()) {
                                            View inflate26 = layoutInflater.inflate(r.f60823z0, parent, false);
                                            Intrinsics.checkNotNull(inflate26, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                                            ConstraintLayout constraintLayout23 = (ConstraintLayout) inflate26;
                                            constraintLayout2.addView(constraintLayout23);
                                            c1966f0 = new Q0(constraintLayout2, constraintLayout23, c6963d.f68932c);
                                        } else if (i12 == Message.g.WidgetMultipleProduct.ordinal()) {
                                            View inflate27 = layoutInflater.inflate(r.f60817w0, parent, false);
                                            Intrinsics.checkNotNull(inflate27, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                                            ConstraintLayout constraintLayout24 = (ConstraintLayout) inflate27;
                                            constraintLayout2.addView(constraintLayout24);
                                            o02 = new K0(constraintLayout2, constraintLayout24, c6963d.f68933d, c6963d.f68932c, c6963d.f68930a, c6963d.f68931b);
                                        } else if (i12 == Message.g.WidgetInputDropdown.ordinal()) {
                                            View inflate28 = layoutInflater.inflate(r.f60795l0, parent, false);
                                            Intrinsics.checkNotNull(inflate28, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                                            ConstraintLayout constraintLayout25 = (ConstraintLayout) inflate28;
                                            constraintLayout2.addView(constraintLayout25);
                                            c1966f0 = new C1989r0(constraintLayout2, constraintLayout25, c6963d.f68933d, c6963d.f68932c);
                                        } else if (i12 == Message.g.WidgetSuggestions.ordinal()) {
                                            View inflate29 = layoutInflater.inflate(r.f60819x0, parent, false);
                                            Intrinsics.checkNotNull(inflate29, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                                            ConstraintLayout constraintLayout26 = (ConstraintLayout) inflate29;
                                            constraintLayout2.addView(constraintLayout26);
                                            c1966f0 = new M0(constraintLayout2, constraintLayout26, c6963d.f68933d, c6963d.f68932c);
                                        } else if (i12 == Message.g.Article.ordinal()) {
                                            View inflate30 = layoutInflater.inflate(r.f60789i0, parent, false);
                                            Intrinsics.checkNotNull(inflate30, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                                            ConstraintLayout constraintLayout27 = (ConstraintLayout) inflate30;
                                            constraintLayout2.addView(constraintLayout27);
                                            c1966f0 = new ViewOnClickListenerC1964e0(constraintLayout2, constraintLayout27, c6963d.f68933d, c6963d.f68932c);
                                        } else if (i12 == Message.g.WidgetFileUpload.ordinal()) {
                                            View inflate31 = layoutInflater.inflate(r.f60771Z, parent, false);
                                            constraintLayout2.addView(inflate31);
                                            Intrinsics.checkNotNull(inflate31, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                                            c1966f0 = new C1967g(constraintLayout2, (ConstraintLayout) inflate31, c6963d.f68932c);
                                        } else if (i12 == Message.g.LoadMore.ordinal()) {
                                            View inflate32 = layoutInflater.inflate(r.f60753N0, parent, false);
                                            Intrinsics.checkNotNullExpressionValue(inflate32, "inflate(...)");
                                            c1966f0 = new C1959c(inflate32, c6963d.f68932c);
                                        } else {
                                            View inflate33 = layoutInflater.inflate(r.f60773a0, parent, false);
                                            Intrinsics.checkNotNull(inflate33, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                                            ConstraintLayout constraintLayout28 = (ConstraintLayout) inflate33;
                                            constraintLayout2.addView(constraintLayout28);
                                            c1966f0 = new C1966f0(constraintLayout2, constraintLayout28, c6963d.f68932c);
                                        }
                                        if (c1966f0 instanceof H) {
                                            H h10 = (H) c1966f0;
                                            h10.U1(c6963d.f68933d);
                                            h10.r0().setOnLongClickListener(new View.OnLongClickListener() { // from class: zf.a
                                                @Override // android.view.View.OnLongClickListener
                                                public final boolean onLongClick(View view) {
                                                    boolean w10;
                                                    w10 = C6963d.w(C6963d.this, c1966f0, view);
                                                    return w10;
                                                }
                                            });
                                        }
                                        return c1966f0;
                                    }
                                    View inflate34 = layoutInflater.inflate(r.f60805q0, parent, false);
                                    Intrinsics.checkNotNull(inflate34, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                                    ConstraintLayout constraintLayout29 = (ConstraintLayout) inflate34;
                                    constraintLayout2.addView(constraintLayout29);
                                    o02 = new C2003y0(constraintLayout2, constraintLayout29, c6963d2.f68933d, c6963d2, c6963d2.f68932c);
                                    c6963d = c6963d2;
                                    c1966f0 = o02;
                                    if (c1966f0 instanceof H) {
                                    }
                                    return c1966f0;
                                }
                                View inflate35 = layoutInflater.inflate(r.f60807r0, parent, false);
                                Intrinsics.checkNotNull(inflate35, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                                ConstraintLayout constraintLayout30 = (ConstraintLayout) inflate35;
                                constraintLayout2.addView(constraintLayout30);
                                c2005z0 = new C2005z0(constraintLayout2, constraintLayout30, c6963d2.f68933d, c6963d2, c6963d2.f68932c);
                            }
                        }
                        c1966f0 = c2005z0;
                        c6963d = c6963d2;
                        if (c1966f0 instanceof H) {
                        }
                        return c1966f0;
                    }
                    View inflate36 = layoutInflater.inflate(r.f60791j0, parent, false);
                    Intrinsics.checkNotNull(inflate36, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
                    ConstraintLayout constraintLayout31 = (ConstraintLayout) inflate36;
                    constraintLayout2.addView(constraintLayout31);
                    c1966f0 = new C1974j0(constraintLayout2, constraintLayout31, this.f68932c);
                }
                c6963d = this;
                c1966f0 = o02;
                if (c1966f0 instanceof H) {
                }
                return c1966f0;
            }
            View inflate37 = layoutInflater.inflate(r.f60787h0, parent, false);
            Intrinsics.checkNotNull(inflate37, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            ConstraintLayout constraintLayout32 = (ConstraintLayout) inflate37;
            constraintLayout2.addView(constraintLayout32);
            c1966f0 = new Y(constraintLayout2, constraintLayout32, this.f68932c);
        }
        c6963d = this;
        if (c1966f0 instanceof H) {
        }
        return c1966f0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onViewAttachedToWindow(RecyclerView.F holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof C2001x0) {
            ((C2001x0) holder).c2();
            return;
        }
        if (holder instanceof C1999w0) {
            ((C1999w0) holder).c2();
            return;
        }
        if (holder instanceof A0) {
            ((A0) holder).d2();
        } else if (holder instanceof C2005z0) {
            ((C2005z0) holder).e2();
        } else if (holder instanceof C2003y0) {
            ((C2003y0) holder).e2();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onViewDetachedFromWindow(RecyclerView.F holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof C2001x0) {
            ((C2001x0) holder).b2();
            return;
        }
        if (holder instanceof C1999w0) {
            ((C1999w0) holder).b2();
            return;
        }
        if (holder instanceof A0) {
            ((A0) holder).c2();
        } else if (holder instanceof C2005z0) {
            ((C2005z0) holder).d2();
        } else if (holder instanceof C2003y0) {
            ((C2003y0) holder).d2();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onViewRecycled(RecyclerView.F holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewRecycled(holder);
        if (holder instanceof C1968g0) {
            ((C1968g0) holder).Z1();
            return;
        }
        if (holder instanceof C1997v0) {
            ((C1997v0) holder).f2();
            return;
        }
        H h10 = holder instanceof H ? (H) holder : null;
        if (h10 != null) {
            h10.G1();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c8, code lost:
    
        if (r3 == com.zoho.livechat.android.modules.messages.domain.entities.Message.g.WidgetMultipleProduct) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(Message message, Message message2, H h10) {
        int b10;
        Message.Meta.InputCard inputCard;
        Message.Meta.InputCard inputCard2;
        String sender;
        String sender2;
        Message.g gVar = null;
        if (message.isLastMessage()) {
            b10 = 0;
        } else {
            b10 = og.i.e(message2 != null ? message2.getTimeDifferenceContent() : null) ? k.b(12) : k.b(2);
        }
        if (message.getSender() != null) {
            if (Intrinsics.areEqual(message2 != null ? message2.getSender() : null, message.getSender()) || ((((message2 != null && (sender2 = message2.getSender()) != null && TextUtils.isDigitsOnly(sender2)) || (message2 != null && (sender = message2.getSender()) != null && StringsKt.startsWith$default(sender, "LD", false, 2, (Object) null))) && (TextUtils.isDigitsOnly(message.getSender()) || StringsKt.startsWith$default(message.getSender(), "LD", false, 2, (Object) null))) || Intrinsics.areEqual(message.getSender(), "form_sender"))) {
                if ((message2 != null ? message2.getMessageType() : null) != Message.g.InfoMessage) {
                    b10 = k.a(2.0f);
                }
            }
        }
        Message.Meta meta = message.getMeta();
        if (((meta == null || (inputCard2 = meta.getInputCard()) == null) ? null : inputCard2.getType()) != Message.g.WidgetSingleProduct) {
            Message.g messageType = message2 != null ? message2.getMessageType() : null;
            Message.g gVar2 = Message.g.RequestLog;
            if (messageType != gVar2 && message.getMessageType() != gVar2) {
                Message.Meta meta2 = message.getMeta();
                if (meta2 != null && (inputCard = meta2.getInputCard()) != null) {
                    gVar = inputCard.getType();
                }
            }
        }
        b10 = k.a(2.0f);
        h10.L1(b10);
    }

    public final Hashtable s() {
        return this.f68934e;
    }

    public final int t(String messageId) {
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        int i10 = 0;
        for (Message message : this.f68935f) {
            if (Intrinsics.areEqual(message != null ? message.getId() : null, messageId)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public final SalesIQChat u() {
        return this.f68936g;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6963d(List messages, SalesIQChat salesIQChat, boolean z10, cg.e eVar, Function1 swipeListener, Function0 function0) {
        this();
        Intrinsics.checkNotNullParameter(messages, "messages");
        Intrinsics.checkNotNullParameter(swipeListener, "swipeListener");
        this.f68932c = eVar;
        this.f68930a = swipeListener;
        this.f68931b = function0;
        this.f68935f = messages;
        this.f68936g = salesIQChat;
        this.f68937h = z10;
        C3937f.f().k(new C3937f.InterfaceC0647f() { // from class: zf.b
            @Override // com.zoho.livechat.android.utils.C3937f.InterfaceC0647f
            public final boolean a(TextView textView, String str) {
                boolean f10;
                f10 = C6963d.f(C6963d.this, textView, str);
                return f10;
            }
        });
        C3937f.f().j(new C3937f.e() { // from class: zf.c
            @Override // com.zoho.livechat.android.utils.C3937f.e
            public final boolean a(TextView textView, String str) {
                boolean g10;
                g10 = C6963d.g(textView, str);
                return g10;
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(RecyclerView.F holder, int i10) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        int i11 = i10 - 1;
        C6963d c6963d = i11 >= 0 ? this : null;
        Object obj = c6963d != null ? c6963d.f68935f.get(i11) : null;
        Message message = (Message) this.f68935f.get(i10);
        if (holder instanceof W) {
            if (message != null) {
                ((W) holder).Y1(this.f68936g, message);
                return;
            }
            return;
        }
        if (holder instanceof C1961d) {
            return;
        }
        if (holder instanceof C1959c) {
            if (message != null) {
                ((C1959c) holder).d(message);
                return;
            }
            return;
        }
        H h10 = holder instanceof H ? (H) holder : null;
        if (message == null || h10 == null) {
            return;
        }
        q(message, (Message) obj, h10);
        if (holder instanceof C1968g0) {
            ((H) holder).F1(this.f68936g, message);
            return;
        }
        if (holder instanceof C1966f0) {
            ((C1966f0) holder).Y1(this.f68936g, message);
            return;
        }
        if (holder instanceof V) {
            ((V) holder).j2(this.f68936g, message);
            return;
        }
        if (holder instanceof C1977l) {
            ((H) holder).F1(this.f68936g, message);
            return;
        }
        if (holder instanceof C1992t) {
            ((H) holder).F1(this.f68936g, message);
            return;
        }
        if (holder instanceof H0) {
            ((H) holder).F1(this.f68936g, message);
            return;
        }
        if (holder instanceof C1956a0) {
            ((H) holder).F1(this.f68936g, message);
            return;
        }
        if (holder instanceof O) {
            ((H) holder).F1(this.f68936g, message);
            return;
        }
        if (holder instanceof C1960c0) {
            ((H) holder).F1(this.f68936g, message);
            return;
        }
        if (holder instanceof Y) {
            ((H) holder).F1(this.f68936g, message);
            return;
        }
        if (holder instanceof O0) {
            ((H) holder).F1(this.f68936g, message);
            return;
        }
        if (holder instanceof ViewOnClickListenerC1993t0) {
            ((H) holder).F1(this.f68936g, message);
            return;
        }
        if (holder instanceof B0) {
            ((H) holder).F1(this.f68936g, message);
            return;
        }
        if (holder instanceof ViewOnClickListenerC1984o0) {
            ((H) holder).F1(this.f68936g, message);
            return;
        }
        if (holder instanceof b1) {
            ((H) holder).F1(this.f68936g, message);
            return;
        }
        if (holder instanceof Z0) {
            ((H) holder).F1(this.f68936g, message);
            return;
        }
        if (holder instanceof a1) {
            ((H) holder).F1(this.f68936g, message);
            return;
        }
        if (holder instanceof D0) {
            ((H) holder).F1(this.f68936g, message);
            return;
        }
        if (holder instanceof C1997v0) {
            ((H) holder).F1(this.f68936g, message);
            return;
        }
        if (holder instanceof C1974j0) {
            ((H) holder).F1(this.f68936g, message);
            return;
        }
        if (holder instanceof C2001x0) {
            ((H) holder).F1(this.f68936g, message);
            return;
        }
        if (holder instanceof C1967g) {
            ((H) holder).F1(this.f68936g, message);
            return;
        }
        if (holder instanceof C1999w0) {
            ((H) holder).F1(this.f68936g, message);
            return;
        }
        if (holder instanceof A0) {
            ((H) holder).F1(this.f68936g, message);
            return;
        }
        if (holder instanceof C2005z0) {
            ((H) holder).F1(this.f68936g, message);
            return;
        }
        if (holder instanceof Q0) {
            ((H) holder).F1(this.f68936g, message);
            return;
        }
        if (holder instanceof K0) {
            ((H) holder).F1(this.f68936g, message);
            return;
        }
        if (holder instanceof C1989r0) {
            ((H) holder).F1(this.f68936g, message);
            return;
        }
        if (holder instanceof M0) {
            ((H) holder).F1(this.f68936g, message);
        } else if (holder instanceof C2003y0) {
            ((H) holder).F1(this.f68936g, message);
        } else if (holder instanceof ViewOnClickListenerC1964e0) {
            ((H) holder).F1(this.f68936g, message);
        }
    }

    /* renamed from: zf.d$e */
    public static final class e extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final e f68948d = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Linkify.TransformFilter invoke() {
            return new Linkify.TransformFilter() { // from class: zf.f
                @Override // android.text.util.Linkify.TransformFilter
                public final String transformUrl(Matcher matcher, String str) {
                    String c10;
                    c10 = C6963d.e.c(matcher, str);
                    return c10;
                }
            };
        }

        public static final String c(Matcher matcher, String str) {
            return str;
        }
    }
}
