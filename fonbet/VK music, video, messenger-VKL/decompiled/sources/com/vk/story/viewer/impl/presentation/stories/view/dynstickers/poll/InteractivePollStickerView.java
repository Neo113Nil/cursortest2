package com.vk.story.viewer.impl.presentation.stories.view.dynstickers.poll;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.text.TextPaint;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.picture.VkImage;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.id.UserId;
import com.vk.dto.polls.GradientPoint;
import com.vk.dto.polls.PhotoPoll;
import com.vk.dto.polls.Poll;
import com.vk.dto.polls.PollBackground;
import com.vk.dto.polls.PollContentColor;
import com.vk.dto.polls.PollGradient;
import com.vk.dto.polls.PollOption;
import com.vk.dto.polls.PollTile;
import com.vk.polls.ui.PollStyle;
import com.vk.stickers.api.styles.StickerColorToken;
import com.vk.stickers.api.styles.StickerCommonStyle;
import com.vk.stories.design.view.polls.VoteProgressButton;
import com.vk.story.viewer.impl.presentation.stories.view.dynstickers.poll.InteractivePollStickerView;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.s;
import io.reactivex.rxjava3.internal.operators.single.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.arb;
import xsna.asp;
import xsna.asu0;
import xsna.aub0;
import xsna.awt0;
import xsna.b1j;
import xsna.bpn0;
import xsna.bwt0;
import xsna.c5g;
import xsna.cn70;
import xsna.csb0;
import xsna.cws;
import xsna.de2;
import xsna.e43;
import xsna.eph;
import xsna.epx;
import xsna.eqb0;
import xsna.f4m;
import xsna.fq1;
import xsna.frg;
import xsna.gb;
import xsna.ho8;
import xsna.hu50;
import xsna.iah0;
import xsna.ikv0;
import xsna.izs;
import xsna.jh3;
import xsna.k7f;
import xsna.l8g;
import xsna.m33;
import xsna.m5y;
import xsna.mor;
import xsna.pdq;
import xsna.qg60;
import xsna.reo;
import xsna.rsg0;
import xsna.rtb0;
import xsna.taa0;
import xsna.tbx;
import xsna.tk40;
import xsna.tn0;
import xsna.tqb0;
import xsna.v2l0;
import xsna.vjo;
import xsna.vk40;
import xsna.vrb0;
import xsna.w2l0;
import xsna.wnt;
import xsna.wrb0;
import xsna.xka0;
import xsna.xld;
import xsna.zf1;
import xsna.zrp;

/* compiled from: InteractivePollStickerView.kt */
/* loaded from: classes6.dex */
public final class InteractivePollStickerView extends FrameLayout {
    public static final int q = iah0.a(8);
    public static final int r = iah0.a(4);
    public static final int s;
    public static final int t;
    public final ViewGroup b;
    public final com.vk.story.viewer.impl.presentation.stories.view.dynstickers.poll.b c;
    public final w2l0 d;
    public final TextView e;
    public final TextView f;
    public final ImageView g;
    public final LinearLayout h;
    public final VkImage i;
    public final VoteProgressButton j;
    public AnimatorSet k;
    public final c l;
    public v2l0 m;
    public final wrb0 n;
    public float o;
    public float p;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: InteractivePollStickerView.kt */
    public static final class ColorAttrsNoBackground {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ColorAttrsNoBackground[] $VALUES;
        public static final ColorAttrsNoBackground INFO_COLOR_NO_BACKGROUND;
        public static final ColorAttrsNoBackground TITLE_COLOR_NO_BACKGROUND;
        private final int colorId;

        static {
            ColorAttrsNoBackground colorAttrsNoBackground = new ColorAttrsNoBackground("TITLE_COLOR_NO_BACKGROUND", 0, R.color.vk_gray_800);
            TITLE_COLOR_NO_BACKGROUND = colorAttrsNoBackground;
            ColorAttrsNoBackground colorAttrsNoBackground2 = new ColorAttrsNoBackground("INFO_COLOR_NO_BACKGROUND", 1, R.color.vk_steel_gray_400);
            INFO_COLOR_NO_BACKGROUND = colorAttrsNoBackground2;
            ColorAttrsNoBackground[] colorAttrsNoBackgroundArr = {colorAttrsNoBackground, colorAttrsNoBackground2};
            $VALUES = colorAttrsNoBackgroundArr;
            $ENTRIES = new asp(colorAttrsNoBackgroundArr);
        }

        public ColorAttrsNoBackground(String str, int i, int i2) {
            this.colorId = i2;
        }

        public static ColorAttrsNoBackground valueOf(String str) {
            return (ColorAttrsNoBackground) Enum.valueOf(ColorAttrsNoBackground.class, str);
        }

        public static ColorAttrsNoBackground[] values() {
            return (ColorAttrsNoBackground[]) $VALUES.clone();
        }

        public final int a(Context context) {
            return context.getColor(this.colorId);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: InteractivePollStickerView.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a INFO_COLOR_WITH_BACKGROUND;
        public static final a TITLE_COLOR_WITH_BACKGROUND;

        /* renamed from: long, reason: not valid java name */
        private final long f42long;

        static {
            a aVar = new a("TITLE_COLOR_WITH_BACKGROUND", 0, 4294967295L);
            TITLE_COLOR_WITH_BACKGROUND = aVar;
            a aVar2 = new a("INFO_COLOR_WITH_BACKGROUND", 1, 3607101439L);
            INFO_COLOR_WITH_BACKGROUND = aVar2;
            a[] aVarArr = {aVar, aVar2};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a(String str, int i, long j) {
            this.f42long = j;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        public final int h() {
            return (int) this.f42long;
        }
    }

    /* compiled from: InteractivePollStickerView.kt */
    public static final class b {
        public final String a;
        public final String b;

        public b(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("StatData(ref=");
            sb.append(this.a);
            sb.append(", trackCode=");
            return ho8.a(sb, this.b, ')');
        }
    }

    static {
        float f = 12;
        s = iah0.a(f);
        t = iah0.a(f);
    }

    public InteractivePollStickerView(Context context, ViewGroup viewGroup, b bVar, com.vk.story.viewer.impl.presentation.stories.view.dynstickers.poll.b bVar2, w2l0 w2l0Var) {
        super(context);
        this.b = viewGroup;
        this.c = bVar2;
        this.d = w2l0Var;
        this.n = new wrb0();
        LayoutInflater.from(context).inflate(R.layout.interactive_poll_view, this);
        this.e = (TextView) findViewById(R.id.poll_title);
        this.f = (TextView) findViewById(R.id.poll_info);
        this.g = (ImageView) findViewById(R.id.iv_icon_poll);
        this.h = (LinearLayout) findViewById(R.id.options_container);
        this.i = (VkImage) findViewById(R.id.poll_background);
        this.j = (VoteProgressButton) findViewById(R.id.btn_voting);
        this.l = new c(bVar, new f(), new d(this));
    }

    private final void setCertainBackground(PollBackground pollBackground) {
        bpn0 bpn0Var = csb0.a;
        int a2 = iah0.a(14);
        v2l0 v2l0Var = this.m;
        boolean z = pollBackground instanceof PhotoPoll;
        VkImage vkImage = this.i;
        if (z) {
            PhotoPoll photoPoll = (PhotoPoll) pollBackground;
            List<ImageSize> list = photoPoll.d;
            int i = taa0.o;
            vkImage.o0(taa0.a.a(photoPoll, iah0.a(344), iah0.a(160)).d.d, null);
        } else if (pollBackground instanceof PollGradient) {
            vkImage.setImageDrawable(new eqb0((PollGradient) pollBackground, a2));
        } else if (pollBackground instanceof PollTile) {
            PollTile pollTile = (PollTile) pollBackground;
            int i2 = vrb0.d;
            ImageSize a3 = vrb0.a.a(pollTile, iah0.v());
            int i3 = pollTile.c;
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(i3);
            gradientDrawable.setCornerRadius(a2);
            vkImage.setBackground(gradientDrawable);
            vkImage.o0(a3.d.d, null);
        } else {
            if (!(pollBackground instanceof PollContentColor)) {
                throw new NoWhenBranchMatchedException();
            }
            csb0.d(vkImage, (PollContentColor) pollBackground, v2l0Var, a2);
        }
        this.g.setColorFilter((z && l8g.d(pollBackground.c)) ? getContext().getColor(R.color.vk_azure_300) : -1, PorterDuff.Mode.SRC_IN);
    }

    private final void setPollBackground(PollBackground pollBackground) {
        VkImage vkImage = this.i;
        vkImage.clear();
        vkImage.setImageBitmap(null);
        vkImage.setBackgroundResource(0);
        if (pollBackground != null) {
            setCertainBackground(pollBackground);
            return;
        }
        vkImage.setImageDrawable(new eqb0(new PollGradient(-1, -1, 0, e43.l(new GradientPoint(-1, ConnectivityTracker.DEFAULT_UPLINK_BITRATE), new GradientPoint(-1, 1.0d)), null), iah0.a(14)));
        this.g.setColorFilter(getContext().getColor(R.color.vk_azure_300), PorterDuff.Mode.SRC_IN);
    }

    private final void setStickerColors(PollBackground pollBackground) {
        if (pollBackground instanceof PollContentColor) {
            PollContentColor pollContentColor = (PollContentColor) pollBackground;
            int i = pollContentColor.d == StickerCommonStyle.ACCENT ? pollContentColor.c : -1;
            w2l0 w2l0Var = this.d;
            this.m = w2l0Var != null ? w2l0Var.a(i) : null;
        }
    }

    public final void a(Poll poll, boolean z) {
        float f;
        int a2;
        int a3;
        final Poll a4 = pdq.a(poll);
        PollBackground pollBackground = a4.s;
        setStickerColors(pollBackground);
        setPollBackground(pollBackground);
        String str = a4.d;
        TextView textView = this.e;
        textView.setText(str);
        v2l0 v2l0Var = this.m;
        Context context = getContext();
        String string = (a4.isExpired() && (pollBackground instanceof PollContentColor)) ? context.getString(R.string.poll_expired_status) : a4.i ? context.getString(R.string.poll_anonymous) : null;
        int i = 0;
        TextView textView2 = this.f;
        if (string != null) {
            textView2.setVisibility(0);
            textView2.setText(string);
        } else {
            textView2.setVisibility(8);
        }
        boolean Fb = a4.Fb();
        boolean z2 = true;
        if (v2l0Var == null || !(pollBackground instanceof PollContentColor)) {
            textView.setTextColor(Fb ? a.TITLE_COLOR_WITH_BACKGROUND.h() : ColorAttrsNoBackground.TITLE_COLOR_NO_BACKGROUND.a(getContext()));
            textView2.setTextColor(Fb ? a.INFO_COLOR_WITH_BACKGROUND.h() : ColorAttrsNoBackground.INFO_COLOR_NO_BACKGROUND.a(getContext()));
        } else {
            StickerCommonStyle stickerCommonStyle = ((PollContentColor) pollBackground).d;
            this.g.setVisibility(8);
            f4m.t(iah0.a(16), textView);
            textView.setTextSize(1, 17.0f);
            textView.setLineHeight(iah0.a(22));
            textView.setTextColor(v2l0Var.b(getContext(), stickerCommonStyle, StickerColorToken.POLL_TITLE));
            textView2.setTextColor(v2l0Var.b(getContext(), stickerCommonStyle, StickerColorToken.POLL_SUBTITLE));
        }
        v2l0 v2l0Var2 = this.m;
        List<PollOption> list = a4.f;
        boolean z3 = v2l0Var2 != null && (pollBackground instanceof PollContentColor);
        int b2 = z3 ? cn70.b(16) : cn70.b(12);
        LinearLayout linearLayout = this.h;
        f4m.t(b2, linearLayout);
        if (linearLayout.getChildCount() > 0) {
            View[] d = awt0.d(linearLayout);
            int length = d.length;
            int i2 = 0;
            int i3 = 0;
            f = 10.0f;
            while (i2 < length) {
                tqb0 tqb0Var = (tqb0) d[i2];
                tqb0Var.a(a4, list.get(i3), z, this.m);
                bwt0.i0(tqb0Var, new tbx(this, a4, i3));
                i2++;
                i3++;
            }
        } else {
            f = 10.0f;
            int i4 = z3 ? t : s;
            float f2 = z3 ? 10.0f : 9.0f;
            final int i5 = 0;
            for (Object obj : list) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    e43.t();
                    throw null;
                }
                int i7 = z3 ? r : q;
                float b3 = iah0.b(f2);
                tqb0 tqb0Var2 = new tqb0(getContext());
                bwt0.i0(tqb0Var2, new izs() { // from class: xsna.sbx
                    @Override // xsna.izs
                    public final Object invoke(Object obj2) {
                        InteractivePollStickerView.this.b(a4, i5);
                        return s3q0.a;
                    }
                });
                tqb0Var2.setVisibility(i);
                tqb0Var2.a(a4, list.get(i5), z2, this.m);
                PollStyle pollStyle = pollBackground instanceof PollContentColor ? PollStyle.CONTENT_COLOR : PollStyle.DYNAMIC;
                this.n.getClass();
                TextPaint a5 = wrb0.a(pollStyle);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, (int) ((2 * b3) + wrb0.b(list.get(i5).c, (int) this.n.e(list.get(i5).c, iah0.a(264) - (iah0.a(12) * 2), 0, 0, a5), a5, pollStyle).getHeight()));
                if (i5 == 0) {
                    i7 = 0;
                }
                layoutParams.topMargin = i7;
                layoutParams.setMarginStart(i4);
                layoutParams.setMarginEnd(i4);
                tqb0Var2.setLayoutParams(layoutParams);
                linearLayout.addView(tqb0Var2);
                i5 = i6;
                i = 0;
                z2 = true;
            }
        }
        boolean Ib = a4.Ib();
        VoteProgressButton voteProgressButton = this.j;
        if (!Ib) {
            voteProgressButton.setVisibility(8);
            return;
        }
        boolean z4 = pollBackground instanceof PollContentColor;
        boolean z5 = z4 && this.m != null;
        v2l0 v2l0Var3 = this.m;
        voteProgressButton.getClass();
        if (z4 && v2l0Var3 != null) {
            StickerCommonStyle stickerCommonStyle2 = ((PollContentColor) pollBackground).d;
            float b4 = iah0.b(f);
            voteProgressButton.setBackground(vjo.a(voteProgressButton.getContext(), v2l0Var3.b(voteProgressButton.getContext(), stickerCommonStyle2, StickerColorToken.POLL_MULTIVOTE_BUTTON_BACKGROUND_FILL), v2l0Var3.b(voteProgressButton.getContext(), stickerCommonStyle2, StickerColorToken.POLL_MULTIVOTE_BUTTON_BACKGROUND_PRESSED), 0, b4, null, b4, 184));
        } else if (pollBackground != null) {
            voteProgressButton.setBackground(m33.a(R.drawable.interactive_poll_ripple_white, voteProgressButton.getContext()));
        } else {
            voteProgressButton.setBackground(m33.a(R.drawable.interactive_poll_ripple_blue, voteProgressButton.getContext()));
        }
        if (z4 && v2l0Var3 != null) {
            voteProgressButton.setTextColor(v2l0Var3.b(voteProgressButton.getContext(), ((PollContentColor) pollBackground).d, StickerColorToken.POLL_MULTIVOTE_BUTTON_TEXT));
            voteProgressButton.setProgressIndicatorColor(-1);
            f4m.t(iah0.a(4), voteProgressButton);
            bwt0.c0(iah0.a(36), voteProgressButton);
        } else if (pollBackground == null) {
            voteProgressButton.setTextColor(-1);
            voteProgressButton.setProgressIndicatorColor(-1);
        } else {
            voteProgressButton.setTextColor(-16777216);
            voteProgressButton.setProgressIndicatorColor(voteProgressButton.getContext().getColor(R.color.vk_gray_300));
        }
        if (!a4.Kb() || !z) {
            voteProgressButton.setVisibility(0);
            int childCount = linearLayout.getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                tqb0 tqb0Var3 = (tqb0) linearLayout.getChildAt(i8);
                tqb0Var3.setClickable(true);
                tqb0Var3.setLongClickable(true);
            }
            voteProgressButton.setText(getContext().getString(z5 ? R.string.poll_send : R.string.poll_vote));
            bwt0.i0(voteProgressButton, new s(18, this, a4));
            voteProgressButton.setEnabled(a4.Kb());
            return;
        }
        int childCount2 = linearLayout.getChildCount();
        for (int i9 = 0; i9 < childCount2; i9++) {
            tqb0 tqb0Var4 = (tqb0) linearLayout.getChildAt(i9);
            tqb0Var4.setClickable(false);
            tqb0Var4.setLongClickable(false);
        }
        voteProgressButton.setText(getContext().getString(R.string.poll_cancel_vote));
        if (a4.Ab()) {
            bwt0.i0(voteProgressButton, new tn0(15, this, a4));
        } else {
            if (z5) {
                a2 = iah0.a(36);
                a3 = iah0.a(16);
            } else {
                a2 = iah0.a(30);
                a3 = iah0.a(12);
            }
            int i10 = a3 + a2;
            if (getLayoutParams() != null) {
                ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
                layoutParams2.height -= i10;
                setTranslationX(this.o);
                setTranslationY(this.p);
                setLayoutParams(layoutParams2);
            }
            bwt0.i0(this, new cws(this, 13));
        }
        voteProgressButton.setVisibility(a4.Ab() ? 0 : 8);
        voteProgressButton.setEnableState(a4.Ab());
    }

    public final void b(Poll poll, int i) {
        com.vk.story.viewer.impl.presentation.stories.view.dynstickers.poll.b bVar = this.c;
        bVar.b.c.invoke(bVar.a);
        boolean isExpired = poll.isExpired();
        List<PollOption> list = poll.f;
        if (isExpired) {
            return;
        }
        boolean Ib = poll.Ib();
        c cVar = this.l;
        if (Ib) {
            d dVar = cVar.c;
            ArrayList arrayList = cVar.d;
            if (arrayList.contains(Integer.valueOf(i))) {
                arrayList.remove(Integer.valueOf(i));
            } else {
                arrayList.add(Integer.valueOf(i));
            }
            if (arrayList.isEmpty()) {
                dVar.a();
            } else {
                dVar.b();
            }
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(list.get(((Number) it.next()).intValue()));
            }
            ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(Long.valueOf(((PollOption) it2.next()).b));
            }
            List<PollOption> list2 = list;
            ArrayList arrayList4 = new ArrayList(c5g.u(list2, 10));
            for (PollOption pollOption : list2) {
                arrayList4.add(new PollOption(pollOption.b, pollOption.c, pollOption.d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
            }
            dVar.d(Poll.zb(poll, null, arrayList3, arrayList4, 0, 0L, false, null, null, null, 4194279), false);
            return;
        }
        f fVar = cVar.b;
        io.reactivex.rxjava3.disposables.b bVar2 = fVar.a;
        d dVar2 = cVar.c;
        long j = list.get(i).b;
        List<Long> list3 = poll.e;
        boolean isEmpty = list3.isEmpty();
        UserId userId = poll.c;
        int i2 = poll.b;
        boolean z = poll.j;
        b bVar3 = cVar.a;
        String str = bVar3.a;
        e eVar = new e(userId, i2, z, bVar3);
        boolean contains = list3.contains(Long.valueOf(j));
        if (!poll.Ab() && poll.Kb()) {
            dVar2.a.c(R.string.poll_restrict_unvoting_warning);
            return;
        }
        dVar2.b();
        if (isEmpty) {
            dVar2.g(i, true);
            List singletonList = Collections.singletonList(Long.valueOf(j));
            eph ephVar = new eph(cVar, 28);
            arb arbVar = new arb(cVar, i, 2);
            bVar2.b(rsg0.D0(new rtb0(userId, str, bVar3.b, z, singletonList, i2, "")).subscribe(new tk40(new jh3(fVar, ephVar, arbVar, 9), 9), new m5y(new de2(1, arbVar), 17)));
            return;
        }
        if (contains) {
            k7f k7fVar = new k7f(cVar, 24);
            b1j b1jVar = new b1j(cVar, 28);
            bVar2.b(rsg0.D0(new aub0(i2, userId, str, bVar3.b, z)).subscribe(new hu50(new xld(fVar, k7fVar, b1jVar, 3), 8), new wnt(new reo(1, b1jVar), 20)));
        } else {
            dVar2.g(i, true);
            List singletonList2 = Collections.singletonList(Long.valueOf(j));
            frg frgVar = new frg(cVar, 24);
            mor morVar = new mor(cVar, i, 1);
            bVar2.b(new r(rsg0.w0(new aub0(i2, userId, str, bVar3.b, z)), new fq1(new gb(27, eVar, singletonList2), 28)).m(asu0.a.d()).subscribe(new vk40(new zf1(fVar, frgVar, morVar), 15), new qg60(new xka0(morVar, 1), 6)));
        }
    }

    public final void c(int i) {
        ikv0.a aVar = new ikv0.a(getContext());
        aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_error_circle_outline_24, Integer.valueOf(R.attr.vk_ui_icon_negative), (Size) null, 12);
        aVar.u = new ikv0.d(getContext().getString(i), (String) null, (ikv0.d.a) null, 6);
        aVar.o = Integer.valueOf(iah0.a(Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE));
        aVar.e = 2000L;
        aVar.l = 80;
        aVar.o(this.b);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.l;
        cVar.d.clear();
        cVar.b.a.e();
    }
}
