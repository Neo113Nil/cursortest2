package rh0;

import De.C2862e;
import Sc.s;
import Yg0.a;
import android.app.AlarmManager;
import android.content.Intent;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import bh0.InterfaceC5665a;
import bh0.InterfaceC5666b;
import ch0.C5835a;
import com.squareup.moshi.JsonAdapter;
import fh0.C6568c;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.push.sdk.external.liveactivity.model.LiveActivitySelector;
import xe.C10720e0;
import xe.C10727i;
import xe.M;
import xe.N;
import xe.U;
import xe.X0;
import xe.Y;

/* renamed from: rh0.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C9277d implements InterfaceC5665a, InterfaceC9275b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Nh0.d f83514a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Nh0.d f83515b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final JsonAdapter<Map<String, String>> f83516c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C9280g f83517d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C2862e f83518e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final LinkedHashSet f83519f;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.push.sdk.internal.liveactivity.domain.LiveActivityInteractorImpl$onNewBroadcast$1$1", f = "LiveActivityInteractorImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: rh0.d$a */
    /* loaded from: classes3.dex */
    static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ LiveActivitySelector f83521e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(LiveActivitySelector liveActivitySelector, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f83521e = liveActivitySelector;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return C9277d.this.new a(this.f83521e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            Iterator it = C9277d.this.f83519f.iterator();
            while (it.hasNext()) {
                ((InterfaceC5666b) it.next()).onDismiss(this.f83521e);
            }
            return Unit.f71690a;
        }
    }

    public C9277d(Nh0.d liveActivityTokenRepository, Nh0.d pushTokensRepository, JsonAdapter adapter, C9280g mapper, AlarmManager alarmManager, C9274a contextProvider) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        He.b coroutineDispatcher = He.b.f10879b;
        Intrinsics.checkNotNullParameter(liveActivityTokenRepository, "liveActivityTokenRepository");
        Intrinsics.checkNotNullParameter(pushTokensRepository, "pushTokensRepository");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(alarmManager, "alarmManager");
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "coroutineDispatcher");
        this.f83514a = liveActivityTokenRepository;
        this.f83515b = pushTokensRepository;
        this.f83516c = adapter;
        this.f83517d = mapper;
        this.f83518e = N.a(coroutineDispatcher.plus(X0.b()));
        this.f83519f = new LinkedHashSet();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0080 -> B:11:0x0083). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(C9277d c9277d, Function1 function1, kotlin.coroutines.jvm.internal.c cVar) {
        C9278e c9278e;
        int i11;
        int i12;
        int i13;
        Function1 function12;
        Exception e11;
        Function1 function13;
        c9277d.getClass();
        if (cVar instanceof C9278e) {
            c9278e = (C9278e) cVar;
            int i14 = c9278e.f83527i;
            if ((i14 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c9278e.f83527i = i14 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c9278e.f83525g;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c9278e.f83527i;
                if (i11 != 0) {
                    s.b(obj);
                    i12 = 1;
                    if (i12 < 4) {
                    }
                } else {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i13 = c9278e.f83524f;
                        e11 = c9278e.f83523e;
                        Function1 function14 = c9278e.f83522d;
                        s.b(obj);
                        function13 = function14;
                        if (i13 == 3) {
                            throw e11;
                        }
                        int i15 = i13 + 1;
                        function1 = function13;
                        i12 = i15;
                        if (i12 < 4) {
                            return null;
                        }
                        try {
                        } catch (Exception e12) {
                            e11 = e12;
                            function12 = function1;
                            i13 = i12;
                            function13 = function12;
                            c9278e.f83522d = function13;
                            c9278e.f83523e = e11;
                            c9278e.f83524f = i13;
                            c9278e.f83527i = 2;
                            if (Y.b(i13 * 300, c9278e) == aVar) {
                                return aVar;
                            }
                            if (i13 == 3) {
                            }
                        }
                        c9278e.f83522d = function1;
                        c9278e.f83523e = null;
                        c9278e.f83524f = i12;
                        c9278e.f83527i = 1;
                        Object invoke = function1.invoke(c9278e);
                        return invoke == aVar ? aVar : invoke;
                    }
                    i13 = c9278e.f83524f;
                    Function1 function15 = c9278e.f83522d;
                    try {
                        s.b(obj);
                        return obj;
                    } catch (Exception e13) {
                        function12 = function15;
                        e11 = e13;
                        function13 = function12;
                        c9278e.f83522d = function13;
                        c9278e.f83523e = e11;
                        c9278e.f83524f = i13;
                        c9278e.f83527i = 2;
                        if (Y.b(i13 * 300, c9278e) == aVar) {
                        }
                        if (i13 == 3) {
                        }
                    }
                }
            }
        }
        c9278e = new C9278e(c9277d, cVar);
        Object obj2 = c9278e.f83525g;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c9278e.f83527i;
        if (i11 != 0) {
        }
    }

    @Override // bh0.InterfaceC5665a
    @NotNull
    public final U<Unit> a(@NotNull String widgetName, @NotNull Map<String, String> metadata) {
        Intrinsics.checkNotNullParameter(widgetName, "widgetName");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        LiveActivitySelector liveActivitySelector = new LiveActivitySelector(widgetName, metadata);
        Yg0.a.f35038y.getClass();
        return C10727i.a(this.f83518e, null, null, new C9279f(this, liveActivitySelector, a.C0652a.b().y(), null), 3);
    }

    @Override // bh0.InterfaceC5665a
    public final void b(@NotNull InterfaceC5666b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f83519f.add(listener);
    }

    public final boolean g(@NotNull C6568c pushModel) {
        Date date;
        C5835a.EnumC0868a enumC0868a;
        Intrinsics.checkNotNullParameter(pushModel, "pushModel");
        if (!pushModel.f().containsKey("widget_name")) {
            return false;
        }
        String str = (String) kotlin.collections.U.e(pushModel.f(), "widget_name");
        String str2 = pushModel.f().get("metadata");
        Map<String, String> fromJson = str2 != null ? this.f83516c.fromJson(str2) : null;
        if (fromJson == null) {
            fromJson = kotlin.collections.U.c();
        }
        LiveActivitySelector liveActivitySelector = new LiveActivitySelector(str, fromJson);
        this.f83517d.getClass();
        Intrinsics.checkNotNullParameter(pushModel, "pushModel");
        String str3 = pushModel.f().get("timestamp");
        Long valueOf = str3 != null ? Long.valueOf(Long.parseLong(str3)) : null;
        if (valueOf == null) {
            date = Calendar.getInstance().getTime();
            Intrinsics.f(date);
        } else {
            date = new Date(valueOf.longValue() * 1000);
        }
        String str4 = pushModel.f().get("dismissal_date");
        Date date2 = str4 != null ? new Date(Long.parseLong(str4) * 1000) : null;
        String str5 = pushModel.f().get("event");
        if (str5 != null) {
            C5835a.EnumC0868a[] values = C5835a.EnumC0868a.values();
            int length = values.length;
            for (int i11 = 0; i11 < length; i11++) {
                enumC0868a = values[i11];
                if (!h.D(enumC0868a.name(), str5, true)) {
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        enumC0868a = C5835a.EnumC0868a.UPDATE;
        if (enumC0868a != C5835a.EnumC0868a.END) {
            date2 = null;
        }
        String str6 = pushModel.f().get("content_state");
        if (str6 == null) {
            str6 = "";
        }
        C10727i.c(this.f83518e, null, null, new C9276c(this, liveActivitySelector, new C5835a(enumC0868a, str6, date, date2), null), 3);
        return true;
    }

    public final void h(@NotNull Intent intent) {
        LiveActivitySelector liveActivitySelector;
        Intrinsics.checkNotNullParameter(intent, "intent");
        Bundle extras = intent.getExtras();
        if (extras == null || (liveActivitySelector = (LiveActivitySelector) extras.getParcelable("ru.ozon.push.sdk.selector")) == null) {
            return;
        }
        C10727i.c(this.f83518e, null, null, new a(liveActivitySelector, null), 3);
    }
}
