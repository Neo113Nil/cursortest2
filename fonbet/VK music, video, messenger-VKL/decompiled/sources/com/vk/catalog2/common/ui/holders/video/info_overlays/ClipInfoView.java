package com.vk.catalog2.common.ui.holders.video.info_overlays;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.core.tool.view.AspectRatioFrameLayout;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.picture.c;
import com.vk.dto.common.VideoFile;
import com.vkontakte.android.R;
import java.text.DecimalFormat;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.drm0;
import xsna.e43;
import xsna.gpt0;
import xsna.gqs0;
import xsna.izs;
import xsna.m33;
import xsna.tzx0;
import xsna.z8s;
import xsna.zrp;

/* compiled from: ClipInfoView.kt */
/* loaded from: classes16.dex */
public final class ClipInfoView extends com.vk.catalog2.common.ui.holders.video.info_overlays.a {
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final SubtitleStyle g;
    public VkAvatar h;
    public TextView i;
    public TextView j;
    public TextView k;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClipInfoView.kt */
    public static final class SubtitleStyle {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SubtitleStyle[] $VALUES;
        public static final SubtitleStyle CREATION_DATE;
        public static final SubtitleStyle VIEWS_COUNT;

        static {
            SubtitleStyle subtitleStyle = new SubtitleStyle("CREATION_DATE", 0);
            CREATION_DATE = subtitleStyle;
            SubtitleStyle subtitleStyle2 = new SubtitleStyle("VIEWS_COUNT", 1);
            VIEWS_COUNT = subtitleStyle2;
            SubtitleStyle[] subtitleStyleArr = {subtitleStyle, subtitleStyle2};
            $VALUES = subtitleStyleArr;
            $ENTRIES = new asp(subtitleStyleArr);
        }

        public SubtitleStyle() {
            throw null;
        }

        public static SubtitleStyle valueOf(String str) {
            return (SubtitleStyle) Enum.valueOf(SubtitleStyle.class, str);
        }

        public static SubtitleStyle[] values() {
            return (SubtitleStyle[]) $VALUES.clone();
        }
    }

    /* compiled from: ClipInfoView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SubtitleStyle.values().length];
            try {
                iArr[SubtitleStyle.CREATION_DATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SubtitleStyle.VIEWS_COUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ClipInfoView(boolean z, boolean z2, boolean z3, SubtitleStyle subtitleStyle) {
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = subtitleStyle;
    }

    @Override // com.vk.catalog2.common.ui.holders.video.info_overlays.a
    public final void a(VideoFile videoFile, UIBlock uIBlock, gqs0 gqs0Var) {
        Context context;
        String r;
        String j1;
        String P;
        TextView textView = this.i;
        if (textView == null || (context = textView.getContext()) == null) {
            return;
        }
        boolean z = this.d && (P = videoFile.P()) != null && (drm0.N(P) ^ true);
        VkAvatar vkAvatar = this.h;
        if (vkAvatar != null) {
            String M0 = videoFile.M0();
            if (!z || M0 == null) {
                vkAvatar.setVisibility(8);
            } else {
                vkAvatar.setContent(new c.d(M0, null));
                vkAvatar.setVisibility(0);
            }
        }
        TextView textView2 = this.i;
        if (textView2 != null) {
            if (z) {
                textView2.setVisibility(0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) videoFile.P());
                if (videoFile.Y().b) {
                    spannableStringBuilder.append((CharSequence) " ");
                    Drawable a2 = m33.a(R.drawable.vk_icon_verified_16, e43.a);
                    a2.setBounds(0, 0, a2.getIntrinsicWidth(), a2.getIntrinsicHeight());
                    a2.setTint(e43.a.getColor(R.color.vk_white));
                    Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(" ");
                    a2.setBounds(0, 0, a2.getIntrinsicWidth(), a2.getIntrinsicHeight());
                    newSpannable.setSpan(new tzx0(a2, 3, -1.0f, false, 0, 0, 0), 0, 1, 33);
                    spannableStringBuilder.append((CharSequence) newSpannable);
                }
                textView2.setText(spannableStringBuilder);
            } else {
                textView2.setVisibility(8);
            }
        }
        TextView textView3 = this.j;
        if (textView3 != null) {
            textView3.setVisibility((this.e && (j1 = videoFile.j1()) != null && (drm0.N(j1) ^ true)) ? 0 : 8);
            if (textView3.getVisibility() == 0) {
                textView3.setText(videoFile.j1());
            }
        }
        TextView textView4 = this.k;
        if (textView4 != null) {
            textView4.setVisibility((!this.f || videoFile.L8() <= 0) ? 8 : 0);
            if (textView4.getVisibility() == 0) {
                int i = a.$EnumSwitchMapping$0[this.g.ordinal()];
                if (i == 1) {
                    gpt0 gpt0Var = gpt0.a;
                    r = gpt0.r(context, videoFile);
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int L8 = videoFile.L8();
                    DecimalFormat decimalFormat = z8s.a;
                    r = z8s.e(L8, context);
                }
                textView4.setText(r);
            }
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.video.info_overlays.a
    public final void b(LayoutInflater layoutInflater, LinearLayout linearLayout, AspectRatioFrameLayout aspectRatioFrameLayout, View.OnClickListener onClickListener, izs izsVar) {
        this.b = aspectRatioFrameLayout;
        ViewGroup viewGroup = (ViewGroup) layoutInflater.inflate(R.layout.catalog_clip_info, (ViewGroup) aspectRatioFrameLayout, true);
        this.h = (VkAvatar) viewGroup.findViewById(R.id.owner_avatar);
        this.i = (TextView) viewGroup.findViewById(R.id.video_owner_title);
        this.j = (TextView) viewGroup.findViewById(R.id.video_description);
        this.k = (TextView) viewGroup.findViewById(R.id.video_views);
    }

    @Override // com.vk.catalog2.common.ui.holders.video.info_overlays.a
    public final boolean d() {
        return false;
    }
}
