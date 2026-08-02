package com.vk.feed.design.view.newsfeed.reactionstack;

import android.content.Context;
import android.graphics.Path;
import android.util.AttributeSet;
import android.util.SizeF;
import android.widget.FrameLayout;
import com.vk.core.ui.image.VKImageController;
import com.vk.core.view.components.picture.VkImage;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import ru.ok.android.webrtc.stat.call.methods.call_stat.OutgoingAudioStatistics;
import xsna.cu1;
import xsna.e43;
import xsna.iah0;
import xsna.lg;
import xsna.m1o;
import xsna.msy;
import xsna.ob0;
import xsna.tbh;

/* compiled from: FeedMiniReactionsStack.kt */
/* loaded from: classes18.dex */
public final class FeedMiniReactionsStack extends FrameLayout {
    public static final /* synthetic */ int i = 0;
    public final float b;
    public final float c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;

    public FeedMiniReactionsStack(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = 16.0f;
        this.c = 20.0f;
        lg lgVar = new lg(14);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.d = msy.a(lazyThreadSafetyMode, lgVar);
        this.e = msy.a(lazyThreadSafetyMode, new m1o(this, 4));
        this.f = msy.a(lazyThreadSafetyMode, new ob0(this, 11));
        this.g = msy.a(lazyThreadSafetyMode, new tbh(this, 16));
        this.h = msy.a(lazyThreadSafetyMode, new cu1(12));
    }

    public static VKImageController.b a(FeedMiniReactionsStack feedMiniReactionsStack) {
        return VKImageController.b.a(feedMiniReactionsStack.getDefaultReactionParams(), null, null, feedMiniReactionsStack.getCutoutClipPath(), OutgoingAudioStatistics.AUDIO_LEVEL_MULTIPLIER_FOR_BACKEND);
    }

    public static Path b(FeedMiniReactionsStack feedMiniReactionsStack) {
        Path path = new Path();
        float f = 2;
        float b = iah0.b(feedMiniReactionsStack.b) / f;
        path.addCircle(iah0.b(feedMiniReactionsStack.getReactionOffset().getWidth()) + b, iah0.b(feedMiniReactionsStack.getReactionOffset().getHeight()) + b, iah0.b(feedMiniReactionsStack.c) / f, Path.Direction.CW);
        path.setFillType(Path.FillType.INVERSE_WINDING);
        return path;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final Path getCutoutClipPath() {
        return (Path) this.e.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VKImageController.b getCutoutReactionParams() {
        return (VKImageController.b) this.g.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VKImageController.b getDefaultReactionParams() {
        return (VKImageController.b) this.f.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final SizeF getReactionOffset() {
        return (SizeF) this.d.getValue();
    }

    private final VkImage getReactionView() {
        VkImage vkImage = new VkImage(getContext(), null, 6, 0);
        vkImage.setPlaceholderImage(getDefaultReactionParams().e);
        return vkImage;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final List<VkImage> getReactionViewList() {
        return (List) this.h.getValue();
    }

    public final void setReactions(List<String> list) {
        VkImage reactionView;
        Iterator<T> it = getReactionViewList().iterator();
        while (it.hasNext()) {
            ((VkImage) it.next()).setVisibility(8);
        }
        int i2 = 0;
        for (Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                e43.t();
                throw null;
            }
            String str = (String) obj;
            VKImageController.b cutoutReactionParams = i2 != 0 ? getCutoutReactionParams() : getDefaultReactionParams();
            List<VkImage> reactionViewList = getReactionViewList();
            if (i2 < 0 || i2 >= reactionViewList.size()) {
                reactionView = getReactionView();
                getReactionViewList().add(reactionView);
                addView(reactionView);
            } else {
                reactionView = reactionViewList.get(i2);
            }
            VkImage vkImage = reactionView;
            float f = this.b;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) iah0.b(f), (int) iah0.b(f));
            layoutParams.gravity = 8388691;
            SizeF reactionOffset = getReactionOffset();
            float f2 = i2;
            layoutParams.setMarginStart((int) (Math.abs(iah0.b(reactionOffset.getWidth())) * f2));
            layoutParams.bottomMargin = (int) (Math.abs(iah0.b(reactionOffset.getHeight())) * f2);
            vkImage.setLayoutParams(layoutParams);
            vkImage.setVisibility(0);
            Path path = cutoutReactionParams.p;
            if (path != null) {
                vkImage.setCutout(path);
            } else {
                vkImage.setCutout(null);
            }
            vkImage.o0(str, null);
            i2 = i3;
        }
    }
}
