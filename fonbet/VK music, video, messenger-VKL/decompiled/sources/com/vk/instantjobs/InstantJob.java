package com.vk.instantjobs;

import androidx.core.app.NotificationCompat;
import com.vk.clips.upload.vk.impl.uploader.b;
import java.util.Map;
import xsna.asp;
import xsna.frc;
import xsna.oba0;
import xsna.u6x;
import xsna.vu5;
import xsna.w5b;
import xsna.zrp;

/* compiled from: InstantJob.kt */
/* loaded from: classes.dex */
public abstract class InstantJob {
    public Integer b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: InstantJob.kt */
    /* loaded from: classes2.dex */
    public static final class NotificationHideCondition {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ NotificationHideCondition[] $VALUES;
        public static final NotificationHideCondition NEVER;
        public static final NotificationHideCondition WHEN_UI_VISIBLE;

        static {
            NotificationHideCondition notificationHideCondition = new NotificationHideCondition("NEVER", 0);
            NEVER = notificationHideCondition;
            NotificationHideCondition notificationHideCondition2 = new NotificationHideCondition("WHEN_UI_VISIBLE", 1);
            WHEN_UI_VISIBLE = notificationHideCondition2;
            NotificationHideCondition[] notificationHideConditionArr = {notificationHideCondition, notificationHideCondition2};
            $VALUES = notificationHideConditionArr;
            $ENTRIES = new asp(notificationHideConditionArr);
        }

        public NotificationHideCondition() {
            throw null;
        }

        public static NotificationHideCondition valueOf(String str) {
            return (NotificationHideCondition) Enum.valueOf(NotificationHideCondition.class, str);
        }

        public static NotificationHideCondition[] values() {
            return (NotificationHideCondition[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: InstantJob.kt */
    public static final class NotificationShowCondition {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ NotificationShowCondition[] $VALUES;
        public static final NotificationShowCondition NEVER;
        public static final NotificationShowCondition WHEN_APP_SUSPENDING;
        public static final NotificationShowCondition WHEN_STARTED;
        public static final NotificationShowCondition WHEN_SUBMITED;
        public static final NotificationShowCondition WHEN_UI_INVISIBLE;

        static {
            NotificationShowCondition notificationShowCondition = new NotificationShowCondition("NEVER", 0);
            NEVER = notificationShowCondition;
            NotificationShowCondition notificationShowCondition2 = new NotificationShowCondition("WHEN_SUBMITED", 1);
            WHEN_SUBMITED = notificationShowCondition2;
            NotificationShowCondition notificationShowCondition3 = new NotificationShowCondition("WHEN_STARTED", 2);
            WHEN_STARTED = notificationShowCondition3;
            NotificationShowCondition notificationShowCondition4 = new NotificationShowCondition("WHEN_UI_INVISIBLE", 3);
            WHEN_UI_INVISIBLE = notificationShowCondition4;
            NotificationShowCondition notificationShowCondition5 = new NotificationShowCondition("WHEN_APP_SUSPENDING", 4);
            WHEN_APP_SUSPENDING = notificationShowCondition5;
            NotificationShowCondition[] notificationShowConditionArr = {notificationShowCondition, notificationShowCondition2, notificationShowCondition3, notificationShowCondition4, notificationShowCondition5};
            $VALUES = notificationShowConditionArr;
            $ENTRIES = new asp(notificationShowConditionArr);
        }

        public NotificationShowCondition() {
            throw null;
        }

        public static NotificationShowCondition valueOf(String str) {
            return (NotificationShowCondition) Enum.valueOf(NotificationShowCondition.class, str);
        }

        public static NotificationShowCondition[] values() {
            return (NotificationShowCondition[]) $VALUES.clone();
        }
    }

    /* compiled from: InstantJob.kt */
    /* loaded from: classes2.dex */
    public static abstract class a {

        /* compiled from: InstantJob.kt */
        /* renamed from: com.vk.instantjobs.InstantJob$a$a, reason: collision with other inner class name */
        public static final class C1188a extends a {
            public static final C1188a a = new C1188a();
        }

        /* compiled from: InstantJob.kt */
        public static final class b extends a {
            public static final b a = new b();
        }

        /* compiled from: InstantJob.kt */
        public static final class c extends a {
            public static final c a = new c();
        }

        /* compiled from: InstantJob.kt */
        public static final class d extends a {
            public static final d a = new d();
        }

        /* compiled from: InstantJob.kt */
        public static final class e extends a {
            public final int a;
            public final int b;

            public e(int i, int i2) {
                this.a = i;
                this.b = i2;
            }

            public final int a() {
                return this.b;
            }

            public final int b() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                return this.a == eVar.a && this.b == eVar.b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Progress(value=");
                sb.append(this.a);
                sb.append(", max=");
                return vu5.b(sb, this.b, ')');
            }
        }

        /* compiled from: InstantJob.kt */
        public static final class f extends a {
            public static final f a = new f();
        }

        /* compiled from: InstantJob.kt */
        public static final class g extends a {
            public static final g a = new g();
        }
    }

    public boolean A() {
        return this instanceof frc;
    }

    public boolean B() {
        return this instanceof frc;
    }

    public long i() {
        return 0L;
    }

    public long j() {
        return -1L;
    }

    public String k(Object obj) {
        return null;
    }

    public int l(Object obj) {
        return 1;
    }

    public int m(Object obj) {
        return 1;
    }

    public String n(Object obj) {
        return "";
    }

    public NotificationHideCondition o() {
        return NotificationHideCondition.NEVER;
    }

    public NotificationShowCondition p() {
        return NotificationShowCondition.WHEN_STARTED;
    }

    public String q() {
        return "";
    }

    public long r() {
        return 0L;
    }

    public abstract String s();

    public boolean t() {
        return this instanceof b;
    }

    public abstract void w(Object obj, u6x.a aVar);

    public boolean x() {
        return !(this instanceof oba0);
    }

    public boolean y() {
        return this instanceof w5b;
    }

    public boolean z(Object obj) {
        return false;
    }

    public void h(Object obj) {
    }

    public void u(Object obj) {
    }

    public void D(Object obj, NotificationCompat.h hVar) {
    }

    public void v(Object obj, Throwable th) {
    }

    public void C(Object obj, Map<InstantJob, ? extends a> map, NotificationCompat.h hVar) {
    }
}
