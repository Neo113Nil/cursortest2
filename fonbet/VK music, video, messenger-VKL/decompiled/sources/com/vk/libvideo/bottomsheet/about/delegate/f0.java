package com.vk.libvideo.bottomsheet.about.delegate;

import android.content.Context;
import android.text.SpannableString;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
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
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.c4;
import xsna.c5g;
import xsna.e3m;
import xsna.e530;
import xsna.f7q0;
import xsna.f870;
import xsna.fnj;
import xsna.hfz;
import xsna.iah0;
import xsna.ift0;
import xsna.jai;
import xsna.msy;
import xsna.mut0;
import xsna.n2m;
import xsna.on00;
import xsna.p1u0;
import xsna.q530;
import xsna.qni0;
import xsna.vfz;
import xsna.wh50;
import xsna.wn7;
import xsna.zak0;

/* compiled from: VideoDescriptionDelegate.kt */
/* loaded from: classes2.dex */
public final class f0 extends p1u0<AboutVideoItem.h> {
    public final c4 a;
    public final q530 b;
    public final boolean c;
    public final Object d = msy.a(LazyThreadSafetyMode.NONE, new f7q0(6));

    /* compiled from: VideoDescriptionDelegate.kt */
    public final class a extends vfz<AboutVideoItem.h> {
        public final ComposeView l;
        public final ift0 m;
        public final LinkedHashSet n;
        public final wh50 o;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(ViewGroup viewGroup) {
            super(r0);
            ComposeView composeView = new ComposeView(viewGroup.getContext(), null, 6);
            composeView.setViewCompositionStrategy(mut0.c.a);
            composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            ComposeView composeView2 = (ComposeView) this.itemView;
            this.l = composeView2;
            this.m = new ift0();
            this.n = new LinkedHashSet();
            this.o = androidx.compose.runtime.k.b(null);
            composeView2.setContent(new jai(-1825622437, new wn7(17, this, f0.this), true));
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x00d5  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00f8 A[LOOP:0: B:35:0x00f2->B:37:0x00f8, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0118  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0128 A[LOOP:1: B:43:0x0122->B:45:0x0128, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0139  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0141  */
        /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.vfz
        /* renamed from: W5 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void i6(AboutVideoItem.h hVar) {
            SpannableString spannableString;
            Iterator<T> it;
            int e;
            TitleAction.Snippet snippet;
            String str;
            AboutVideoItem.h hVar2 = hVar;
            Context context = this.l.getContext();
            HashSet hashSet = iah0.a;
            boolean d = fnj.d(context);
            int i = hVar2.c;
            List<Good> list = hVar2.m;
            boolean z = hVar2.h;
            OrdAdInfo ordAdInfo = hVar2.i;
            long j = i;
            String format = ((SimpleDateFormat) f0.this.d.getValue()).format(Long.valueOf(1000 * j));
            boolean z2 = j > qni0.a() / ((long) 1000);
            StringBuilder sb = new StringBuilder();
            if (i != 0) {
                sb.append(this.itemView.getResources().getString(z2 ? R.string.video_about_deferred_date : R.string.video_about_date, format));
            }
            if (ordAdInfo != null) {
                if (sb.length() > 0) {
                    sb.append(" · ");
                }
                sb.append(this.itemView.getResources().getString(R.string.video_author_ads));
            }
            String sb2 = sb.toString();
            String str2 = null;
            String str3 = (ordAdInfo == null || z) ? null : "\n" + this.itemView.getResources().getString(R.string.video_author_ads);
            Context context2 = this.itemView.getContext();
            TitleAction titleAction = hVar2.g;
            this.m.getClass();
            if (titleAction != null && (snippet = titleAction.e) != null && (str = snippet.b) != null) {
                String str4 = str.length() > 0 ? str : null;
                if (str4 != null) {
                    spannableString = b.C0795b.f(titleAction, context2, str4, 0, str4.length(), str3);
                    if (spannableString == null) {
                        spannableString = null;
                    }
                    long c = f870.c(e3m.f(R.attr.vk_ui_text_link, context));
                    List<Good> list2 = list;
                    ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                    it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(h6((Good) it.next()));
                    }
                    e = on00.e(c5g.u(list2, 10));
                    if (e < 16) {
                        e = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(e);
                    for (Object obj : list2) {
                        linkedHashMap.put(h6((Good) obj), obj);
                    }
                    String string = !z ? context.getString(R.string.archival_content_title) : "";
                    if (z && ordAdInfo != null) {
                        str2 = context.getString(R.string.video_author_ads);
                    }
                    ((zak0) this.o).setValue(new n2m(hVar2.b.toString(), sb2, !hVar2.n, hVar2.l, hVar2.c, spannableString, c, hVar2.h, string, str2, hVar2.k, arrayList, linkedHashMap, d));
                }
            }
            spannableString = null;
            if (spannableString == null) {
            }
            long c2 = f870.c(e3m.f(R.attr.vk_ui_text_link, context));
            List<Good> list22 = list;
            ArrayList arrayList2 = new ArrayList(c5g.u(list22, 10));
            it = list22.iterator();
            while (it.hasNext()) {
            }
            e = on00.e(c5g.u(list22, 10));
            if (e < 16) {
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(e);
            while (r4.hasNext()) {
            }
            if (!z) {
            }
            if (z) {
                str2 = context.getString(R.string.video_author_ads);
            }
            ((zak0) this.o).setValue(new n2m(hVar2.b.toString(), sb2, !hVar2.n, hVar2.l, hVar2.c, spannableString, c2, hVar2.h, string, str2, hVar2.k, arrayList2, linkedHashMap2, d));
        }

        public final ProductVideoAttach h6(Good good) {
            ProductVideoAttach.StatusType statusType = f0.this.b.a(e530.b(good, null)).h() ? ProductVideoAttach.StatusType.Adult : ProductVideoAttach.StatusType.Base;
            long j = good.b;
            Image image = good.n;
            Image image2 = image != null ? image : null;
            Price price = good.h;
            String str = price.e;
            int i = price.g;
            return new ProductVideoAttach(j, statusType, image2, str, i != 0 ? new ProductVideoAttach.a(i) : null, good.d);
        }
    }

    public f0(c4 c4Var, q530 q530Var, boolean z) {
        this.a = c4Var;
        this.b = q530Var;
        this.c = z;
    }

    @Override // xsna.p1u0
    public final vfz<? extends AboutVideoItem.h> b(ViewGroup viewGroup) {
        return new a(viewGroup);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return (hfzVar instanceof AboutVideoItem.h) && this.c;
    }
}
