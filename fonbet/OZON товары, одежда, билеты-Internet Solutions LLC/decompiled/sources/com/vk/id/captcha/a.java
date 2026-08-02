package com.vk.id.captcha;

import com.vk.id.captcha.api.data.VKCaptchaError;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lcom/vk/id/captcha/a;", "", "<init>", "()V", "a", "b", "c", "d", "Lcom/vk/id/captcha/a$a;", "Lcom/vk/id/captcha/a$b;", "Lcom/vk/id/captcha/a$c;", "Lcom/vk/id/captcha/a$d;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class a {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/vk/id/captcha/a$a;", "Lcom/vk/id/captcha/a;", "<init>", "()V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.vk.id.captcha.a$a, reason: collision with other inner class name */
    public static final class C0920a extends a {

        @NotNull
        public static final C0920a INSTANCE = new C0920a();

        private C0920a() {
            super(null);
        }
    }

    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final VKCaptchaError f60509a;

        /* renamed from: b, reason: collision with root package name */
        private final String f60510b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull VKCaptchaError vKCaptchaError, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(vKCaptchaError, "");
            this.f60509a = vKCaptchaError;
            this.f60510b = str;
        }

        @NotNull
        public final VKCaptchaError a() {
            return this.f60509a;
        }

        public final String b() {
            return this.f60510b;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/vk/id/captcha/a$c;", "Lcom/vk/id/captcha/a;", "<init>", "()V"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends a {

        @NotNull
        public static final c INSTANCE = new c();

        private c() {
            super(null);
        }
    }

    public static final class d extends a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f60511a;

        /* renamed from: b, reason: collision with root package name */
        private final String f60512b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@NotNull String str, String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.f60511a = str;
            this.f60512b = str2;
        }

        @NotNull
        public final String a() {
            return this.f60511a;
        }

        public final String b() {
            return this.f60512b;
        }
    }

    private a() {
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
