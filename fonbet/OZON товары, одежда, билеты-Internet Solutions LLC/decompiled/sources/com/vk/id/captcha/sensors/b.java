package com.vk.id.captcha.sensors;

import Sc.InterfaceC4008j;
import Sc.k;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final InterfaceC4008j f60549a = k.b(AnonymousClass1.f60550a);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/vk/id/captcha/c/d;", "a", "()Lcom/vk/id/captcha/c/d;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.vk.id.captcha.c.b$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<d> {

        /* renamed from: a, reason: collision with root package name */
        public static final AnonymousClass1 f60550a = new AnonymousClass1();

        AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d invoke() {
            return new d("vk-sensor-thread");
        }
    }

    @NotNull
    public static final d a() {
        return (d) f60549a.getValue();
    }
}
