package com.vk.core.compose.component.datetime;

import java.util.Date;

/* compiled from: SelectableDatetimes.kt */
/* loaded from: classes17.dex */
public interface l {
    public static final a a = a.a;

    /* compiled from: SelectableDatetimes.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();

        /* compiled from: SelectableDatetimes.kt */
        /* renamed from: com.vk.core.compose.component.datetime.l$a$a, reason: collision with other inner class name */
        public static final class C0740a implements l {
            public static final C0740a b = new C0740a();

            @Override // com.vk.core.compose.component.datetime.l
            public final boolean a(Date date) {
                return true;
            }

            @Override // com.vk.core.compose.component.datetime.l
            public final boolean b(Date date) {
                return true;
            }
        }
    }

    boolean a(Date date);

    boolean b(Date date);
}
