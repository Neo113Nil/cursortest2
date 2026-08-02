package io.sentry.react;

import io.sentry.AbstractC4772k2;
import io.sentry.android.core.SentryAndroidOptions;
import java.util.List;

/* renamed from: io.sentry.react.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4817b implements AbstractC4772k2.a {

    /* renamed from: a, reason: collision with root package name */
    public final List f52577a;

    public C4817b(AbstractC4772k2.a... aVarArr) {
        this.f52577a = v0.g.a(aVarArr);
    }

    @Override // io.sentry.AbstractC4772k2.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(SentryAndroidOptions sentryAndroidOptions) {
        for (AbstractC4772k2.a aVar : this.f52577a) {
            if (aVar != null) {
                aVar.a(sentryAndroidOptions);
            }
        }
    }
}
