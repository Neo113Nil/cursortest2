package com.vk.id.captcha.web;

import Sc.InterfaceC4008j;
import Sc.k;
import android.net.Uri;
import android.webkit.URLUtil;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f60588a = k.b(AnonymousClass1.f60589a);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/text/Regex;", "a", "()Lkotlin/text/Regex;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.vk.id.captcha.web.a$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Regex> {

        /* renamed from: a, reason: collision with root package name */
        public static final AnonymousClass1 f60589a = new AnonymousClass1();

        AnonymousClass1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Regex invoke() {
            return new Regex("(^|[a-z0-9.\\-]*\\.)(vk|vkontakte)\\.(com|ru|me)");
        }
    }

    public final boolean a(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (!URLUtil.isHttpsUrl(str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        Intrinsics.f(parse);
        String host = parse.getHost();
        if (host == null || host.length() == 0) {
            return false;
        }
        String valueOf = String.valueOf(parse.getHost());
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "");
        String lowerCase = valueOf.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return ((Regex) this.f60588a.getValue()).f(lowerCase);
    }
}
