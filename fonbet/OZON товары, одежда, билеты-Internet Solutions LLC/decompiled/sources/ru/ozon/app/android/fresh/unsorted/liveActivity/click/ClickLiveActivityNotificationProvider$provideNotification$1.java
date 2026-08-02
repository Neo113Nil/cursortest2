package ru.ozon.app.android.fresh.unsorted.liveActivity.click;

import Sc.s;
import Wc.a;
import android.app.Notification;
import android.app.PendingIntent;
import android.widget.RemoteViews;
import androidx.core.app.l;
import ch0.C5835a;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.fresh.unsorted.R$color;
import ru.ozon.app.android.fresh.unsorted.R$id;
import ru.ozon.uni.android.uikitsdk.resources.DrawableResource;
import xe.C10727i;
import xe.InterfaceC10756x;
import xe.M;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00070\u0001¢\u0006\u0002\b\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lxe/M;", "Landroid/app/Notification;", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(Lxe/M;)Landroid/app/Notification;"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.unsorted.liveActivity.click.ClickLiveActivityNotificationProvider$provideNotification$1", f = "ClickLiveActivityNotificationProvider.kt", l = {58}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class ClickLiveActivityNotificationProvider$provideNotification$1 extends j implements Function2<M, d<? super Notification>, Object> {
    final /* synthetic */ String $channelId;
    final /* synthetic */ C5835a $state;
    Object L$0;
    int label;
    final /* synthetic */ ClickLiveActivityNotificationProvider this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.fresh.unsorted.liveActivity.click.ClickLiveActivityNotificationProvider$provideNotification$1$1", f = "ClickLiveActivityNotificationProvider.kt", l = {59}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.fresh.unsorted.liveActivity.click.ClickLiveActivityNotificationProvider$provideNotification$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        final /* synthetic */ ClickLiveActivityStateDTO $data;
        int label;
        final /* synthetic */ ClickLiveActivityNotificationProvider this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ClickLiveActivityNotificationProvider clickLiveActivityNotificationProvider, ClickLiveActivityStateDTO clickLiveActivityStateDTO, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = clickLiveActivityNotificationProvider;
            this.$data = clickLiveActivityStateDTO;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.this$0, this.$data, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object image;
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                ClickLiveActivityNotificationProvider clickLiveActivityNotificationProvider = this.this$0;
                String image2 = this.$data.getImage();
                this.label = 1;
                image = clickLiveActivityNotificationProvider.setImage(image2, this);
                if (image == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ClickLiveActivityNotificationProvider$provideNotification$1(ClickLiveActivityNotificationProvider clickLiveActivityNotificationProvider, C5835a c5835a, String str, d<? super ClickLiveActivityNotificationProvider$provideNotification$1> dVar) {
        super(2, dVar);
        this.this$0 = clickLiveActivityNotificationProvider;
        this.$state = c5835a;
        this.$channelId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ClickLiveActivityNotificationProvider$provideNotification$1(this.this$0, this.$state, this.$channelId, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        JsonParser jsonParser;
        InterfaceC10756x supervisorJob;
        ClickLiveActivityStateDTO clickLiveActivityStateDTO;
        RemoteViews collapsedLayout;
        RemoteViews expandedLayout;
        int tintColor;
        PendingIntent provideIntent;
        Integer resId;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            jsonParser = this.this$0.jsonDeserializer;
            ClickLiveActivityStateDTO clickLiveActivityStateDTO2 = (ClickLiveActivityStateDTO) jsonParser.fromJson(this.$state.a(), ClickLiveActivityStateDTO.class);
            this.this$0.setText(R$id.title, clickLiveActivityStateDTO2.getTitle());
            this.this$0.setText(R$id.subtitle, clickLiveActivityStateDTO2.getSubtitle());
            this.this$0.setButton(R$id.call_button, clickLiveActivityStateDTO2.getCallButton());
            this.this$0.setButton(R$id.add_button, clickLiveActivityStateDTO2.getAddButton());
            supervisorJob = this.this$0.getSupervisorJob();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, clickLiveActivityStateDTO2, null);
            this.L$0 = clickLiveActivityStateDTO2;
            this.label = 1;
            if (C10727i.f(supervisorJob, anonymousClass1, this) == aVar) {
                return aVar;
            }
            clickLiveActivityStateDTO = clickLiveActivityStateDTO2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            clickLiveActivityStateDTO = (ClickLiveActivityStateDTO) this.L$0;
            s.b(obj);
        }
        l.d dVar = new l.d(this.this$0.context, this.$channelId);
        collapsedLayout = this.this$0.getCollapsedLayout();
        dVar.l(collapsedLayout);
        int i12 = -1;
        dVar.y(-1);
        expandedLayout = this.this$0.getExpandedLayout();
        dVar.k(expandedLayout);
        DrawableResource fromToken = DrawableResource.INSTANCE.fromToken("ic_s_ozon_o_logo_filled");
        if (fromToken != null && (resId = fromToken.getResId(this.this$0.context)) != null) {
            i12 = resId.intValue();
        }
        dVar.C(i12);
        tintColor = this.this$0.getTintColor(R$color.notification_blue);
        dVar.g(tintColor);
        dVar.F(new l.f());
        dVar.A(false);
        dVar.w(false);
        provideIntent = this.this$0.provideIntent(clickLiveActivityStateDTO.getWidgetLink());
        dVar.h(provideIntent);
        Intrinsics.checkNotNullExpressionValue(dVar, "setContentIntent(...)");
        Date b11 = this.$state.b();
        if (b11 != null) {
            dVar.H(b11.getTime() - this.$state.d().getTime());
        }
        return dVar.b();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Notification> dVar) {
        return ((ClickLiveActivityNotificationProvider$provideNotification$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
