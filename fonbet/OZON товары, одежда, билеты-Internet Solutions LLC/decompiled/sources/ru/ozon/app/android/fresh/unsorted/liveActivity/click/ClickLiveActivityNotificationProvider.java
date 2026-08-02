package ru.ozon.app.android.fresh.unsorted.liveActivity.click;

import Sc.InterfaceC4008j;
import Sc.k;
import Sc.r;
import Sc.s;
import Wc.a;
import Wc.b;
import android.app.Application;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.widget.RemoteViews;
import androidx.recyclerview.widget.LinearLayoutManager;
import ch0.C5835a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.fresh.unsorted.R$id;
import ru.ozon.app.android.fresh.unsorted.liveActivity.LiveActivityNotificationProvider;
import ru.ozon.app.android.fresh.unsorted.liveActivity.click.ClickLiveActivityStateDTO;
import ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback;
import ru.ozon.app.android.pikazon.glide.transformations.ImageTransformation;
import ru.ozon.app.android.pikazon.request.PikazonRequestBuilder;
import xe.C10727i;
import xe.C10737n;
import xe.InterfaceC10733l;
import xe.InterfaceC10756x;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0006\b\u0007\u0018\u0000 J2\u00020\u0001:\u0001JB\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\r\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0018\u001a\u00020\u00102\b\b\u0001\u0010\r\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ6\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010 \u001a\u00020\u00132\u001a\u0010$\u001a\u0016\u0012\f\u0012\n\u0018\u00010\"j\u0004\u0018\u0001`#\u0012\u0004\u0012\u00020\u00100!H\u0082@¢\u0006\u0004\b&\u0010'J'\u0010+\u001a\u00020\u0010\"\u0004\b\u0000\u0010(*\b\u0012\u0004\u0012\u00028\u00000)2\u0006\u0010*\u001a\u00028\u0000H\u0002¢\u0006\u0004\b+\u0010,J\u001f\u00101\u001a\u0002002\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\u0013H\u0016¢\u0006\u0004\b1\u00102R\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001b\u0010<\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001b\u0010A\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u00109\u001a\u0004\b?\u0010@R\u001b\u0010D\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u00109\u001a\u0004\bC\u0010@R!\u0010I\u001a\b\u0012\u0004\u0012\u00020=0E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u00109\u001a\u0004\bG\u0010H¨\u0006K"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/liveActivity/click/ClickLiveActivityNotificationProvider;", "Lru/ozon/app/android/fresh/unsorted/liveActivity/LiveActivityNotificationProvider;", "Landroid/app/Application;", "application", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "<init>", "(Landroid/app/Application;Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "", "resId", "getTintColor", "(I)I", "id", "Lru/ozon/app/android/fresh/unsorted/liveActivity/click/ClickLiveActivityStateDTO$Button;", "button", "", "setButton", "(ILru/ozon/app/android/fresh/unsorted/liveActivity/click/ClickLiveActivityStateDTO$Button;)V", "", "image", "setImage", "(Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "text", "setText", "(ILjava/lang/String;)V", "getFlags", "()I", "deeplink", "Landroid/app/PendingIntent;", "provideIntent", "(Ljava/lang/String;)Landroid/app/PendingIntent;", "imageUrl", "Lkotlin/Function1;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onFailure", "Landroid/graphics/Bitmap;", "loadImage", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/d;)Ljava/lang/Object;", "T", "Lxe/l;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "safeResume", "(Lxe/l;Ljava/lang/Object;)V", "Lch0/a;", "state", "channelId", "Landroid/app/Notification;", "provideNotification", "(Lch0/a;Ljava/lang/String;)Landroid/app/Notification;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Lxe/x;", "supervisorJob$delegate", "LSc/j;", "getSupervisorJob", "()Lxe/x;", "supervisorJob", "Landroid/widget/RemoteViews;", "collapsedLayout$delegate", "getCollapsedLayout", "()Landroid/widget/RemoteViews;", "collapsedLayout", "expandedLayout$delegate", "getExpandedLayout", "expandedLayout", "", "layouts$delegate", "getLayouts", "()[Landroid/widget/RemoteViews;", "layouts", "Companion", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ClickLiveActivityNotificationProvider implements LiveActivityNotificationProvider {

    /* renamed from: collapsedLayout$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j collapsedLayout;

    @NotNull
    private final Context context;

    /* renamed from: expandedLayout$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j expandedLayout;

    @NotNull
    private final JsonParser jsonDeserializer;

    /* renamed from: layouts$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j layouts;

    /* renamed from: supervisorJob$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j supervisorJob;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/liveActivity/click/ClickLiveActivityNotificationProvider$Companion;", "", "<init>", "()V", "ICON_TOKEN", "", "EMPTY_RES_ID", "", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ClickLiveActivityNotificationProvider(@NotNull Application application, @NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        this.jsonDeserializer = jsonDeserializer;
        Context applicationContext = application.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.context = applicationContext;
        this.supervisorJob = k.b(ClickLiveActivityNotificationProvider$supervisorJob$2.INSTANCE);
        this.collapsedLayout = k.b(new ClickLiveActivityNotificationProvider$collapsedLayout$2(this));
        this.expandedLayout = k.b(new ClickLiveActivityNotificationProvider$expandedLayout$2(this));
        this.layouts = k.b(new ClickLiveActivityNotificationProvider$layouts$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RemoteViews getCollapsedLayout() {
        return (RemoteViews) this.collapsedLayout.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RemoteViews getExpandedLayout() {
        return (RemoteViews) this.expandedLayout.getValue();
    }

    private final int getFlags() {
        return Build.VERSION.SDK_INT >= 31 ? 201326592 : 134217728;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RemoteViews[] getLayouts() {
        return (RemoteViews[]) this.layouts.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC10756x getSupervisorJob() {
        return (InterfaceC10756x) this.supervisorJob.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getTintColor(int resId) {
        return this.context.getResources().getColor(resId, this.context.getTheme());
    }

    private final Object loadImage(String str, final Function1<? super Exception, Unit> function1, d<? super Bitmap> frame) {
        final C10737n c10737n = new C10737n(1, b.b(frame));
        c10737n.o();
        new PikazonRequestBuilder(this.context, Drawable.class).source(str).target(this.context).addTransformation(ImageTransformation.CenterCrop.INSTANCE).callback(new PikazonLoaderCallback<Drawable>() { // from class: ru.ozon.app.android.fresh.unsorted.liveActivity.click.ClickLiveActivityNotificationProvider$loadImage$2$1
            @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
            public void onLoadFailed(Exception e11) {
                function1.invoke(e11);
                ClickLiveActivityNotificationProvider.this.safeResume(c10737n, null);
            }

            @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
            public void onLoadSuccessful(Drawable resource) {
                Bitmap bitmap;
                ClickLiveActivityNotificationProvider clickLiveActivityNotificationProvider = ClickLiveActivityNotificationProvider.this;
                InterfaceC10733l<Bitmap> interfaceC10733l = c10737n;
                if (resource != null) {
                    Bitmap.Config config = Bitmap.Config.ARGB_8888;
                    bitmap = androidx.core.graphics.drawable.b.b(resource, 0, 0, 3);
                } else {
                    bitmap = null;
                }
                clickLiveActivityNotificationProvider.safeResume(interfaceC10733l, bitmap);
            }
        }).build().load();
        Object n11 = c10737n.n();
        if (n11 == a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return n11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PendingIntent provideIntent(String deeplink) {
        int flags = getFlags();
        PendingIntent activity = PendingIntent.getActivity(this.context, 0, new Intent("android.intent.action.VIEW", Uri.parse(deeplink)), flags);
        Intrinsics.checkNotNullExpressionValue(activity, "getActivity(...)");
        return activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> void safeResume(InterfaceC10733l<? super T> interfaceC10733l, T t2) {
        if (interfaceC10733l.isActive()) {
            r.Companion companion = r.INSTANCE;
            interfaceC10733l.resumeWith(t2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setButton(int id2, ClickLiveActivityStateDTO.Button button) {
        RemoteViews expandedLayout = getExpandedLayout();
        expandedLayout.setTextViewText(id2, button.getTitle());
        expandedLayout.setOnClickPendingIntent(id2, provideIntent(button.getLink()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object setImage(String str, d<? super Unit> dVar) {
        ClickLiveActivityNotificationProvider$setImage$1 clickLiveActivityNotificationProvider$setImage$1;
        int i11;
        ClickLiveActivityNotificationProvider clickLiveActivityNotificationProvider;
        Bitmap bitmap;
        if (dVar instanceof ClickLiveActivityNotificationProvider$setImage$1) {
            clickLiveActivityNotificationProvider$setImage$1 = (ClickLiveActivityNotificationProvider$setImage$1) dVar;
            int i12 = clickLiveActivityNotificationProvider$setImage$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                clickLiveActivityNotificationProvider$setImage$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = clickLiveActivityNotificationProvider$setImage$1.result;
                a aVar = a.COROUTINE_SUSPENDED;
                i11 = clickLiveActivityNotificationProvider$setImage$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    ClickLiveActivityNotificationProvider$setImage$bitmap$1 clickLiveActivityNotificationProvider$setImage$bitmap$1 = new ClickLiveActivityNotificationProvider$setImage$bitmap$1(this);
                    clickLiveActivityNotificationProvider$setImage$1.L$0 = this;
                    clickLiveActivityNotificationProvider$setImage$1.label = 1;
                    obj = loadImage(str, clickLiveActivityNotificationProvider$setImage$bitmap$1, clickLiveActivityNotificationProvider$setImage$1);
                    if (obj == aVar) {
                        return aVar;
                    }
                    clickLiveActivityNotificationProvider = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    clickLiveActivityNotificationProvider = (ClickLiveActivityNotificationProvider) clickLiveActivityNotificationProvider$setImage$1.L$0;
                    s.b(obj);
                }
                bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    for (RemoteViews remoteViews : clickLiveActivityNotificationProvider.getLayouts()) {
                        remoteViews.setImageViewBitmap(R$id.image, bitmap);
                    }
                }
                return Unit.f71690a;
            }
        }
        clickLiveActivityNotificationProvider$setImage$1 = new ClickLiveActivityNotificationProvider$setImage$1(this, dVar);
        Object obj2 = clickLiveActivityNotificationProvider$setImage$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = clickLiveActivityNotificationProvider$setImage$1.label;
        if (i11 != 0) {
        }
        bitmap = (Bitmap) obj2;
        if (bitmap != null) {
        }
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setText(int id2, String text) {
        for (RemoteViews remoteViews : getLayouts()) {
            remoteViews.setTextViewText(id2, text);
        }
    }

    @Override // ru.ozon.app.android.fresh.unsorted.liveActivity.LiveActivityNotificationProvider
    @NotNull
    public Notification provideNotification(@NotNull C5835a state, @NotNull String channelId) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(channelId, "channelId");
        Object d11 = C10727i.d(g.f71771a, new ClickLiveActivityNotificationProvider$provideNotification$1(this, state, channelId, null));
        Intrinsics.f(d11);
        return (Notification) d11;
    }
}
