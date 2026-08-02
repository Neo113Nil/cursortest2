package com.vk.catalog2.feature.search.holders;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.TextAppearanceSpan;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.search.CatalogSearchSpellcheckResult;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.feature.search.dto.ui.UIBlockSearchSpellcheck;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b0u0;
import xsna.b5a;
import xsna.b6l;
import xsna.bdn;
import xsna.bwt0;
import xsna.c98;
import xsna.dhr0;
import xsna.drm0;
import xsna.e43;
import xsna.epx;
import xsna.erm0;
import xsna.ge00;
import xsna.ho8;
import xsna.ie00;
import xsna.iut0;
import xsna.l3a;
import xsna.m3a;
import xsna.myc0;
import xsna.nik0;
import xsna.qcy;
import xsna.ryh0;
import xsna.s3q0;
import xsna.spj;
import xsna.syh0;
import xsna.vec;
import xsna.wgl;
import xsna.wzs;
import xsna.yvj;
import xsna.zvj;

/* compiled from: SearchSpellcheckVh.kt */
/* loaded from: classes16.dex */
public final class SearchSpellcheckVh implements CatalogViewHolder {
    public final b5a b;
    public final m3a c;
    public TextView d;
    public TextView e;
    public View f;
    public UIBlockSearchSpellcheck g;

    /* compiled from: SearchSpellcheckVh.kt */
    public static abstract class a implements l3a {

        /* compiled from: SearchSpellcheckVh.kt */
        /* renamed from: com.vk.catalog2.feature.search.holders.SearchSpellcheckVh$a$a, reason: collision with other inner class name */
        public static final class C0525a extends a {
            public final String a;

            public C0525a(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0525a) && epx.f(this.a, ((C0525a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("ReplaceQuerySilent(query="), this.a, ')');
            }
        }

        /* compiled from: SearchSpellcheckVh.kt */
        public static final class b extends a {
            public final String a;

            public b(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ho8.a(new StringBuilder("SearchWithoutSpellcheck(query="), this.a, ')');
            }
        }
    }

    /* compiled from: SearchSpellcheckVh.kt */
    @b6l(c = "com.vk.catalog2.feature.search.holders.SearchSpellcheckVh$buildTextWithActions$1", f = "SearchSpellcheckVh.kt", l = {163}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ CatalogSearchSpellcheckResult $spellcheckResult;
        final /* synthetic */ String $textTemplate;
        final /* synthetic */ TextView $textView;
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ SearchSpellcheckVh this$0;

        /* compiled from: SearchSpellcheckVh.kt */
        @b6l(c = "com.vk.catalog2.feature.search.holders.SearchSpellcheckVh$buildTextWithActions$1$1", f = "SearchSpellcheckVh.kt", l = {}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
            final /* synthetic */ SpannableString $result;
            final /* synthetic */ TextView $textView;
            int label;
            final /* synthetic */ SearchSpellcheckVh this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(TextView textView, SpannableString spannableString, SearchSpellcheckVh searchSpellcheckVh, spj<? super a> spjVar) {
                super(2, spjVar);
                this.$textView = textView;
                this.$result = spannableString;
                this.this$0 = searchSpellcheckVh;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new a(this.$textView, this.$result, this.this$0, spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                TextView textView = this.$textView;
                if (textView != null) {
                    textView.setText(this.$result, TextView.BufferType.SPANNABLE);
                }
                SearchSpellcheckVh searchSpellcheckVh = this.this$0;
                TextView textView2 = this.$textView;
                searchSpellcheckVh.getClass();
                if (textView2 != null) {
                    WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                    if (!textView2.isLaidOut()) {
                        textView2.addOnLayoutChangeListener(new ryh0(textView2, searchSpellcheckVh));
                    } else if (textView2.getLineCount() > 2) {
                        Spannable spannable = (Spannable) textView2.getText();
                        Object[] spans = spannable.getSpans(0, spannable.length(), Object.class);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append((CharSequence) spannable.subSequence(0, textView2.getLayout().getLineEnd(1)).toString());
                        spannableStringBuilder.replace(spannableStringBuilder.length() - 3, spannableStringBuilder.length(), (CharSequence) "...");
                        for (Object obj2 : spans) {
                            int spanStart = spannable.getSpanStart(obj2);
                            int spanEnd = spannable.getSpanEnd(obj2);
                            if (spanStart > drm0.H(spannableStringBuilder)) {
                                spanStart = spannableStringBuilder.length();
                            }
                            if (spanEnd > drm0.H(spannableStringBuilder)) {
                                spanEnd = spannableStringBuilder.length();
                            }
                            spannableStringBuilder.setSpan(obj2, spanStart, spanEnd, 18);
                        }
                        textView2.setMaxLines(2);
                        SparseArray<ForegroundColorSpan> sparseArray = nik0.a;
                        textView2.setText(new SpannableString(spannableStringBuilder));
                        textView2.getViewTreeObserver().addOnGlobalLayoutListener(new syh0(textView2));
                    }
                }
                return s3q0.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, SearchSpellcheckVh searchSpellcheckVh, Context context, CatalogSearchSpellcheckResult catalogSearchSpellcheckResult, TextView textView, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$textTemplate = str;
            this.this$0 = searchSpellcheckVh;
            this.$context = context;
            this.$spellcheckResult = catalogSearchSpellcheckResult;
            this.$textView = textView;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new b(this.$textTemplate, this.this$0, this.$context, this.$spellcheckResult, this.$textView, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.util.Map] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SpannableString a2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            int i2 = 1;
            if (i == 0) {
                kotlin.a.a(obj);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int i3 = 0;
                while (true) {
                    if (i3 < 0 || i3 >= this.$textTemplate.length()) {
                        break;
                    }
                    int K = drm0.K(i3, 4, this.$textTemplate, "$", false);
                    if (K == -1) {
                        spannableStringBuilder.append((CharSequence) this.$textTemplate.substring(i3));
                        break;
                    }
                    int K2 = drm0.K(K, 4, this.$textTemplate, " ", false);
                    if (K2 == -1) {
                        K2 = this.$textTemplate.length();
                    }
                    spannableStringBuilder.append((CharSequence) this.$textTemplate.substring(i3, K));
                    String substring = this.$textTemplate.substring(K, K2);
                    SearchSpellcheckVh searchSpellcheckVh = this.this$0;
                    Context context = this.$context;
                    CatalogSearchSpellcheckResult catalogSearchSpellcheckResult = this.$spellcheckResult;
                    searchSpellcheckVh.getClass();
                    CatalogSearchSpellcheckResult.SearchableVariable searchableVariable = (CatalogSearchSpellcheckResult.SearchableVariable) catalogSearchSpellcheckResult.i.get(erm0.v0(1, substring));
                    if (searchableVariable == null) {
                        a2 = new SpannableString(substring);
                    } else {
                        String str = searchableVariable.c;
                        String str2 = searchableVariable.b;
                        if (str != null) {
                            int i4 = 3;
                            for (Object obj2 : e43.l(searchSpellcheckVh.f, searchSpellcheckVh.d, searchSpellcheckVh.e)) {
                                if (obj2 != null) {
                                    ((View) obj2).setOnClickListener(new c98(new vec(i4, searchSpellcheckVh, str), i2));
                                    i4 = 3;
                                }
                            }
                            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(dhr0.t.c(R.attr.vk_ui_text_link));
                            UIBlockSearchSpellcheck uIBlockSearchSpellcheck = searchSpellcheckVh.g;
                            Object[] objArr = {foregroundColorSpan, new TextAppearanceSpan(context, epx.f(uIBlockSearchSpellcheck != null ? Boolean.valueOf(uIBlockSearchSpellcheck.z) : null, Boolean.TRUE) ? R.style.VkUiTypography_Title3 : R.style.VkUiTypography_Headline1)};
                            SpannableString spannableString = new SpannableString(str2);
                            for (int i5 = 0; i5 < 2; i5++) {
                                spannableString.setSpan(objArr[i5], 0, spannableString.length(), 33);
                            }
                            a2 = SearchSpellcheckVh.a(spannableString);
                        } else {
                            UIBlockSearchSpellcheck uIBlockSearchSpellcheck2 = searchSpellcheckVh.g;
                            Object[] objArr2 = {new TextAppearanceSpan(context, epx.f(uIBlockSearchSpellcheck2 != null ? Boolean.valueOf(uIBlockSearchSpellcheck2.z) : null, Boolean.TRUE) ? R.style.VkUiTypography_Title3 : R.style.VkUiTypography_Headline1)};
                            SpannableString spannableString2 = new SpannableString(str2);
                            spannableString2.setSpan(objArr2[0], 0, spannableString2.length(), 33);
                            a2 = SearchSpellcheckVh.a(spannableString2);
                        }
                    }
                    spannableStringBuilder.append((CharSequence) a2);
                    i3 = K2;
                }
                SparseArray<ForegroundColorSpan> sparseArray = nik0.a;
                SpannableString spannableString3 = new SpannableString(spannableStringBuilder);
                bdn bdnVar = bdn.a;
                ge00 ge00Var = ie00.a;
                a aVar = new a(this.$textView, spannableString3, this.this$0, null);
                this.L$0 = null;
                this.L$1 = null;
                this.I$0 = i3;
                this.label = 1;
                if (myc0.k(ge00Var, aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    public SearchSpellcheckVh(m3a m3aVar, b5a b5aVar) {
        this.b = b5aVar;
        this.c = m3aVar;
    }

    public static SpannableString a(SpannableString spannableString) {
        Pattern compile = Pattern.compile("<red>[^<>]*</red>");
        StringBuffer stringBuffer = new StringBuffer(spannableString);
        Matcher matcher = compile.matcher(stringBuffer);
        if (!matcher.find()) {
            return spannableString;
        }
        try {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (matcher.find(i)) {
                String W = drm0.W(drm0.U(stringBuffer.substring(matcher.start(), matcher.end()), "<red>"), "</red>");
                StringBuffer stringBuffer2 = new StringBuffer();
                matcher.appendReplacement(stringBuffer2, W);
                int length = stringBuffer2.length();
                matcher.appendTail(stringBuffer2);
                arrayList.add(new Pair(Integer.valueOf(matcher.start()), Integer.valueOf(matcher.start() + W.length())));
                matcher = compile.matcher(stringBuffer2);
                stringBuffer = stringBuffer2;
                i = length;
            }
            SpannableString spannableString2 = new SpannableString(stringBuffer);
            ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) spannableString.getSpans(0, spannableString.length(), ForegroundColorSpan.class);
            TextAppearanceSpan[] textAppearanceSpanArr = (TextAppearanceSpan[]) spannableString.getSpans(0, spannableString.length(), TextAppearanceSpan.class);
            for (ForegroundColorSpan foregroundColorSpan : foregroundColorSpanArr) {
                spannableString2.setSpan(foregroundColorSpan, 0, spannableString2.length(), 33);
            }
            for (TextAppearanceSpan textAppearanceSpan : textAppearanceSpanArr) {
                spannableString2.setSpan(textAppearanceSpan, 0, spannableString2.length(), 33);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                spannableString2.setSpan(new ForegroundColorSpan(dhr0.t.c(R.attr.vk_ui_text_negative)), ((Number) pair.i()).intValue(), ((Number) pair.j()).intValue(), 17);
            }
            return spannableString2;
        } catch (Exception e) {
            com.vk.metrics.eventtracking.b.a.a(e);
            return spannableString;
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        Context context;
        m3a m3aVar;
        if (uIBlock instanceof UIBlockSearchSpellcheck) {
            UIBlockSearchSpellcheck uIBlockSearchSpellcheck = (UIBlockSearchSpellcheck) uIBlock;
            CatalogSearchSpellcheckResult catalogSearchSpellcheckResult = uIBlockSearchSpellcheck.y;
            this.g = uIBlockSearchSpellcheck;
            TextView textView = this.d;
            if (textView == null || (context = textView.getContext()) == null) {
                return;
            }
            Iterator it = e43.l(this.f, this.d, this.e).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (next != null) {
                    ((View) next).setOnClickListener(null);
                }
            }
            UIBlockSearchSpellcheck uIBlockSearchSpellcheck2 = this.g;
            int i = epx.f(uIBlockSearchSpellcheck2 != null ? Boolean.valueOf(uIBlockSearchSpellcheck2.z) : null, Boolean.TRUE) ? R.style.VkUiTypography_Title3Normal : R.style.VkUiTypography_Headline1Normal;
            TextView textView2 = this.d;
            if (textView2 != null) {
                qcy<Object>[] qcyVarArr = bwt0.a;
                textView2.setTextAppearance(i);
            }
            TextView textView3 = this.e;
            if (textView3 != null) {
                qcy<Object>[] qcyVarArr2 = bwt0.a;
                textView3.setTextAppearance(i);
            }
            b(context, catalogSearchSpellcheckResult.g, catalogSearchSpellcheckResult, this.d);
            TextView textView4 = this.d;
            if (textView4 != null) {
                textView4.setMovementMethod(LinkMovementMethod.getInstance());
            }
            b(context, catalogSearchSpellcheckResult.h, catalogSearchSpellcheckResult, this.e);
            TextView textView5 = this.e;
            if (textView5 != null) {
                textView5.setMovementMethod(LinkMovementMethod.getInstance());
            }
            String str = catalogSearchSpellcheckResult.d;
            if (str == null || (m3aVar = this.c) == null) {
                return;
            }
            m3aVar.j(new a.C0525a(str));
        }
    }

    public final void b(Context context, String str, CatalogSearchSpellcheckResult catalogSearchSpellcheckResult, TextView textView) {
        if (textView != null) {
            textView.setVisibility((str == null || drm0.N(str)) ? 8 : 0);
        }
        if (str == null) {
            return;
        }
        bdn bdnVar = bdn.a;
        myc0.h(zvj.a(wgl.c), null, null, new b(str, this, context, catalogSearchSpellcheckResult, textView, null), 3);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_search_spellcheck_result_item, viewGroup, false);
        this.d = (TextView) inflate.findViewById(R.id.title);
        this.e = (TextView) inflate.findViewById(R.id.suggest);
        this.f = inflate;
        return inflate;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
