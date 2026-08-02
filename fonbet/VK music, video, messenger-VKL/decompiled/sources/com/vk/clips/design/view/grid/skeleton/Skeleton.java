package com.vk.clips.design.view.grid.skeleton;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.vk.core.view.components.skeleton.VkSkeleton;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.e3m;
import xsna.hav0;
import xsna.iah0;
import xsna.m0u0;
import xsna.zrp;
import xsna.zxj0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Skeleton.kt */
/* loaded from: classes16.dex */
public final class Skeleton {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Skeleton[] $VALUES;
    public static final Skeleton ANOTHER;
    public static final Skeleton HEADER_ANOTHER;
    public static final Skeleton PROFILE;
    public static final Skeleton PROFILE_WITH_TABS;
    private final int layoutId;

    /* compiled from: Skeleton.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Skeleton.values().length];
            try {
                iArr[Skeleton.PROFILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Skeleton.ANOTHER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Skeleton.PROFILE_WITH_TABS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Skeleton.HEADER_ANOTHER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        Skeleton skeleton = new Skeleton("PROFILE", 0, R.layout.clips_grid_content_common_profile_skeleton);
        PROFILE = skeleton;
        Skeleton skeleton2 = new Skeleton("PROFILE_WITH_TABS", 1, R.layout.clips_grid_content_common_new_self_profile_skeleton);
        PROFILE_WITH_TABS = skeleton2;
        Skeleton skeleton3 = new Skeleton("ANOTHER", 2, R.layout.clips_grid_content_common_skeleton);
        ANOTHER = skeleton3;
        Skeleton skeleton4 = new Skeleton("HEADER_ANOTHER", 3, R.layout.clips_grid_common_toolbar_skeleton);
        HEADER_ANOTHER = skeleton4;
        Skeleton[] skeletonArr = {skeleton, skeleton2, skeleton3, skeleton4};
        $VALUES = skeletonArr;
        $ENTRIES = new asp(skeletonArr);
    }

    public Skeleton(String str, int i, int i2) {
        this.layoutId = i2;
    }

    public static Skeleton valueOf(String str) {
        return (Skeleton) Enum.valueOf(Skeleton.class, str);
    }

    public static Skeleton[] values() {
        return (Skeleton[]) $VALUES.clone();
    }

    public final void a(FrameLayout frameLayout) {
        if (this == HEADER_ANOTHER) {
            return;
        }
        VkSkeleton vkSkeleton = (VkSkeleton) frameLayout.findViewById(R.id.view);
        if (vkSkeleton != null) {
            vkSkeleton.setType(VkSkeleton.a.b.a);
        }
        VkSkeleton vkSkeleton2 = (VkSkeleton) frameLayout.findViewById(R.id.first_tab_icon_skeleton);
        if (vkSkeleton2 != null) {
            vkSkeleton2.setType(VkSkeleton.a.b.a);
        }
        VkSkeleton vkSkeleton3 = (VkSkeleton) frameLayout.findViewById(R.id.second_tab_icon_skeleton);
        if (vkSkeleton3 != null) {
            vkSkeleton3.setType(VkSkeleton.a.b.a);
        }
        VkSkeleton vkSkeleton4 = (VkSkeleton) frameLayout.findViewById(R.id.skeleton_avatar);
        if (vkSkeleton4 != null) {
            vkSkeleton4.setType(VkSkeleton.a.b.a);
        }
        VkSkeleton vkSkeleton5 = (VkSkeleton) frameLayout.findViewById(R.id.tab_skeleton);
        if (vkSkeleton5 != null) {
            vkSkeleton5.setOutlineProvider(hav0.c);
        }
        VkSkeleton vkSkeleton6 = (VkSkeleton) frameLayout.findViewById(R.id.first_tab_selected_skeleton);
        if (vkSkeleton6 != null) {
            vkSkeleton6.setOutlineProvider(hav0.c);
        }
        VkSkeleton vkSkeleton7 = (VkSkeleton) frameLayout.findViewById(R.id.first_tab_skeleton);
        if (vkSkeleton7 != null) {
            vkSkeleton7.setOutlineProvider(hav0.c);
        }
        VkSkeleton vkSkeleton8 = (VkSkeleton) frameLayout.findViewById(R.id.second_tab_skeleton);
        if (vkSkeleton8 != null) {
            vkSkeleton8.setOutlineProvider(hav0.c);
        }
        VkSkeleton vkSkeleton9 = (VkSkeleton) frameLayout.findViewById(R.id.skeleton_name);
        if (vkSkeleton9 != null) {
            vkSkeleton9.setOutlineProvider(hav0.c);
        }
        VkSkeleton vkSkeleton10 = (VkSkeleton) frameLayout.findViewById(R.id.skeleton_description);
        if (vkSkeleton10 != null) {
            vkSkeleton10.setOutlineProvider(hav0.c);
        }
        GridView gridView = (GridView) frameLayout.findViewById(R.id.grid_skeleton);
        gridView.setAdapter((ListAdapter) new zxj0());
        int i = a.$EnumSwitchMapping$0[ordinal()];
        if (i == 1 || i == 2) {
            float a2 = iah0.a(20);
            gridView.setClipToOutline(true);
            gridView.setOutlineProvider(new m0u0(a2, false));
        } else if (i != 3 && i != 4) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final FrameLayout b(CoordinatorLayout coordinatorLayout, CoordinatorLayout.f fVar) {
        FrameLayout c = c(coordinatorLayout);
        a(c);
        coordinatorLayout.addView(c, 1, fVar);
        return c;
    }

    public final FrameLayout c(ViewGroup viewGroup) {
        return (FrameLayout) e3m.b(viewGroup.getContext()).inflate(this.layoutId, viewGroup, false);
    }
}
