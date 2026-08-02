package com.vk.newsfeed.common.views.header;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.avatar.api.VKAvatarView;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.newsfeed.common.views.header.CompactHeaderAvatarView;
import com.vk.newsfeed.common.views.header.HeaderPhotoView;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.cn70;
import xsna.msy;
import xsna.rwm0;
import xsna.ts5;
import xsna.w9r0;
import xsna.x5i;
import xsna.xqf;
import xsna.yn3;

/* compiled from: CompactHeaderAvatarView.kt */
/* loaded from: classes4.dex */
public final class CompactHeaderAvatarView extends FrameLayout implements ts5 {
    public static final /* synthetic */ int j = 0;
    public final VKAvatarView b;
    public final VKAvatarView c;
    public final VkAvatar d;
    public final VKAvatarView e;
    public HeaderPhotoView.c f;
    public final GestureDetector g;
    public final Object h;
    public final Object i;

    static {
        new w9r0.a(cn70.a() * 30.0f, cn70.a() * 30.0f, cn70.a() * 12.0f);
    }

    public CompactHeaderAvatarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.view_post_header_avatar, (ViewGroup) this, true);
        this.b = (VKAvatarView) findViewById(R.id.iv_post_header_avatar);
        this.c = (VKAvatarView) findViewById(R.id.iv_post_header_avatar_overlay);
        this.d = (VkAvatar) findViewById(R.id.iv_post_header_avatar_v2);
        this.e = (VKAvatarView) findViewById(R.id.iv_post_header_avatar_overlay_v2);
        this.g = new GestureDetector(context, new a(), new Handler(Looper.getMainLooper()));
        x5i x5iVar = new x5i(context, this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.h = msy.a(lazyThreadSafetyMode, x5iVar);
        this.i = msy.a(lazyThreadSafetyMode, new xqf(this, 6));
    }

    public static w9r0.c b(CompactHeaderAvatarView compactHeaderAvatarView) {
        int i = rwm0.g;
        return rwm0.a.e(compactHeaderAvatarView.getPhotoViewSize(), compactHeaderAvatarView.getPhotoViewSize());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final w9r0 getAvatarCutoutForSubscribeButton() {
        return (w9r0) this.i.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final int getPhotoViewSize() {
        return ((Number) this.h.getValue()).intValue();
    }

    public void setEmptyImagePlaceholder(int i) {
        VKAvatarView vKAvatarView = this.b;
        if (vKAvatarView != null) {
            vKAvatarView.setPlaceholderImage(i);
        }
        VkAvatar vkAvatar = this.d;
        if (vkAvatar != null) {
            vkAvatar.setPlaceholderImage(i);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void setPhotoClickListener(HeaderPhotoView.c cVar) {
        this.f = cVar;
        View view = this.b;
        if (view == null) {
            view = this.d;
        }
        if (view != null) {
            view.setOnTouchListener(new View.OnTouchListener() { // from class: xsna.y5i
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    CompactHeaderAvatarView compactHeaderAvatarView = CompactHeaderAvatarView.this;
                    return compactHeaderAvatarView.f != null ? compactHeaderAvatarView.g.onTouchEvent(motionEvent) : compactHeaderAvatarView.onTouchEvent(motionEvent);
                }
            });
        }
        VKAvatarView vKAvatarView = this.c;
        if (vKAvatarView == null) {
            vKAvatarView = this.e;
        }
        if (vKAvatarView != null) {
            vKAvatarView.setOnClickListener(new yn3(this, 6));
        }
    }

    @Override // xsna.ts5
    public View getView() {
        return this;
    }
}
