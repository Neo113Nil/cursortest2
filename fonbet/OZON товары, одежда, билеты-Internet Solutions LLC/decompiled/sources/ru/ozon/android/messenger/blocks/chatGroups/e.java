package ru.ozon.android.messenger.blocks.chatGroups;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.utils.f;
import ru.ozon.android.messenger.utils.h;
import ru.ozon.app.android.messenger.R$dimen;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f84689a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Object f84690b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Object f84691c;

    /* renamed from: d, reason: collision with root package name */
    private final int f84692d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final Object f84693e;

    static final class a extends AbstractC7737t implements Function0<Boolean> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(e.a(e.this));
        }
    }

    static final class b extends AbstractC7737t implements Function0<Integer> {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return Integer.valueOf(h.a(e.this.f84689a, R$dimen.m_chat_groups_horizontal_padding) * 2);
        }
    }

    static final class c extends AbstractC7737t implements Function0<Boolean> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(!e.c(e.this));
        }
    }

    public e(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f84689a = context;
        this.f84690b = f.b(new c());
        this.f84691c = f.b(new a());
        this.f84692d = h.a(context, R$dimen.m_min_chat_group_width);
        this.f84693e = f.b(new b());
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [Sc.j, java.lang.Object] */
    public static final boolean a(e eVar) {
        return ((Number) eVar.f84693e.getValue()).intValue() + (eVar.f84692d * 3) < eVar.f84689a.getResources().getDisplayMetrics().widthPixels;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [Sc.j, java.lang.Object] */
    public static final boolean c(e eVar) {
        return ((Boolean) eVar.f84691c.getValue()).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Sc.j, java.lang.Object] */
    public final boolean d() {
        return ((Boolean) this.f84690b.getValue()).booleanValue();
    }
}
