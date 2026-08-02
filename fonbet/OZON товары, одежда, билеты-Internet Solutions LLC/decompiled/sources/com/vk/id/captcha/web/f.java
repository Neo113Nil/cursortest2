package com.vk.id.captcha.web;

import Sc.InterfaceC4008j;
import Sc.k;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes9.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final InterfaceC4008j f60605a = k.b(AnonymousClass1.f60606a);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/vk/id/captcha/c/d;", "a", "()Lcom/vk/id/captcha/c/d;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.vk.id.captcha.web.f$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<com.vk.id.captcha.sensors.d> {

        /* renamed from: a, reason: collision with root package name */
        public static final AnonymousClass1 f60606a = new AnonymousClass1();

        AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.vk.id.captcha.sensors.d invoke() {
            return new com.vk.id.captcha.sensors.d("vk-webview-thread");
        }
    }

    @NotNull
    public static final com.vk.id.captcha.sensors.d a() {
        return (com.vk.id.captcha.sensors.d) f60605a.getValue();
    }
}
