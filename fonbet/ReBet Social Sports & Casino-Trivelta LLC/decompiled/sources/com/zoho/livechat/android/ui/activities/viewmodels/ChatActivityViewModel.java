package com.zoho.livechat.android.ui.activities.viewmodels;

import Kd.a;
import Od.h;
import android.app.Application;
import androidx.lifecycle.Q;
import com.zoho.livechat.android.modules.common.domain.entities.Form;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import com.zoho.livechat.android.utils.LiveChatUtil;
import ie.EnumC4544a;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import og.i;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0010\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0017\u001a\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u0017\u001a\u0004\b'\u0010(R\u001b\u0010.\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u0017\u001a\u0004\b,\u0010-R\u0013\u00102\u001a\u0004\u0018\u00010/8F¢\u0006\u0006\u001a\u0004\b0\u00101\u0082\u0002\u0004\n\u0002\b\u0019¨\u00063"}, d2 = {"Lcom/zoho/livechat/android/ui/activities/viewmodels/ChatActivityViewModel;", "Landroidx/lifecycle/Q;", "<init>", "()V", "Lie/a;", "appStatus", "Lcom/zoho/livechat/android/modules/common/domain/entities/Form;", com.google.crypto.tink.integration.android.b.f37029b, "(Lie/a;)Lcom/zoho/livechat/android/modules/common/domain/entities/Form;", "", "f", "(Lie/a;)Z", "form", "", "acknowledgementKey", "isTriggeredChat", com.bumptech.glide.gifdecoder.e.f29601m, "(Lcom/zoho/livechat/android/modules/common/domain/entities/Form;Ljava/lang/String;Z)Z", "", "g", "(Lie/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LKd/a;", "s", "Lkotlin/Lazy;", "getBrandRepository", "()LKd/a;", "brandRepository", "LOd/h;", "t", "getSyncFormUseCase", "()LOd/h;", "syncFormUseCase", "LOd/c;", "u", "getGetFormUseCase", "()LOd/c;", "getFormUseCase", "LOd/b;", "v", "getGetCurrentFormMessageUseCase", "()LOd/b;", "getCurrentFormMessageUseCase", "LOd/e;", "w", W9.d.f13160a, "()LOd/e;", "getIsFormSyncedUseCase", "Lcom/zoho/livechat/android/modules/common/domain/entities/Form$Message;", "getCurrentFormMessage", "()Lcom/zoho/livechat/android/modules/common/domain/entities/Form$Message;", "currentFormMessage", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ChatActivityViewModel extends Q {

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public final Lazy brandRepository = LazyKt.lazy(a.f44313d);

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public final Lazy syncFormUseCase = LazyKt.lazy(new e());

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public final Lazy getFormUseCase = LazyKt.lazy(new c());

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public final Lazy getCurrentFormMessageUseCase = LazyKt.lazy(new b());

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public final Lazy getIsFormSyncedUseCase = LazyKt.lazy(new d());

    public static final class a extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public static final a f44313d = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Kd.a invoke() {
            a.C0136a c0136a = Kd.a.f6469f;
            Application e10 = MobilistenInitProvider.INSTANCE.e();
            Intrinsics.checkNotNull(e10);
            return c0136a.a(e10);
        }
    }

    public static final class b extends Lambda implements Function0 {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Od.b invoke() {
            return new Od.b(ChatActivityViewModel.this.getBrandRepository());
        }
    }

    public static final class c extends Lambda implements Function0 {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Od.c invoke() {
            return new Od.c(ChatActivityViewModel.this.getBrandRepository());
        }
    }

    public static final class d extends Lambda implements Function0 {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Od.e invoke() {
            return new Od.e(ChatActivityViewModel.this.getBrandRepository());
        }
    }

    public static final class e extends Lambda implements Function0 {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final h invoke() {
            return new h(ChatActivityViewModel.this.getBrandRepository());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Kd.a getBrandRepository() {
        return (Kd.a) this.brandRepository.getValue();
    }

    private final h getSyncFormUseCase() {
        return (h) this.syncFormUseCase.getValue();
    }

    public final Form b(EnumC4544a appStatus) {
        Intrinsics.checkNotNullParameter(appStatus, "appStatus");
        return (Form) getGetFormUseCase().a(appStatus).b();
    }

    public final Od.e d() {
        return (Od.e) this.getIsFormSyncedUseCase.getValue();
    }

    public final boolean e(Form form, String acknowledgementKey, boolean isTriggeredChat) {
        return (form == null && getCurrentFormMessage() == null) || Form.INSTANCE.c(form, isTriggeredChat, acknowledgementKey) || Form.Message.INSTANCE.b(getCurrentFormMessage(), acknowledgementKey);
    }

    public final boolean f(EnumC4544a appStatus) {
        Intrinsics.checkNotNullParameter(appStatus, "appStatus");
        return i.i((Boolean) d().a(appStatus).b());
    }

    public final Object g(EnumC4544a enumC4544a, Continuation continuation) {
        Object a10 = getSyncFormUseCase().a(!LiveChatUtil.isFormContextStarted(), null, enumC4544a, continuation);
        return a10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a10 : Unit.INSTANCE;
    }

    public final Form.Message getCurrentFormMessage() {
        return (Form.Message) getGetCurrentFormMessageUseCase().a().b();
    }

    public final Od.b getGetCurrentFormMessageUseCase() {
        return (Od.b) this.getCurrentFormMessageUseCase.getValue();
    }

    public final Od.c getGetFormUseCase() {
        return (Od.c) this.getFormUseCase.getValue();
    }
}
