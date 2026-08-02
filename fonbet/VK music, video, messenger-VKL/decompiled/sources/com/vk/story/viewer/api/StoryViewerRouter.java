package com.vk.story.viewer.api;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.story.api.LoadContext;
import java.util.List;
import kotlin.NotImplementedError;
import xsna.asp;
import xsna.f5z;
import xsna.gzs;
import xsna.h1m0;
import xsna.izs;
import xsna.mcj0;
import xsna.s3q0;
import xsna.tjs;
import xsna.x9l0;
import xsna.zrp;

/* compiled from: StoryViewerRouter.kt */
/* loaded from: classes11.dex */
public interface StoryViewerRouter {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StoryViewerRouter.kt */
    /* loaded from: classes6.dex */
    public static final class InOutAnimation {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ InOutAnimation[] $VALUES;
        public static final InOutAnimation PointToFullScreen;
        public static final InOutAnimation RectToFullScreen;

        static {
            InOutAnimation inOutAnimation = new InOutAnimation("PointToFullScreen", 0);
            PointToFullScreen = inOutAnimation;
            InOutAnimation inOutAnimation2 = new InOutAnimation("RectToFullScreen", 1);
            RectToFullScreen = inOutAnimation2;
            InOutAnimation[] inOutAnimationArr = {inOutAnimation, inOutAnimation2};
            $VALUES = inOutAnimationArr;
            $ENTRIES = new asp(inOutAnimationArr);
        }

        public InOutAnimation() {
            throw null;
        }

        public static InOutAnimation valueOf(String str) {
            return (InOutAnimation) Enum.valueOf(InOutAnimation.class, str);
        }

        public static InOutAnimation[] values() {
            return (InOutAnimation[]) $VALUES.clone();
        }
    }

    /* compiled from: StoryViewerRouter.kt */
    /* loaded from: classes6.dex */
    public interface b {
        void Q0();
    }

    static /* synthetic */ void d(StoryViewerRouter storyViewerRouter, Context context, List list, String str, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, LoadContext loadContext, String str2, String str3, String str4, Parcelable parcelable, int i) {
        if ((i & 2) != 0) {
            list = null;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            mobileOfficialAppsConStoriesStat$ViewEntryPoint = null;
        }
        if ((i & 16) != 0) {
            loadContext = null;
        }
        if ((i & 32) != 0) {
            str2 = null;
        }
        if ((i & 64) != 0) {
            str3 = null;
        }
        boolean z = (i & 128) == 0;
        if ((i & 512) != 0) {
            str4 = "";
        }
        storyViewerRouter.g(context, list, str, mobileOfficialAppsConStoriesStat$ViewEntryPoint, loadContext, str2, str3, z, str4, (i & 2048) != 0 ? null : parcelable);
    }

    static /* synthetic */ void e(StoryViewerRouter storyViewerRouter, Context context, StoryEntry storyEntry, LoadContext loadContext, Parcelable parcelable, int i) {
        if ((i & 4) != 0) {
            loadContext = LoadContext.AllBySingleStory.b;
        }
        if ((i & 16) != 0) {
            parcelable = null;
        }
        storyViewerRouter.f(context, storyEntry, loadContext, parcelable);
    }

    void b(Context context, UserId userId, int i, String str, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint);

    void c(Activity activity, List list, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, String str, f5z f5zVar, tjs tjsVar);

    void f(Context context, StoryEntry storyEntry, LoadContext loadContext, Parcelable parcelable);

    void g(Context context, List list, String str, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, LoadContext loadContext, String str2, String str3, boolean z, String str4, Parcelable parcelable);

    Dialog h(Activity activity, List<? extends StoriesContainer> list, String str, StoriesContainer storiesContainer, boolean z, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint2, String str2, String str3, String str4, a aVar, InOutAnimation inOutAnimation, com.vk.story.api.a aVar2, int i, int i2, DialogInterface.OnDismissListener onDismissListener, DialogInterface.OnShowListener onShowListener, b bVar, f5z f5zVar, long j);

    void i(Context context, long j, int i, x9l0 x9l0Var, mcj0 mcj0Var);

    void j(ViewGroup viewGroup, List list, gzs gzsVar, gzs gzsVar2, izs izsVar);

    Dialog k(h1m0 h1m0Var);

    void l(View view, StoryOwner storyOwner, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, gzs<s3q0> gzsVar);

    /* compiled from: StoryViewerRouter.kt */
    /* loaded from: classes6.dex */
    public interface a {
        View k(String str);

        default void j(String str) {
        }
    }

    /* compiled from: StoryViewerRouter.kt */
    /* loaded from: classes6.dex */
    public static final class c {
        public static final /* synthetic */ c a = new c();
        private static final StoryViewerRouter STUB = new a();

        public final StoryViewerRouter getSTUB() {
            return STUB;
        }

        /* compiled from: StoryViewerRouter.kt */
        public static final class a implements StoryViewerRouter {
            @Override // com.vk.story.viewer.api.StoryViewerRouter
            public final void c(Activity activity, List list, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, String str, f5z f5zVar, tjs tjsVar) {
                throw new NotImplementedError();
            }

            @Override // com.vk.story.viewer.api.StoryViewerRouter
            public final Dialog h(Activity activity, List<? extends StoriesContainer> list, String str, StoriesContainer storiesContainer, boolean z, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint2, String str2, String str3, String str4, a aVar, InOutAnimation inOutAnimation, com.vk.story.api.a aVar2, int i, int i2, DialogInterface.OnDismissListener onDismissListener, DialogInterface.OnShowListener onShowListener, b bVar, f5z f5zVar, long j) {
                return new Dialog(activity);
            }

            @Override // com.vk.story.viewer.api.StoryViewerRouter
            public final Dialog k(h1m0 h1m0Var) {
                return new Dialog(h1m0Var.a.a);
            }

            @Override // com.vk.story.viewer.api.StoryViewerRouter
            public final void f(Context context, StoryEntry storyEntry, LoadContext loadContext, Parcelable parcelable) {
            }

            @Override // com.vk.story.viewer.api.StoryViewerRouter
            public final void b(Context context, UserId userId, int i, String str, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint) {
            }

            @Override // com.vk.story.viewer.api.StoryViewerRouter
            public final void i(Context context, long j, int i, x9l0 x9l0Var, mcj0 mcj0Var) {
            }

            @Override // com.vk.story.viewer.api.StoryViewerRouter
            public final void j(ViewGroup viewGroup, List list, gzs gzsVar, gzs gzsVar2, izs izsVar) {
            }

            @Override // com.vk.story.viewer.api.StoryViewerRouter
            public final void l(View view, StoryOwner storyOwner, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, gzs<s3q0> gzsVar) {
            }

            @Override // com.vk.story.viewer.api.StoryViewerRouter
            public final void g(Context context, List list, String str, MobileOfficialAppsConStoriesStat$ViewEntryPoint mobileOfficialAppsConStoriesStat$ViewEntryPoint, LoadContext loadContext, String str2, String str3, boolean z, String str4, Parcelable parcelable) {
            }
        }
    }
}
