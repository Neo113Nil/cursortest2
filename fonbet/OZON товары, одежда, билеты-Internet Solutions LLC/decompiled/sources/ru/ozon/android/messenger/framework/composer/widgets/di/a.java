package ru.ozon.android.messenger.framework.composer.widgets.di;

import android.content.Context;
import com.squareup.moshi.Moshi;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.messenger.framework.composer.widgets.di.f;
import ru.ozon.android.messenger.framework.di.C;
import ru.ozon.android.messenger.framework.di.F;

/* loaded from: classes10.dex */
public final class a {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ru.ozon.android.messenger.framework.composer.widgets.di.a$a, reason: collision with other inner class name */
    static final class C1552a implements f.a {
        public final f a(Context context, JsonParser jsonParser, ru.ozon.android.messenger.framework.data.remote.serialize.b bVar, Moshi moshi, ru.ozon.android.messenger.framework.composer.di.dependencies.a aVar, F f7, ru.ozon.android.messenger.framework.composer.commonwidgets.di.a aVar2, C c11) {
            context.getClass();
            jsonParser.getClass();
            bVar.getClass();
            moshi.getClass();
            return new b(aVar, f7, aVar2, c11, jsonParser);
        }
    }

    private static final class b implements f {

        /* renamed from: a, reason: collision with root package name */
        private final JsonParser f86825a;

        /* renamed from: b, reason: collision with root package name */
        private final ru.ozon.android.messenger.framework.composer.di.dependencies.a f86826b;

        /* renamed from: c, reason: collision with root package name */
        private final C f86827c;

        /* renamed from: d, reason: collision with root package name */
        private final ru.ozon.android.messenger.framework.composer.commonwidgets.di.a f86828d;

        /* renamed from: e, reason: collision with root package name */
        private final F f86829e;

        b(ru.ozon.android.messenger.framework.composer.di.dependencies.a aVar, F f7, ru.ozon.android.messenger.framework.composer.commonwidgets.di.a aVar2, C c11, JsonParser jsonParser) {
            this.f86825a = jsonParser;
            this.f86826b = aVar;
            this.f86827c = c11;
            this.f86828d = aVar2;
            this.f86829e = f7;
        }
    }

    public static f.a a() {
        return new C1552a();
    }
}
