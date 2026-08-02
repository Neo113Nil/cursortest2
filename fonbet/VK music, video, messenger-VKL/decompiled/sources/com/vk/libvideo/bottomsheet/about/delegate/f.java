package com.vk.libvideo.bottomsheet.about.delegate;

import android.content.Context;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.vk.core.utils.b;
import com.vk.dto.common.Good;
import com.vk.dto.common.Image;
import com.vk.dto.common.OrdAdInfo;
import com.vk.dto.common.Price;
import com.vk.dto.common.TitleAction;
import com.vk.ecomm.design.compose.productattaches.ProductVideoAttach;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vkontakte.android.R;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import xsna.ahn;
import xsna.awt0;
import xsna.bwt0;
import xsna.c4;
import xsna.c5g;
import xsna.c6;
import xsna.cn70;
import xsna.dhr0;
import xsna.drm0;
import xsna.e3m;
import xsna.e530;
import xsna.e6;
import xsna.f4m;
import xsna.fnj;
import xsna.g6;
import xsna.hfz;
import xsna.i6;
import xsna.iah0;
import xsna.ift0;
import xsna.j5g;
import xsna.j6;
import xsna.l7s;
import xsna.lpj;
import xsna.msy;
import xsna.on00;
import xsna.p1u0;
import xsna.q530;
import xsna.qcy;
import xsna.qni0;
import xsna.s6t0;
import xsna.sss0;
import xsna.vfz;

/* compiled from: AboutVideoDescriptionDelegate.kt */
/* loaded from: classes2.dex */
public final class f extends p1u0<AboutVideoItem.h> {
    public final c4 a;
    public final q530 b;
    public final boolean c;
    public final Object d = msy.a(LazyThreadSafetyMode.NONE, new c6(0));
    public final LinkedHashSet e = new LinkedHashSet();

    /* compiled from: AboutVideoDescriptionDelegate.kt */
    public final class a extends vfz<AboutVideoItem.h> {
        public final c4 l;
        public final q530 m;
        public final ift0 n;
        public final AppCompatTextView o;
        public final TextView p;
        public final TextView q;
        public final TextView r;
        public final View s;
        public e6 t;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(ViewGroup viewGroup, c4 c4Var, q530 q530Var) {
            super(bwt0.I(fnj.d(r2) ? R.layout.video_about_description_tablet : R.layout.video_about_description, viewGroup, false));
            Context context = viewGroup.getContext();
            HashSet hashSet = iah0.a;
            this.l = c4Var;
            this.m = q530Var;
            this.n = new ift0();
            this.o = (AppCompatTextView) this.itemView.findViewById(R.id.title);
            this.p = (TextView) this.itemView.findViewById(R.id.subtitle);
            this.q = (TextView) this.itemView.findViewById(R.id.position_in_trending);
            this.r = (TextView) this.itemView.findViewById(R.id.archival_content);
            this.s = this.itemView.findViewById(R.id.attaches_view);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:49:0x01c1  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x01cc  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0232  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0243  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x0211  */
        /* JADX WARN: Removed duplicated region for block: B:85:0x01c3  */
        /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.vfz
        /* renamed from: W5 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void i6(AboutVideoItem.h hVar) {
            int i;
            SpannableString spannableString;
            TextView textView;
            int e;
            TitleAction.Snippet snippet;
            String str;
            AboutVideoItem.h hVar2 = hVar;
            List<Good> list = hVar2.m;
            boolean z = hVar2.h;
            OrdAdInfo ordAdInfo = hVar2.i;
            CharSequence charSequence = hVar2.b;
            AppCompatTextView appCompatTextView = this.o;
            appCompatTextView.setText(charSequence);
            f4m.t(cn70.b(5), appCompatTextView);
            Context context = this.itemView.getContext();
            HashSet hashSet = iah0.a;
            int i2 = fnj.d(context) ? R.style.VkUiTypography_Title3 : R.style.VkUiTypography_DisplayTitle4;
            qcy<Object>[] qcyVarArr = bwt0.a;
            appCompatTextView.setTextAppearance(i2);
            if (fnj.d(this.itemView.getContext())) {
                Context context2 = this.itemView.getContext();
                lpj lpjVar = context2 instanceof lpj ? (lpj) context2 : null;
                Integer valueOf = lpjVar != null ? Integer.valueOf(lpjVar.getThemeResId()) : null;
                dhr0.a.getClass();
                int i3 = dhr0.u().c;
                if (valueOf == null || valueOf.intValue() != i3) {
                    context2 = new l7s(context2, dhr0.u().c);
                }
                appCompatTextView.setTextColor(e3m.f(R.attr.vk_ui_text_primary, context2));
            }
            int b = fnj.d(this.itemView.getContext()) ? cn70.b(8) : cn70.b(2);
            TextView textView2 = this.p;
            f4m.t(b, textView2);
            boolean z2 = hVar2.l;
            int i4 = hVar2.c;
            f fVar = f.this;
            if (z2) {
                h6(hVar2);
                i = 2;
            } else {
                long j = i4;
                i = 2;
                String format = ((SimpleDateFormat) fVar.d.getValue()).format(Long.valueOf(1000 * j));
                boolean z3 = j > qni0.a() / ((long) 1000);
                StringBuilder sb = new StringBuilder();
                if (i4 != 0) {
                    sb.append(b6().getString(z3 ? R.string.video_about_deferred_date : R.string.video_about_date, format));
                }
                if (ordAdInfo != null) {
                    if (!drm0.N(sb)) {
                        sb.append(" · ");
                    }
                    sb.append(b6().getString(R.string.video_author_ads));
                }
                String sb2 = sb.toString();
                textView2.setVisibility(!drm0.N(sb2) ? 0 : 8);
                textView2.setText(sb2);
                textView2.removeCallbacks(this.t);
                this.t = null;
            }
            String str2 = (ordAdInfo == null || z) ? null : "\n" + this.itemView.getContext().getResources().getString(R.string.video_author_ads);
            Context context3 = this.itemView.getContext();
            TitleAction titleAction = hVar2.g;
            this.n.getClass();
            b.C0795b c0795b = b.C0795b.a;
            c0795b.getClass();
            if (titleAction != null && (snippet = titleAction.e) != null && (str = snippet.b) != null) {
                String str3 = str.length() > 0 ? str : null;
                if (str3 != null) {
                    spannableString = b.C0795b.f(titleAction, context3, str3, 0, str3.length(), str2);
                    int i5 = (spannableString != null || drm0.N(spannableString)) ? 8 : 0;
                    textView = this.q;
                    textView.setVisibility(i5);
                    if (spannableString != null && spannableString.length() > 0) {
                        textView.setMovementMethod(LinkMovementMethod.getInstance());
                        textView.setHighlightColor(0);
                        textView.setText(spannableString);
                        f4m.t(cn70.b(i), textView);
                    }
                    int i6 = !z ? 0 : 8;
                    TextView textView3 = this.r;
                    textView3.setVisibility(i6);
                    if (z) {
                        textView3.setText((CharSequence) null);
                    } else {
                        CharSequence e2 = c0795b.e(this.itemView.getContext(), new b.a(null, this.itemView.getContext().getString(R.string.archival_content_title), textView3.getCurrentTextColor(), ordAdInfo != null ? this.itemView.getContext().getString(R.string.video_author_ads) : null), new j6(0, hVar2, this));
                        textView3.setMovementMethod(LinkMovementMethod.getInstance());
                        textView3.setHighlightColor(0);
                        textView3.setText(e2);
                    }
                    boolean z4 = !list.isEmpty();
                    View view = this.s;
                    awt0.v(view, z4);
                    List<Good> list2 = list;
                    e = on00.e(c5g.u(list2, 10));
                    if (e < 16) {
                        e = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(e);
                    for (Object obj : list2) {
                        Good good = (Good) obj;
                        ProductVideoAttach.StatusType statusType = this.m.a(e530.b(good, null)).h() ? ProductVideoAttach.StatusType.Adult : ProductVideoAttach.StatusType.Base;
                        long j2 = good.b;
                        Image image = good.n;
                        Image image2 = image != null ? image : null;
                        Price price = good.h;
                        String str4 = price.e;
                        int i7 = price.g;
                        linkedHashMap.put(new ProductVideoAttach(j2, statusType, image2, str4, i7 != 0 ? new ProductVideoAttach.a(i7) : null, good.d), obj);
                    }
                    List O0 = j5g.O0(linkedHashMap.keySet());
                    ((s6t0) view).l(O0, new g6(0, linkedHashMap, this), new i6(O0, fVar, linkedHashMap, this, hVar2, 0));
                }
            }
            spannableString = null;
            if (spannableString != null) {
            }
            textView = this.q;
            textView.setVisibility(i5);
            if (spannableString != null) {
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                textView.setHighlightColor(0);
                textView.setText(spannableString);
                f4m.t(cn70.b(i), textView);
            }
            if (!z) {
            }
            TextView textView32 = this.r;
            textView32.setVisibility(i6);
            if (z) {
            }
            boolean z42 = !list.isEmpty();
            View view2 = this.s;
            awt0.v(view2, z42);
            List<Good> list22 = list;
            e = on00.e(c5g.u(list22, 10));
            if (e < 16) {
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(e);
            while (r0.hasNext()) {
            }
            List O02 = j5g.O0(linkedHashMap2.keySet());
            ((s6t0) view2).l(O02, new g6(0, linkedHashMap2, this), new i6(O02, fVar, linkedHashMap2, this, hVar2, 0));
        }

        public final void h6(AboutVideoItem.h hVar) {
            String string = b6().getString(R.string.vk_live_on_broadcast, ahn.p(TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - (hVar.c * 1000)), this.itemView.getContext()));
            TextView textView = this.p;
            textView.setText(string);
            textView.setVisibility(!hVar.n ? 0 : 8);
            textView.removeCallbacks(this.t);
            e6 e6Var = new e6(0, this, hVar);
            this.t = e6Var;
            textView.postDelayed(e6Var, 1000L);
            textView.addOnAttachStateChangeListener(new sss0(textView, e6Var));
        }
    }

    public f(c4 c4Var, q530 q530Var, boolean z) {
        this.a = c4Var;
        this.b = q530Var;
        this.c = z;
    }

    @Override // xsna.p1u0
    public final vfz<? extends AboutVideoItem.h> b(ViewGroup viewGroup) {
        return new a(viewGroup, this.a, this.b);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return (hfzVar instanceof AboutVideoItem.h) && !this.c;
    }
}
