package com.vk.bridges;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.vk.dto.attaches.AttachForMediaViewer;
import com.vk.dto.attaches.AttachWithImage;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.stat.scheme.MobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint;
import defpackage.q0;
import java.util.List;
import java.util.Set;
import xsna.asp;
import xsna.epx;
import xsna.fw3;
import xsna.o25;
import xsna.qoy;
import xsna.rl3;
import xsna.zrp;

/* compiled from: ImageViewer.kt */
/* loaded from: classes.dex */
public interface ImageViewer {

    /* compiled from: ImageViewer.kt */
    /* loaded from: classes15.dex */
    public static final class ControlsOptions {
        public final boolean a;
        public final boolean b;
        public final boolean c;
        public final Set<MenuItem> d;
        public final boolean e;
        public final boolean f;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ImageViewer.kt */
        public static final class MenuItem {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ MenuItem[] $VALUES;
            public static final MenuItem ADD_TO_DOCUMENTS;
            public static final MenuItem ADD_TO_SAVED;
            public static final MenuItem ATTACH_GOOD;
            public static final MenuItem ATTACH_MARKET_SERVICE;
            public static final MenuItem COPY_LINK;
            public static final a Companion;
            public static final MenuItem DELETE_PHOTO;
            public static final MenuItem DOWNLOAD;
            public static final MenuItem EDIT;
            public static final MenuItem GO_TO_ALBUM;
            public static final MenuItem MAKE_PROFILE_PHOTO;
            public static final MenuItem OPEN_PHOTO_EDITOR;
            public static final MenuItem REPORT_CONTENT;

            /* compiled from: ImageViewer.kt */
            public static final class a {
                public static Set a() {
                    return rl3.y0(new MenuItem[]{MenuItem.EDIT, MenuItem.ATTACH_GOOD, MenuItem.ATTACH_MARKET_SERVICE, MenuItem.MAKE_PROFILE_PHOTO, MenuItem.DOWNLOAD, MenuItem.ADD_TO_SAVED, MenuItem.ADD_TO_DOCUMENTS, MenuItem.COPY_LINK, MenuItem.GO_TO_ALBUM, MenuItem.DELETE_PHOTO, MenuItem.REPORT_CONTENT});
                }
            }

            static {
                MenuItem menuItem = new MenuItem("EDIT", 0);
                EDIT = menuItem;
                MenuItem menuItem2 = new MenuItem("ATTACH_GOOD", 1);
                ATTACH_GOOD = menuItem2;
                MenuItem menuItem3 = new MenuItem("ATTACH_MARKET_SERVICE", 2);
                ATTACH_MARKET_SERVICE = menuItem3;
                MenuItem menuItem4 = new MenuItem("MAKE_PROFILE_PHOTO", 3);
                MAKE_PROFILE_PHOTO = menuItem4;
                MenuItem menuItem5 = new MenuItem("DOWNLOAD", 4);
                DOWNLOAD = menuItem5;
                MenuItem menuItem6 = new MenuItem("ADD_TO_SAVED", 5);
                ADD_TO_SAVED = menuItem6;
                MenuItem menuItem7 = new MenuItem("ADD_TO_DOCUMENTS", 6);
                ADD_TO_DOCUMENTS = menuItem7;
                MenuItem menuItem8 = new MenuItem("COPY_LINK", 7);
                COPY_LINK = menuItem8;
                MenuItem menuItem9 = new MenuItem("GO_TO_ALBUM", 8);
                GO_TO_ALBUM = menuItem9;
                MenuItem menuItem10 = new MenuItem("DELETE_PHOTO", 9);
                DELETE_PHOTO = menuItem10;
                MenuItem menuItem11 = new MenuItem("REPORT_CONTENT", 10);
                REPORT_CONTENT = menuItem11;
                MenuItem menuItem12 = new MenuItem("OPEN_PHOTO_EDITOR", 11);
                OPEN_PHOTO_EDITOR = menuItem12;
                MenuItem[] menuItemArr = {menuItem, menuItem2, menuItem3, menuItem4, menuItem5, menuItem6, menuItem7, menuItem8, menuItem9, menuItem10, menuItem11, menuItem12};
                $VALUES = menuItemArr;
                $ENTRIES = new asp(menuItemArr);
                Companion = new a();
            }

            public MenuItem() {
                throw null;
            }

            public static MenuItem valueOf(String str) {
                return (MenuItem) Enum.valueOf(MenuItem.class, str);
            }

            public static MenuItem[] values() {
                return (MenuItem[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public ControlsOptions() {
            this(r2, r2, null, 255);
            boolean z = false;
        }

        public static ControlsOptions a(ControlsOptions controlsOptions, boolean z, Set set, boolean z2, int i) {
            boolean z3 = (i & 1) != 0 ? controlsOptions.a : false;
            if ((i & 2) != 0) {
                z = controlsOptions.b;
            }
            boolean z4 = z;
            boolean z5 = controlsOptions.c;
            if ((i & 8) != 0) {
                set = controlsOptions.d;
            }
            Set set2 = set;
            controlsOptions.getClass();
            controlsOptions.getClass();
            boolean z6 = controlsOptions.e;
            if ((i & 128) != 0) {
                z2 = controlsOptions.f;
            }
            controlsOptions.getClass();
            return new ControlsOptions(z3, z4, z5, set2, z6, z2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ControlsOptions)) {
                return false;
            }
            ControlsOptions controlsOptions = (ControlsOptions) obj;
            return this.a == controlsOptions.a && this.b == controlsOptions.b && this.c == controlsOptions.c && epx.f(this.d, controlsOptions.d) && this.e == controlsOptions.e && this.f == controlsOptions.f;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f) + qoy.b(qoy.b(qoy.b(fw3.b(qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, false), 31, false), 31, this.e);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ControlsOptions(allowControls=");
            sb.append(this.a);
            sb.append(", allowMenu=");
            sb.append(this.b);
            sb.append(", allowReactions=");
            sb.append(this.c);
            sb.append(", menuItems=");
            sb.append(this.d);
            sb.append(", pickGoodsOnPhotoTap=false, deleteGoodsOnCancel=false, shouldLoadControlsInfo=");
            sb.append(this.e);
            sb.append(", allowTaggingGoods=");
            return q0.a(sb, this.f, ')');
        }

        public ControlsOptions(boolean z, boolean z2, boolean z3, Set set, boolean z4, boolean z5) {
            this.a = z;
            this.b = z2;
            this.c = z3;
            this.d = set;
            this.e = z4;
            this.f = z5;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ ControlsOptions(boolean z, boolean z2, Set set, int i) {
            this(r3, r4, r5, set, (i & 64) != 0, (i & 128) == 0);
            boolean z3 = (i & 1) != 0 ? true : z;
            boolean z4 = (i & 2) != 0 ? true : z2;
            boolean z5 = (i & 4) != 0;
            if ((i & 8) != 0) {
                MenuItem.Companion.getClass();
                set = MenuItem.a.a();
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ImageViewer.kt */
    /* loaded from: classes15.dex */
    public static final class SwipeDirection {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SwipeDirection[] $VALUES;
        public static final SwipeDirection INITIAL;
        public static final SwipeDirection LEFT;
        public static final SwipeDirection RIGHT;

        static {
            SwipeDirection swipeDirection = new SwipeDirection("INITIAL", 0);
            INITIAL = swipeDirection;
            SwipeDirection swipeDirection2 = new SwipeDirection("LEFT", 1);
            LEFT = swipeDirection2;
            SwipeDirection swipeDirection3 = new SwipeDirection("RIGHT", 2);
            RIGHT = swipeDirection3;
            SwipeDirection[] swipeDirectionArr = {swipeDirection, swipeDirection2, swipeDirection3};
            $VALUES = swipeDirectionArr;
            $ENTRIES = new asp(swipeDirectionArr);
        }

        public SwipeDirection() {
            throw null;
        }

        public static SwipeDirection valueOf(String str) {
            return (SwipeDirection) Enum.valueOf(SwipeDirection.class, str);
        }

        public static SwipeDirection[] values() {
            return (SwipeDirection[]) $VALUES.clone();
        }
    }

    /* compiled from: ImageViewer.kt */
    /* loaded from: classes15.dex */
    public interface d {
    }

    /* compiled from: ImageViewer.kt */
    /* loaded from: classes15.dex */
    public interface e<T> extends c<T> {

        /* compiled from: ImageViewer.kt */
        public static final class a {
            public static com.vk.bridges.b a() {
                return new com.vk.bridges.b();
            }
        }

        void m();

        void n(float f, float f2, float f3, float f4, float f5);
    }

    static /* synthetic */ c a(ImageViewer imageViewer, AttachWithImage attachWithImage, List list, Activity activity, a aVar, boolean z, UserId userId, int i) {
        if ((i & 128) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 256) != 0) {
            userId = o25.a().c();
        }
        return imageViewer.k(attachWithImage, list, activity, aVar, z2, userId);
    }

    static /* synthetic */ c b(ImageViewer imageViewer, int i, List list, Context context, a aVar, boolean z, UserId userId, int i2) {
        if ((i2 & 128) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i2 & 256) != 0) {
            userId = o25.a().c();
        }
        return imageViewer.j(i, list, context, aVar, z2, userId);
    }

    static /* synthetic */ c f(ImageViewer imageViewer, int i, List list, Activity activity, a aVar, String str, String str2, MobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint mobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint, boolean z, String str3, boolean z2, int i2) {
        if ((i2 & 16) != 0) {
            str = null;
        }
        if ((i2 & 32) != 0) {
            str2 = null;
        }
        if ((i2 & 64) != 0) {
            mobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint = null;
        }
        if ((i2 & 128) != 0) {
            z = false;
        }
        UserId c2 = o25.a().c();
        if ((i2 & 1024) != 0) {
            str3 = null;
        }
        if ((i2 & 2048) != 0) {
            z2 = true;
        }
        return imageViewer.h(i, list, activity, aVar, str, str2, mobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint, z, c2, str3, z2);
    }

    default e e(int i, List list, Activity activity, a aVar, String str, String str2, boolean z, MobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint mobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint) {
        return e.a.a();
    }

    default c g(int i, List list, Context context, a aVar, UserId userId) {
        return c.a.a();
    }

    default c h(int i, List list, Activity activity, a aVar, String str, String str2, MobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint mobileOfficialAppsConPhotosStat$PhotoViewerEntrypoint, boolean z, UserId userId, String str3, boolean z2) {
        return c.a.a();
    }

    default c i(int i, List list, Activity activity, a aVar, Long l, boolean z, UserId userId) {
        return c.a.a();
    }

    default c j(int i, List list, Context context, a aVar, boolean z, UserId userId) {
        return c.a.a();
    }

    default c k(AttachWithImage attachWithImage, List list, Activity activity, a aVar, boolean z, UserId userId) {
        return c.a.a();
    }

    /* compiled from: ImageViewer.kt */
    /* loaded from: classes15.dex */
    public interface a {
        default View c(int i) {
            return null;
        }

        default Rect d(int i) {
            return null;
        }

        default Integer f() {
            return null;
        }

        default Rect g() {
            return null;
        }

        default boolean h() {
            return true;
        }

        default String i() {
            return null;
        }

        default Context j() {
            return null;
        }

        default String m(int i, int i2) {
            return null;
        }

        default float[] q(int i) {
            return null;
        }

        default d r() {
            return null;
        }

        default boolean s() {
            return true;
        }

        default ControlsOptions u() {
            boolean z = false;
            return new ControlsOptions(z, z, null, 255);
        }

        default void a() {
        }

        default void o() {
        }

        default void onDismiss() {
        }

        default void p() {
        }

        default void b(int i) {
        }

        default void e(int i) {
        }

        default void n(int i) {
        }

        default void t(Photo photo) {
        }

        default void v(AttachForMediaViewer attachForMediaViewer, SwipeDirection swipeDirection, boolean z) {
        }
    }

    /* compiled from: ImageViewer.kt */
    /* loaded from: classes15.dex */
    public static class b implements a {
        @Override // com.vk.bridges.ImageViewer.a
        public View c(int i) {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final Rect d(int i) {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public Integer f() {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public Rect g() {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final boolean h() {
            return true;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final String i() {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final Context j() {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public String m(int i, int i2) {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public float[] q(int i) {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final d r() {
            return null;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final boolean s() {
            return true;
        }

        @Override // com.vk.bridges.ImageViewer.a
        public void a() {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public void o() {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public void onDismiss() {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void p() {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void b(int i) {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public void e(int i) {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void n(int i) {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void t(Photo photo) {
        }

        @Override // com.vk.bridges.ImageViewer.a
        public final void v(AttachForMediaViewer attachForMediaViewer, SwipeDirection swipeDirection, boolean z) {
        }
    }

    /* compiled from: ImageViewer.kt */
    /* loaded from: classes15.dex */
    public interface c<T> {

        /* compiled from: ImageViewer.kt */
        public static final class a {
            public static com.vk.bridges.a a() {
                return new com.vk.bridges.a();
            }
        }

        void a(boolean z);

        void c(List<? extends T> list);

        default int e() {
            return -1;
        }

        default void d(boolean z) {
        }

        default void b(List<? extends T> list, List<? extends T> list2) {
        }
    }
}
