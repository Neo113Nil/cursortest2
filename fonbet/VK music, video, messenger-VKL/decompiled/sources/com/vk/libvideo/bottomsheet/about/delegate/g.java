package com.vk.libvideo.bottomsheet.about.delegate;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.vk.core.utils.b;
import com.vk.core.view.TextViewEllipsizeEnd;
import com.vk.core.view.components.text.links.VkLinkedText;
import com.vk.donut.video.model.presentation.video.DonutVideoUiModel;
import com.vk.dto.common.TitleAction;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.toggle.features.VideoFeatures;
import com.vkontakte.android.R;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.text.Regex;
import xsna.bwt0;
import xsna.c4;
import xsna.drm0;
import xsna.e43;
import xsna.egs0;
import xsna.f4m;
import xsna.fnj;
import xsna.gpt0;
import xsna.hfz;
import xsna.iah0;
import xsna.ift0;
import xsna.izs;
import xsna.j5g;
import xsna.lfo0;
import xsna.lzn;
import xsna.n6;
import xsna.nik0;
import xsna.p1u0;
import xsna.q6;
import xsna.qcy;
import xsna.qf6;
import xsna.r6;
import xsna.s6;
import xsna.t6;
import xsna.vfz;
import xsna.x8s;
import xsna.z8s;

/* compiled from: AboutVideoDescriptionRedesignDelegate.kt */
/* loaded from: classes2.dex */
public final class g extends p1u0<AboutVideoItem.i> {
    public final c4 a;
    public final lzn b;
    public final egs0 c;
    public final q6 d = new q6(new r6(this, 0));

    /* compiled from: AboutVideoDescriptionRedesignDelegate.kt */
    public final class a extends qf6 {
        public final AppCompatTextView l;
        public final VkLinkedText m;
        public final TextViewEllipsizeEnd n;
        public final ift0 o;
        public final boolean p;
        public final lfo0 q;
        public final lfo0 r;
        public final t6 s;

        public a(ViewGroup viewGroup, egs0 egs0Var) {
            super(viewGroup, R.layout.video_about_description_redesign, egs0Var);
            AppCompatTextView appCompatTextView = (AppCompatTextView) this.itemView.findViewById(R.id.title);
            this.l = appCompatTextView;
            VkLinkedText vkLinkedText = (VkLinkedText) this.itemView.findViewById(R.id.subtitle);
            this.m = vkLinkedText;
            TextViewEllipsizeEnd textViewEllipsizeEnd = (TextViewEllipsizeEnd) this.itemView.findViewById(R.id.text);
            this.n = textViewEllipsizeEnd;
            this.o = new ift0();
            VideoFeatures videoFeatures = VideoFeatures.NEW_FULLSCREEN_REDESIGN_DISCOVERY;
            videoFeatures.getClass();
            boolean a = com.vk.toggle.b.A.a(videoFeatures);
            this.p = a;
            lfo0 lfo0Var = new lfo0(vkLinkedText);
            lfo0Var.f = true;
            this.q = lfo0Var;
            lfo0 lfo0Var2 = new lfo0(textViewEllipsizeEnd);
            lfo0Var2.f = true;
            this.r = lfo0Var2;
            this.s = new t6(this, 0);
            appCompatTextView.setEmojiCompatEnabled(false);
            Context context = this.itemView.getContext();
            HashSet hashSet = iah0.a;
            if (fnj.d(context)) {
                f4m.y(iah0.a(a ? 16 : 20), this.itemView);
                qcy<Object>[] qcyVarArr = bwt0.a;
                textViewEllipsizeEnd.setTextAppearance(R.style.VkUiTypography_Footnote);
                vkLinkedText.setTextAppearance(R.style.VkUiTypography_Footnote);
                textViewEllipsizeEnd.setTextSize(2, 12.0f);
                vkLinkedText.setTextSize(2, 12.0f);
            }
            if (a) {
                appCompatTextView.setMaxLines(1);
                vkLinkedText.setMaxLines(1);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x00a3  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00bb  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00e3  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x010e  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0153  */
        @Override // xsna.vfz
        /* renamed from: W5 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void i6(hfz hfzVar) {
            String q;
            SpannableString spannableString;
            boolean z;
            TitleAction.Snippet snippet;
            String str;
            AboutVideoItem.i iVar = (AboutVideoItem.i) hfzVar;
            g gVar = g.this;
            q6 q6Var = gVar.d;
            int i = iVar.f;
            long j = iVar.c;
            CharSequence charSequence = iVar.g;
            this.l.setText(iVar.b);
            ArrayList arrayList = new ArrayList();
            boolean z2 = iVar.h;
            int i2 = iVar.e;
            if (!z2 || i2 != 0) {
                gpt0 gpt0Var = gpt0.a;
                Context context = this.itemView.getContext();
                DecimalFormat decimalFormat = z8s.a;
                arrayList.add(z8s.e(i2, context));
            }
            long j2 = iVar.d;
            if (j2 == 0 && j == 0) {
                q = null;
            } else if (j == j2 || j == 0) {
                gpt0 gpt0Var2 = gpt0.a;
                q = gpt0.q((int) (j2 / 1000));
            } else {
                DecimalFormat decimalFormat2 = z8s.a;
                q = z8s.c(this.itemView.getContext(), j, x8s.a.g, true);
            }
            arrayList.add(q);
            Context context2 = this.itemView.getContext();
            TitleAction titleAction = iVar.i;
            this.o.getClass();
            if (titleAction != null && (snippet = titleAction.e) != null && (str = snippet.b) != null) {
                String str2 = str.length() > 0 ? str : null;
                if (str2 != null) {
                    spannableString = b.C0795b.f(titleAction, context2, str2, 0, str2.length(), null);
                    arrayList.add(spannableString);
                    if (iVar.j != null) {
                        arrayList.add(this.itemView.getContext().getResources().getString(R.string.video_author_ads));
                    }
                    DonutVideoUiModel donutVideoUiModel = iVar.k;
                    arrayList.add(donutVideoUiModel != null ? gVar.b.a(donutVideoUiModel, this.itemView.getContext()) : null);
                    List V = j5g.V(arrayList);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    int i3 = 0;
                    int i4 = 0;
                    for (Object obj : V) {
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            e43.t();
                            throw null;
                        }
                        CharSequence charSequence2 = (CharSequence) obj;
                        if (i4 > 0) {
                            spannableStringBuilder.append((CharSequence) " · ");
                        }
                        spannableStringBuilder.append(charSequence2);
                        i4 = i5;
                    }
                    final SpannedString spannedString = new SpannedString(spannableStringBuilder);
                    z = this.p;
                    final t6 t6Var = this.s;
                    final lfo0 lfo0Var = this.q;
                    final TextViewEllipsizeEnd textViewEllipsizeEnd = this.n;
                    final VkLinkedText vkLinkedText = this.m;
                    if (z) {
                        boolean N = drm0.N(spannedString);
                        vkLinkedText.setVisibility(!N ? 0 : 8);
                        if (!N) {
                            if (drm0.N(charSequence)) {
                                lfo0Var.getClass();
                                vkLinkedText.post(new Runnable() { // from class: xsna.kfo0
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        lfo0 lfo0Var2 = lfo0.this;
                                        TextView textView = lfo0Var2.a;
                                        CharSequence charSequence3 = spannedString;
                                        lfo0Var2.b = charSequence3;
                                        lfo0Var2.c = (CharSequence) t6Var.invoke(new gd0(17, lfo0Var2, charSequence3));
                                        lfo0Var2.d = false;
                                        View view = vkLinkedText;
                                        textView.setText(lfo0.b(lfo0Var2, (view.getMeasuredWidth() - view.getPaddingStart()) - view.getPaddingEnd(), 0, 6));
                                    }
                                });
                            } else {
                                vkLinkedText.setText(spannedString);
                            }
                        }
                        boolean N2 = drm0.N(charSequence);
                        textViewEllipsizeEnd.setVisibility(N2 ? 8 : 0);
                        if (!N2) {
                            q6Var.getClass();
                            final CharSequence b = nik0.b(charSequence, (Regex) q6.b.getValue(), new n6(q6Var, i, 0));
                            final lfo0 lfo0Var2 = this.r;
                            lfo0Var2.getClass();
                            textViewEllipsizeEnd.post(new Runnable() { // from class: xsna.kfo0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    lfo0 lfo0Var22 = lfo0.this;
                                    TextView textView = lfo0Var22.a;
                                    CharSequence charSequence3 = b;
                                    lfo0Var22.b = charSequence3;
                                    lfo0Var22.c = (CharSequence) t6Var.invoke(new gd0(17, lfo0Var22, charSequence3));
                                    lfo0Var22.d = false;
                                    View view = textViewEllipsizeEnd;
                                    textView.setText(lfo0.b(lfo0Var22, (view.getMeasuredWidth() - view.getPaddingStart()) - view.getPaddingEnd(), 0, 6));
                                }
                            });
                        }
                    } else {
                        vkLinkedText.setVisibility(0);
                        textViewEllipsizeEnd.setVisibility(8);
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                        spannableStringBuilder2.append((CharSequence) spannedString);
                        if (!drm0.N(spannedString) && !drm0.N(charSequence)) {
                            spannableStringBuilder2.append((CharSequence) " · ");
                        }
                        spannableStringBuilder2.append(charSequence);
                        SpannedString spannedString2 = new SpannedString(spannableStringBuilder2);
                        q6Var.getClass();
                        final CharSequence b2 = nik0.b(spannedString2, (Regex) q6.b.getValue(), new n6(q6Var, i, 0));
                        lfo0Var.getClass();
                        vkLinkedText.post(new Runnable() { // from class: xsna.kfo0
                            @Override // java.lang.Runnable
                            public final void run() {
                                lfo0 lfo0Var22 = lfo0.this;
                                TextView textView = lfo0Var22.a;
                                CharSequence charSequence3 = b2;
                                lfo0Var22.b = charSequence3;
                                lfo0Var22.c = (CharSequence) t6Var.invoke(new gd0(17, lfo0Var22, charSequence3));
                                lfo0Var22.d = false;
                                View view = vkLinkedText;
                                textView.setText(lfo0.b(lfo0Var22, (view.getMeasuredWidth() - view.getPaddingStart()) - view.getPaddingEnd(), 0, 6));
                            }
                        });
                    }
                    bwt0.i0(this.itemView, new s6(gVar, i3));
                }
            }
            spannableString = null;
            arrayList.add(spannableString);
            if (iVar.j != null) {
            }
            DonutVideoUiModel donutVideoUiModel2 = iVar.k;
            arrayList.add(donutVideoUiModel2 != null ? gVar.b.a(donutVideoUiModel2, this.itemView.getContext()) : null);
            List V2 = j5g.V(arrayList);
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
            int i32 = 0;
            int i42 = 0;
            while (r1.hasNext()) {
            }
            final CharSequence spannedString3 = new SpannedString(spannableStringBuilder3);
            z = this.p;
            final izs t6Var2 = this.s;
            final lfo0 lfo0Var3 = this.q;
            final View textViewEllipsizeEnd2 = this.n;
            final View vkLinkedText2 = this.m;
            if (z) {
            }
            bwt0.i0(this.itemView, new s6(gVar, i32));
        }
    }

    public g(c4 c4Var, lzn lznVar, egs0 egs0Var) {
        this.a = c4Var;
        this.b = lznVar;
        this.c = egs0Var;
    }

    @Override // xsna.p1u0
    public final vfz<? extends AboutVideoItem.i> b(ViewGroup viewGroup) {
        return new a(viewGroup, this.c);
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof AboutVideoItem.i;
    }
}
