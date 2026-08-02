package com.vk.feed.design.view.newsfeed.inline;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.dto.common.VerifyInfo;
import com.vk.feed.design.view.newsfeed.inline.VkFeedInlineCommentView;
import com.vk.typography.Font;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.baf0;
import xsna.cqi;
import xsna.dhr0;
import xsna.drm0;
import xsna.e6k0;
import xsna.f4m;
import xsna.kp40;
import xsna.m7s;
import xsna.msy;
import xsna.qup0;
import xsna.zs1;

/* compiled from: VkFeedInlineCommentContainer.kt */
/* loaded from: classes18.dex */
public final class a extends FrameLayout {
    public final VkFeedInlineCommentView b;
    public final VkAvatar c;
    public final SpannableStringBuilder d;
    public final SpannableStringBuilder e;
    public final SpannableStringBuilder f;
    public final m7s g;
    public final Object h;
    public final Object i;

    public a(Context context) {
        super(context, null, 0);
        this.d = new SpannableStringBuilder();
        this.e = new SpannableStringBuilder();
        this.f = new SpannableStringBuilder();
        this.g = new m7s(R.attr.vk_ui_text_link);
        e6k0 e6k0Var = new e6k0(9);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.h = msy.a(lazyThreadSafetyMode, e6k0Var);
        this.i = msy.a(lazyThreadSafetyMode, new kp40(context, 2));
        LayoutInflater.from(context).inflate(R.layout.pds_inline_comment_container, (ViewGroup) this, true);
        this.b = (VkFeedInlineCommentView) findViewById(R.id.pds_inline_comment_container);
        this.c = (VkAvatar) findViewById(R.id.pds_avatar_inline_comment);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final SpannableStringBuilder getDonutIconText() {
        return (SpannableStringBuilder) this.i.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final SpannableStringBuilder getIconWhiteSpaceText() {
        return (SpannableStringBuilder) this.h.getValue();
    }

    public final void a(String str, CharSequence charSequence, String str2, boolean z, VerifyInfo verifyInfo) {
        SpannableStringBuilder spannableStringBuilder = this.d;
        spannableStringBuilder.clear();
        spannableStringBuilder.clearSpans();
        SpannableStringBuilder spannableStringBuilder2 = this.e;
        spannableStringBuilder2.clear();
        spannableStringBuilder2.clearSpans();
        if (str != null && str.length() != 0) {
            spannableStringBuilder.append((CharSequence) str);
            Typeface a = cqi.a(Font.Companion, FontFamily.MEDIUM, 13.0f, getContext());
            TextSizeUnit textSizeUnit = TextSizeUnit.SP;
            spannableStringBuilder.setSpan(new qup0(a, dhr0.t.c(R.attr.newsfeed_post_title_color)), 0, spannableStringBuilder.length(), 33);
        }
        if (verifyInfo != null && verifyInfo.b) {
            VerifyInfoHelper verifyInfoHelper = VerifyInfoHelper.a;
            baf0 f = VerifyInfoHelper.f(getContext(), VerifyInfoHelper.ColorTheme.normal, verifyInfo);
            if (f != null) {
                if (spannableStringBuilder2.length() > 0 || spannableStringBuilder.length() > 0) {
                    spannableStringBuilder2.append((CharSequence) getIconWhiteSpaceText());
                }
                int length = spannableStringBuilder2.length();
                spannableStringBuilder2.append((CharSequence) "✔️️");
                spannableStringBuilder2.setSpan(new zs1(f), length, spannableStringBuilder2.length(), 33);
            }
        } else if (z) {
            if (spannableStringBuilder2.length() > 0 || spannableStringBuilder.length() > 0) {
                spannableStringBuilder2.append((CharSequence) getIconWhiteSpaceText());
            }
            spannableStringBuilder2.append((CharSequence) getDonutIconText());
        }
        VkFeedInlineCommentView vkFeedInlineCommentView = this.b;
        vkFeedInlineCommentView.b = spannableStringBuilder;
        vkFeedInlineCommentView.c = spannableStringBuilder2;
        vkFeedInlineCommentView.d = charSequence != null ? vkFeedInlineCommentView.z.getTransformation(charSequence, vkFeedInlineCommentView) : null;
        vkFeedInlineCommentView.requestLayout();
        vkFeedInlineCommentView.invalidate();
        SpannableStringBuilder spannableStringBuilder3 = this.f;
        spannableStringBuilder3.clear();
        spannableStringBuilder3.clearSpans();
        if (str2 != null && str2.length() != 0) {
            if (charSequence != null && charSequence.length() != 0) {
                spannableStringBuilder3.append((CharSequence) " ");
            }
            int length2 = spannableStringBuilder3.length();
            spannableStringBuilder3.append((CharSequence) str2);
            spannableStringBuilder3.setSpan(this.g, length2, spannableStringBuilder3.length(), 33);
        }
        vkFeedInlineCommentView.setAttachText(spannableStringBuilder3);
    }

    public final void setAvatar(String str) {
        int i = str == null || drm0.N(str) ? 8 : 0;
        VkAvatar vkAvatar = this.c;
        vkAvatar.setVisibility(i);
        vkAvatar.o0(str, null);
    }

    public final void setCommentStartPadding(int i) {
        f4m.x(i, this.b);
    }

    public final void setInlineCommentViewId(int i) {
        this.b.setId(i);
    }

    public final void setListener(VkFeedInlineCommentView.b bVar) {
        this.b.setListener(bVar);
    }

    public final void setNameTextSpaceWidth(int i) {
        this.b.setNameTextSpaceWidth(i);
    }

    public final void setTextFontSize(float f) {
        this.b.setTextFontSize(f);
    }
}
