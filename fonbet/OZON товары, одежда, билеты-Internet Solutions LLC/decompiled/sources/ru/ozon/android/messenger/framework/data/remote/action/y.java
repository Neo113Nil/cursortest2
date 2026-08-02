package ru.ozon.android.messenger.framework.data.remote.action;

import We.C;
import We.J;
import We.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import retrofit2.HttpException;
import retrofit2.Response;
import ru.ozon.android.messenger.blocks.curtain.CurtainModalResponseDTO;
import ru.ozon.android.messenger.blocks.disclaimer.modal.DisclaimerModalResponseDTO;
import ru.ozon.android.messenger.blocks.originalText.OriginalTextResponseDTO;
import ru.ozon.android.messenger.blocks.ratemessenger.sucessstate.RateMessengerSuccessModalDto;
import ru.ozon.android.messenger.blocks.rateoperator.RateDTO;
import ru.ozon.android.messenger.blocks.rateoperator.d;
import ru.ozon.android.messenger.framework.core.initialization.d;
import ru.ozon.android.messenger.framework.data.remote.FileApi;
import ru.ozon.android.messenger.framework.data.requests.ActionsCurtainResponseDTO;
import ru.ozon.android.messenger.framework.data.requests.AddFastAnswerResponseDTO;
import ru.ozon.android.messenger.framework.data.requests.ContextMenuItemActionResponseDTO;
import ru.ozon.android.messenger.framework.data.requests.CouponActionResponseDTO;
import ru.ozon.android.messenger.framework.data.requests.EditChatMessageResponseDTO;
import ru.ozon.android.messenger.framework.data.requests.ExternalTransitionModalResponseDTO;
import ru.ozon.android.messenger.framework.data.requests.ReadAllResponseDTO;
import ru.ozon.android.messenger.framework.data.requests.ReplyChatMessageResponseDTO;
import ru.ozon.android.messenger.framework.navigation.action.d;
import ru.ozon.android.messenger.utils.i;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;

/* loaded from: classes10.dex */
public final class y extends B {

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private static final C f87779e;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ActionApi f87780c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final FileApi f87781d;

    static {
        C.f33536g.getClass();
        f87779e = C.a.a("application/json");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(@NotNull ActionApi actionApi, @NotNull FileApi fileApi, @NotNull ru.ozon.android.messenger.framework.data.m errorLogger, @NotNull d.f networkConfig) {
        super(U7.d.e(networkConfig.b(), "composer-api.bx/_action/v2"), errorLogger);
        Intrinsics.checkNotNullParameter(actionApi, "actionApi");
        Intrinsics.checkNotNullParameter(fileApi, "fileApi");
        Intrinsics.checkNotNullParameter(errorLogger, "errorLogger");
        Intrinsics.checkNotNullParameter(networkConfig, "networkConfig");
        this.f87780c = actionApi;
        this.f87781d = fileApi;
    }

    static String j(y yVar, String str, String str2) {
        yVar.getClass();
        return kotlin.text.h.X(str, "}", ",\"text\":\"" + str2 + "\"}", false);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0092 A[Catch: Exception -> 0x002c, TryCatch #0 {Exception -> 0x002c, blocks: (B:11:0x0028, B:12:0x0086, B:14:0x0092, B:17:0x0098), top: B:10:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0098 A[Catch: Exception -> 0x002c, TRY_LEAVE, TryCatch #0 {Exception -> 0x002c, blocks: (B:11:0x0028, B:12:0x0086, B:14:0x0092, B:17:0x0098), top: B:10:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object A(@NotNull ru.ozon.android.messenger.framework.navigation.action.a aVar, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        x xVar;
        int i11;
        Exception e11;
        String str;
        y yVar;
        ru.ozon.android.messenger.framework.data.m mVar;
        Response response;
        ru.ozon.android.messenger.framework.data.m mVar2;
        if (cVar instanceof x) {
            xVar = (x) cVar;
            int i12 = xVar.f87778h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                xVar.f87778h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = xVar.f87776f;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = xVar.f87778h;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    AtomAction c11 = aVar.c();
                    AtomAction.Click click = c11 instanceof AtomAction.Click ? (AtomAction.Click) c11 : null;
                    if (click == null) {
                        return new i.a.f("Incorrect action type", null);
                    }
                    String link = click.getLink();
                    Map<String, String> params = click.getParams();
                    if (link == null || params == null) {
                        return new i.a.f(J.d.b("NPE link: ", link, " or params: ", params), null);
                    }
                    LinkedHashMap u11 = U.u(params);
                    String a11 = B.a(this, link);
                    A a12 = new A(a11, u11);
                    try {
                        ActionApi actionApi = this.f87780c;
                        String b11 = a12.b();
                        Map<String, Object> a13 = a12.a();
                        xVar.f87774d = this;
                        xVar.f87775e = a11;
                        xVar.f87778h = 1;
                        Object sendAction = actionApi.sendAction(b11, a13, xVar);
                        if (sendAction == aVar2) {
                            return aVar2;
                        }
                        obj = sendAction;
                        str = a11;
                        yVar = this;
                    } catch (Exception e12) {
                        e11 = e12;
                        str = a11;
                        yVar = this;
                        Lm0.a.f17149a.w(e11);
                        mVar = ((B) yVar).f87658b;
                        mVar.b(str, e11);
                        return new i.a.C1724a(1, e11, null);
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = xVar.f87775e;
                    yVar = xVar.f87774d;
                    try {
                        Sc.s.b(obj);
                    } catch (Exception e13) {
                        e11 = e13;
                        Lm0.a.f17149a.w(e11);
                        mVar = ((B) yVar).f87658b;
                        mVar.b(str, e11);
                        return new i.a.C1724a(1, e11, null);
                    }
                }
                response = (Response) obj;
                Object body = response.body();
                if (!response.isSuccessful()) {
                    return new i.b(body);
                }
                Lm0.a.f17149a.w(response.toString(), new Object[0]);
                mVar2 = ((B) yVar).f87658b;
                mVar2.c(response.code(), str);
                return new i.a.C1724a(1, new HttpException(response), null);
            }
        }
        xVar = new x(this, cVar);
        Object obj2 = xVar.f87776f;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = xVar.f87778h;
        if (i11 != 0) {
        }
        response = (Response) obj2;
        Object body2 = response.body();
        if (!response.isSuccessful()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00b4 A[Catch: Exception -> 0x002e, TryCatch #0 {Exception -> 0x002e, blocks: (B:11:0x0029, B:12:0x00a8, B:14:0x00b4, B:29:0x00ba), top: B:10:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ba A[Catch: Exception -> 0x002e, TRY_LEAVE, TryCatch #0 {Exception -> 0x002e, blocks: (B:11:0x0029, B:12:0x00a8, B:14:0x00b4, B:29:0x00ba), top: B:10:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(@NotNull ru.ozon.android.messenger.framework.navigation.action.a aVar, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C9328a c9328a;
        int i11;
        String str;
        Object fVar;
        y yVar;
        String str2;
        Object fVar2;
        ru.ozon.android.messenger.framework.data.m mVar;
        Response response;
        ru.ozon.android.messenger.framework.data.m mVar2;
        if (cVar instanceof C9328a) {
            c9328a = (C9328a) cVar;
            int i12 = c9328a.f87663h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c9328a.f87663h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c9328a.f87661f;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c9328a.f87663h;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    AtomAction c11 = aVar.c();
                    AtomAction.Click click = c11 instanceof AtomAction.Click ? (AtomAction.Click) c11 : null;
                    if (click == null) {
                        fVar2 = new i.a.f("Incorrect action type", null);
                        if (!(fVar2 instanceof i.b)) {
                            Object b11 = ((i.b) fVar2).b();
                            return new i.b(b11 instanceof AddFastAnswerResponseDTO ? (AddFastAnswerResponseDTO) b11 : null);
                        }
                        if (fVar2 instanceof i.a) {
                            return fVar2;
                        }
                        throw new Sc.o();
                    }
                    Map<String, String> params = click.getParams();
                    if (params == null || (str = params.get("bodyParams")) == null) {
                        str = "";
                    }
                    K.Companion companion = K.INSTANCE;
                    String X9 = kotlin.text.h.X(str, "\n", "\\n", false);
                    companion.getClass();
                    J b12 = K.Companion.b(X9, f87779e);
                    String link = click.getLink();
                    Map<String, String> params2 = click.getParams();
                    if (link == null || params2 == null) {
                        fVar = new i.a.f(J.d.b("NPE link: ", link, " or params: ", params2), null);
                        fVar2 = fVar;
                        if (!(fVar2 instanceof i.b)) {
                        }
                    } else {
                        LinkedHashMap u11 = U.u(params2);
                        String a11 = B.a(this, link);
                        A a12 = new A(a11, u11);
                        try {
                            ActionApi actionApi = this.f87780c;
                            String b13 = a12.b();
                            c9328a.f87659d = this;
                            c9328a.f87660e = a11;
                            c9328a.f87663h = 1;
                            obj = actionApi.chatGetFastAnswersAddAction(b13, b12, c9328a);
                            if (obj == aVar2) {
                                return aVar2;
                            }
                            yVar = this;
                            str2 = a11;
                        } catch (Exception e11) {
                            e = e11;
                            yVar = this;
                            str2 = a11;
                            Lm0.a.f17149a.w(e);
                            mVar = ((B) yVar).f87658b;
                            mVar.b(str2, e);
                            fVar = new i.a.C1724a(1, e, null);
                            fVar2 = fVar;
                            if (!(fVar2 instanceof i.b)) {
                            }
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = c9328a.f87660e;
                    yVar = c9328a.f87659d;
                    try {
                        Sc.s.b(obj);
                    } catch (Exception e12) {
                        e = e12;
                        Lm0.a.f17149a.w(e);
                        mVar = ((B) yVar).f87658b;
                        mVar.b(str2, e);
                        fVar = new i.a.C1724a(1, e, null);
                        fVar2 = fVar;
                        if (!(fVar2 instanceof i.b)) {
                        }
                    }
                }
                response = (Response) obj;
                Object body = response.body();
                if (response.isSuccessful()) {
                    Lm0.a.f17149a.w(response.toString(), new Object[0]);
                    mVar2 = ((B) yVar).f87658b;
                    mVar2.c(response.code(), str2);
                    fVar = new i.a.C1724a(1, new HttpException(response), null);
                } else {
                    fVar = new i.b(body);
                }
                fVar2 = fVar;
                if (!(fVar2 instanceof i.b)) {
                }
            }
        }
        c9328a = new C9328a(this, cVar);
        Object obj2 = c9328a.f87661f;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c9328a.f87663h;
        if (i11 != 0) {
        }
        response = (Response) obj2;
        Object body2 = response.body();
        if (response.isSuccessful()) {
        }
        fVar2 = fVar;
        if (!(fVar2 instanceof i.b)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00ab A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:11:0x0028, B:12:0x009f, B:14:0x00ab, B:29:0x00b1), top: B:10:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b1 A[Catch: Exception -> 0x002d, TRY_LEAVE, TryCatch #0 {Exception -> 0x002d, blocks: (B:11:0x0028, B:12:0x009f, B:14:0x00ab, B:29:0x00b1), top: B:10:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(@NotNull ru.ozon.android.messenger.framework.navigation.action.a aVar, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C9329b c9329b;
        int i11;
        String str;
        Object fVar;
        y yVar;
        String str2;
        Object fVar2;
        ru.ozon.android.messenger.framework.data.m mVar;
        Response response;
        ru.ozon.android.messenger.framework.data.m mVar2;
        if (cVar instanceof C9329b) {
            c9329b = (C9329b) cVar;
            int i12 = c9329b.f87668h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c9329b.f87668h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c9329b.f87666f;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = c9329b.f87668h;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    AtomAction c11 = aVar.c();
                    AtomAction.Click click = c11 instanceof AtomAction.Click ? (AtomAction.Click) c11 : null;
                    if (click == null) {
                        fVar2 = new i.a.f("Incorrect action type", null);
                        if (!(fVar2 instanceof i.b)) {
                            Object b11 = ((i.b) fVar2).b();
                            return new i.b(b11 instanceof ContextMenuItemActionResponseDTO ? (ContextMenuItemActionResponseDTO) b11 : null);
                        }
                        if (fVar2 instanceof i.a) {
                            return fVar2;
                        }
                        throw new Sc.o();
                    }
                    Map<String, String> params = click.getParams();
                    if (params == null || (str = params.get("bodyParams")) == null) {
                        str = "";
                    }
                    K.INSTANCE.getClass();
                    J b12 = K.Companion.b(str, f87779e);
                    String link = click.getLink();
                    Map<String, String> params2 = click.getParams();
                    if (link == null || params2 == null) {
                        fVar = new i.a.f(J.d.b("NPE link: ", link, " or params: ", params2), null);
                        fVar2 = fVar;
                        if (!(fVar2 instanceof i.b)) {
                        }
                    } else {
                        LinkedHashMap u11 = U.u(params2);
                        String a11 = B.a(this, link);
                        A a12 = new A(a11, u11);
                        try {
                            ActionApi actionApi = this.f87780c;
                            String b13 = a12.b();
                            c9329b.f87664d = this;
                            c9329b.f87665e = a11;
                            c9329b.f87668h = 1;
                            obj = actionApi.executeChatWithSuccessAction(b13, b12, c9329b);
                            if (obj == aVar2) {
                                return aVar2;
                            }
                            yVar = this;
                            str2 = a11;
                        } catch (Exception e11) {
                            e = e11;
                            yVar = this;
                            str2 = a11;
                            Lm0.a.f17149a.w(e);
                            mVar = ((B) yVar).f87658b;
                            mVar.b(str2, e);
                            fVar = new i.a.C1724a(1, e, null);
                            fVar2 = fVar;
                            if (!(fVar2 instanceof i.b)) {
                            }
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = c9329b.f87665e;
                    yVar = c9329b.f87664d;
                    try {
                        Sc.s.b(obj);
                    } catch (Exception e12) {
                        e = e12;
                        Lm0.a.f17149a.w(e);
                        mVar = ((B) yVar).f87658b;
                        mVar.b(str2, e);
                        fVar = new i.a.C1724a(1, e, null);
                        fVar2 = fVar;
                        if (!(fVar2 instanceof i.b)) {
                        }
                    }
                }
                response = (Response) obj;
                Object body = response.body();
                if (response.isSuccessful()) {
                    Lm0.a.f17149a.w(response.toString(), new Object[0]);
                    mVar2 = ((B) yVar).f87658b;
                    mVar2.c(response.code(), str2);
                    fVar = new i.a.C1724a(1, new HttpException(response), null);
                } else {
                    fVar = new i.b(body);
                }
                fVar2 = fVar;
                if (!(fVar2 instanceof i.b)) {
                }
            }
        }
        c9329b = new C9329b(this, cVar);
        Object obj2 = c9329b.f87666f;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c9329b.f87668h;
        if (i11 != 0) {
        }
        response = (Response) obj2;
        Object body2 = response.body();
        if (response.isSuccessful()) {
        }
        fVar2 = fVar;
        if (!(fVar2 instanceof i.b)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0093 A[Catch: Exception -> 0x002c, TryCatch #1 {Exception -> 0x002c, blocks: (B:11:0x0028, B:12:0x0087, B:14:0x0093, B:29:0x0099), top: B:10:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0099 A[Catch: Exception -> 0x002c, TRY_LEAVE, TryCatch #1 {Exception -> 0x002c, blocks: (B:11:0x0028, B:12:0x0087, B:14:0x0093, B:29:0x0099), top: B:10:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(@NotNull ru.ozon.android.messenger.framework.navigation.action.a aVar, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        c cVar2;
        int i11;
        Object fVar;
        Exception e11;
        String str;
        y yVar;
        ru.ozon.android.messenger.framework.data.m mVar;
        Object c1724a;
        Response response;
        ru.ozon.android.messenger.framework.data.m mVar2;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i12 = cVar2.f87673h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                cVar2.f87673h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = cVar2.f87671f;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = cVar2.f87673h;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    AtomAction c11 = aVar.c();
                    AtomAction.Click click = c11 instanceof AtomAction.Click ? (AtomAction.Click) c11 : null;
                    if (click == null) {
                        fVar = new i.a.f("Incorrect action type", null);
                    } else {
                        String link = click.getLink();
                        Map<String, String> params = click.getParams();
                        if (link == null || params == null) {
                            fVar = new i.a.f(J.d.b("NPE link: ", link, " or params: ", params), null);
                        } else {
                            LinkedHashMap u11 = U.u(params);
                            String a11 = B.a(this, link);
                            A a12 = new A(a11, u11);
                            try {
                                ActionApi actionApi = this.f87780c;
                                String b11 = a12.b();
                                Map<String, Object> a13 = a12.a();
                                cVar2.f87669d = this;
                                cVar2.f87670e = a11;
                                cVar2.f87673h = 1;
                                Object executeEditChatMessageAction = actionApi.executeEditChatMessageAction(b11, a13, cVar2);
                                if (executeEditChatMessageAction == aVar2) {
                                    return aVar2;
                                }
                                obj = executeEditChatMessageAction;
                                str = a11;
                                yVar = this;
                            } catch (Exception e12) {
                                e11 = e12;
                                str = a11;
                                yVar = this;
                                Lm0.a.f17149a.w(e11);
                                mVar = ((B) yVar).f87658b;
                                mVar.b(str, e11);
                                c1724a = new i.a.C1724a(1, e11, null);
                                fVar = c1724a;
                                if (fVar instanceof i.b) {
                                }
                            }
                        }
                    }
                    if (fVar instanceof i.b) {
                        Object b12 = ((i.b) fVar).b();
                        return new i.b(b12 instanceof EditChatMessageResponseDTO ? (EditChatMessageResponseDTO) b12 : null);
                    }
                    if (fVar instanceof i.a) {
                        return fVar;
                    }
                    throw new Sc.o();
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = cVar2.f87670e;
                yVar = cVar2.f87669d;
                try {
                    Sc.s.b(obj);
                } catch (Exception e13) {
                    e11 = e13;
                    Lm0.a.f17149a.w(e11);
                    mVar = ((B) yVar).f87658b;
                    mVar.b(str, e11);
                    c1724a = new i.a.C1724a(1, e11, null);
                    fVar = c1724a;
                    if (fVar instanceof i.b) {
                    }
                }
                response = (Response) obj;
                Object body = response.body();
                if (response.isSuccessful()) {
                    Lm0.a.f17149a.w(response.toString(), new Object[0]);
                    mVar2 = ((B) yVar).f87658b;
                    mVar2.c(response.code(), str);
                    c1724a = new i.a.C1724a(1, new HttpException(response), null);
                } else {
                    c1724a = new i.b(body);
                }
                fVar = c1724a;
                if (fVar instanceof i.b) {
                }
            }
        }
        cVar2 = new c(this, cVar);
        Object obj2 = cVar2.f87671f;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = cVar2.f87673h;
        if (i11 != 0) {
        }
        response = (Response) obj2;
        Object body2 = response.body();
        if (response.isSuccessful()) {
        }
        fVar = c1724a;
        if (fVar instanceof i.b) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00ab A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:11:0x0028, B:12:0x009f, B:14:0x00ab, B:29:0x00b1), top: B:10:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b1 A[Catch: Exception -> 0x002d, TRY_LEAVE, TryCatch #0 {Exception -> 0x002d, blocks: (B:11:0x0028, B:12:0x009f, B:14:0x00ab, B:29:0x00b1), top: B:10:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(@NotNull ru.ozon.android.messenger.framework.navigation.action.a aVar, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        d dVar;
        int i11;
        String str;
        Object fVar;
        y yVar;
        String str2;
        Object fVar2;
        ru.ozon.android.messenger.framework.data.m mVar;
        Response response;
        ru.ozon.android.messenger.framework.data.m mVar2;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i12 = dVar.f87678h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                dVar.f87678h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = dVar.f87676f;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = dVar.f87678h;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    AtomAction c11 = aVar.c();
                    AtomAction.Click click = c11 instanceof AtomAction.Click ? (AtomAction.Click) c11 : null;
                    if (click == null) {
                        fVar2 = new i.a.f("Incorrect action type", null);
                        if (!(fVar2 instanceof i.b)) {
                            Object b11 = ((i.b) fVar2).b();
                            return new i.b(b11 instanceof ActionsCurtainResponseDTO ? (ActionsCurtainResponseDTO) b11 : null);
                        }
                        if (fVar2 instanceof i.a) {
                            return fVar2;
                        }
                        throw new Sc.o();
                    }
                    Map<String, String> params = click.getParams();
                    if (params == null || (str = params.get("bodyParams")) == null) {
                        str = "";
                    }
                    K.INSTANCE.getClass();
                    J b12 = K.Companion.b(str, f87779e);
                    String link = click.getLink();
                    Map<String, String> params2 = click.getParams();
                    if (link == null || params2 == null) {
                        fVar = new i.a.f(J.d.b("NPE link: ", link, " or params: ", params2), null);
                        fVar2 = fVar;
                        if (!(fVar2 instanceof i.b)) {
                        }
                    } else {
                        LinkedHashMap u11 = U.u(params2);
                        String a11 = B.a(this, link);
                        A a12 = new A(a11, u11);
                        try {
                            ActionApi actionApi = this.f87780c;
                            String b13 = a12.b();
                            dVar.f87674d = this;
                            dVar.f87675e = a11;
                            dVar.f87678h = 1;
                            obj = actionApi.executeGetActionCurtainModalAction(b13, b12, dVar);
                            if (obj == aVar2) {
                                return aVar2;
                            }
                            yVar = this;
                            str2 = a11;
                        } catch (Exception e11) {
                            e = e11;
                            yVar = this;
                            str2 = a11;
                            Lm0.a.f17149a.w(e);
                            mVar = ((B) yVar).f87658b;
                            mVar.b(str2, e);
                            fVar = new i.a.C1724a(1, e, null);
                            fVar2 = fVar;
                            if (!(fVar2 instanceof i.b)) {
                            }
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = dVar.f87675e;
                    yVar = dVar.f87674d;
                    try {
                        Sc.s.b(obj);
                    } catch (Exception e12) {
                        e = e12;
                        Lm0.a.f17149a.w(e);
                        mVar = ((B) yVar).f87658b;
                        mVar.b(str2, e);
                        fVar = new i.a.C1724a(1, e, null);
                        fVar2 = fVar;
                        if (!(fVar2 instanceof i.b)) {
                        }
                    }
                }
                response = (Response) obj;
                Object body = response.body();
                if (response.isSuccessful()) {
                    Lm0.a.f17149a.w(response.toString(), new Object[0]);
                    mVar2 = ((B) yVar).f87658b;
                    mVar2.c(response.code(), str2);
                    fVar = new i.a.C1724a(1, new HttpException(response), null);
                } else {
                    fVar = new i.b(body);
                }
                fVar2 = fVar;
                if (!(fVar2 instanceof i.b)) {
                }
            }
        }
        dVar = new d(this, cVar);
        Object obj2 = dVar.f87676f;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = dVar.f87678h;
        if (i11 != 0) {
        }
        response = (Response) obj2;
        Object body2 = response.body();
        if (response.isSuccessful()) {
        }
        fVar2 = fVar;
        if (!(fVar2 instanceof i.b)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0095 A[Catch: Exception -> 0x002c, TryCatch #1 {Exception -> 0x002c, blocks: (B:11:0x0028, B:12:0x0089, B:14:0x0095, B:29:0x009b), top: B:10:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009b A[Catch: Exception -> 0x002c, TRY_LEAVE, TryCatch #1 {Exception -> 0x002c, blocks: (B:11:0x0028, B:12:0x0089, B:14:0x0095, B:29:0x009b), top: B:10:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(@NotNull ru.ozon.android.messenger.framework.navigation.action.a aVar, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        e eVar;
        int i11;
        Object fVar;
        Exception e11;
        String str;
        y yVar;
        ru.ozon.android.messenger.framework.data.m mVar;
        Object c1724a;
        Response response;
        ru.ozon.android.messenger.framework.data.m mVar2;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i12 = eVar.f87683h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                eVar.f87683h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = eVar.f87681f;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = eVar.f87683h;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    AtomAction c11 = aVar.c();
                    AtomAction.Click click = c11 instanceof AtomAction.Click ? (AtomAction.Click) c11 : null;
                    if (click == null) {
                        fVar = new i.a.f("Incorrect action type", null);
                    } else {
                        String link = click.getLink();
                        Map<String, String> params = click.getParams();
                        if (params == null) {
                            params = U.c();
                        }
                        if (link != null) {
                            LinkedHashMap u11 = U.u(params);
                            String a11 = B.a(this, link);
                            A a12 = new A(a11, u11);
                            try {
                                ActionApi actionApi = this.f87780c;
                                String b11 = a12.b();
                                Map<String, Object> a13 = a12.a();
                                eVar.f87679d = this;
                                eVar.f87680e = a11;
                                eVar.f87683h = 1;
                                Object executeGetCurtainModalAction = actionApi.executeGetCurtainModalAction(b11, a13, eVar);
                                if (executeGetCurtainModalAction == aVar2) {
                                    return aVar2;
                                }
                                obj = executeGetCurtainModalAction;
                                str = a11;
                                yVar = this;
                            } catch (Exception e12) {
                                e11 = e12;
                                str = a11;
                                yVar = this;
                                Lm0.a.f17149a.w(e11);
                                mVar = ((B) yVar).f87658b;
                                mVar.b(str, e11);
                                c1724a = new i.a.C1724a(1, e11, null);
                                fVar = c1724a;
                                if (fVar instanceof i.b) {
                                }
                            }
                        } else {
                            fVar = new i.a.f(J.d.b("NPE link: ", link, " or params: ", params), null);
                        }
                    }
                    if (fVar instanceof i.b) {
                        Object b12 = ((i.b) fVar).b();
                        return new i.b(b12 instanceof CurtainModalResponseDTO ? (CurtainModalResponseDTO) b12 : null);
                    }
                    if (fVar instanceof i.a) {
                        return fVar;
                    }
                    throw new Sc.o();
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = eVar.f87680e;
                yVar = eVar.f87679d;
                try {
                    Sc.s.b(obj);
                } catch (Exception e13) {
                    e11 = e13;
                    Lm0.a.f17149a.w(e11);
                    mVar = ((B) yVar).f87658b;
                    mVar.b(str, e11);
                    c1724a = new i.a.C1724a(1, e11, null);
                    fVar = c1724a;
                    if (fVar instanceof i.b) {
                    }
                }
                response = (Response) obj;
                Object body = response.body();
                if (response.isSuccessful()) {
                    Lm0.a.f17149a.w(response.toString(), new Object[0]);
                    mVar2 = ((B) yVar).f87658b;
                    mVar2.c(response.code(), str);
                    c1724a = new i.a.C1724a(1, new HttpException(response), null);
                } else {
                    c1724a = new i.b(body);
                }
                fVar = c1724a;
                if (fVar instanceof i.b) {
                }
            }
        }
        eVar = new e(this, cVar);
        Object obj2 = eVar.f87681f;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = eVar.f87683h;
        if (i11 != 0) {
        }
        response = (Response) obj2;
        Object body2 = response.body();
        if (response.isSuccessful()) {
        }
        fVar = c1724a;
        if (fVar instanceof i.b) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0082 A[Catch: Exception -> 0x002c, TryCatch #0 {Exception -> 0x002c, blocks: (B:11:0x0028, B:12:0x0076, B:14:0x0082, B:28:0x0088), top: B:10:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0088 A[Catch: Exception -> 0x002c, TRY_LEAVE, TryCatch #0 {Exception -> 0x002c, blocks: (B:11:0x0028, B:12:0x0076, B:14:0x0082, B:28:0x0088), top: B:10:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(@NotNull ru.ozon.android.messenger.framework.navigation.action.a aVar, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        f fVar;
        int i11;
        Object fVar2;
        Exception e11;
        String str;
        y yVar;
        ru.ozon.android.messenger.framework.data.m mVar;
        Response response;
        ru.ozon.android.messenger.framework.data.m mVar2;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i12 = fVar.f87688h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                fVar.f87688h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = fVar.f87686f;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = fVar.f87688h;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    AtomActionDTO b11 = aVar.b();
                    if (b11 != null) {
                        String link = b11.getLink();
                        Map<String, String> params = b11.getParams();
                        if (link == null || params == null) {
                            fVar2 = new i.a.f(J.d.b("NPE link: ", link, " or params: ", params), null);
                        } else {
                            LinkedHashMap u11 = U.u(params);
                            String a11 = B.a(this, link);
                            A a12 = new A(a11, u11);
                            try {
                                ActionApi actionApi = this.f87780c;
                                String b12 = a12.b();
                                Map<String, Object> a13 = a12.a();
                                fVar.f87684d = this;
                                fVar.f87685e = a11;
                                fVar.f87688h = 1;
                                Object executeGetSuspiciousLinkModalAction = actionApi.executeGetSuspiciousLinkModalAction(b12, a13, fVar);
                                if (executeGetSuspiciousLinkModalAction == aVar2) {
                                    return aVar2;
                                }
                                obj = executeGetSuspiciousLinkModalAction;
                                str = a11;
                                yVar = this;
                            } catch (Exception e12) {
                                e11 = e12;
                                str = a11;
                                yVar = this;
                                Lm0.a.f17149a.w(e11);
                                mVar = ((B) yVar).f87658b;
                                mVar.b(str, e11);
                                fVar2 = new i.a.C1724a(1, e11, null);
                                if (fVar2 instanceof i.b) {
                                }
                            }
                        }
                    } else {
                        fVar2 = new i.a.f("NPE AtomActionDTO", null);
                    }
                    if (fVar2 instanceof i.b) {
                        Object b13 = ((i.b) fVar2).b();
                        return new i.b(b13 instanceof ExternalTransitionModalResponseDTO ? (ExternalTransitionModalResponseDTO) b13 : null);
                    }
                    if (fVar2 instanceof i.a) {
                        return fVar2;
                    }
                    throw new Sc.o();
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = fVar.f87685e;
                yVar = fVar.f87684d;
                try {
                    Sc.s.b(obj);
                } catch (Exception e13) {
                    e11 = e13;
                    Lm0.a.f17149a.w(e11);
                    mVar = ((B) yVar).f87658b;
                    mVar.b(str, e11);
                    fVar2 = new i.a.C1724a(1, e11, null);
                    if (fVar2 instanceof i.b) {
                    }
                }
                response = (Response) obj;
                Object body = response.body();
                if (response.isSuccessful()) {
                    Lm0.a.f17149a.w(response.toString(), new Object[0]);
                    mVar2 = ((B) yVar).f87658b;
                    mVar2.c(response.code(), str);
                    fVar2 = new i.a.C1724a(1, new HttpException(response), null);
                } else {
                    fVar2 = new i.b(body);
                }
                if (fVar2 instanceof i.b) {
                }
            }
        }
        fVar = new f(this, cVar);
        Object obj2 = fVar.f87686f;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = fVar.f87688h;
        if (i11 != 0) {
        }
        response = (Response) obj2;
        Object body2 = response.body();
        if (response.isSuccessful()) {
        }
        if (fVar2 instanceof i.b) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0093 A[Catch: Exception -> 0x002c, TryCatch #1 {Exception -> 0x002c, blocks: (B:11:0x0028, B:12:0x0087, B:14:0x0093, B:29:0x0099), top: B:10:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0099 A[Catch: Exception -> 0x002c, TRY_LEAVE, TryCatch #1 {Exception -> 0x002c, blocks: (B:11:0x0028, B:12:0x0087, B:14:0x0093, B:29:0x0099), top: B:10:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(@NotNull ru.ozon.android.messenger.framework.navigation.action.a aVar, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        g gVar;
        int i11;
        Object fVar;
        Exception e11;
        String str;
        y yVar;
        ru.ozon.android.messenger.framework.data.m mVar;
        Object c1724a;
        Response response;
        ru.ozon.android.messenger.framework.data.m mVar2;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i12 = gVar.f87693h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                gVar.f87693h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = gVar.f87691f;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = gVar.f87693h;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    AtomAction c11 = aVar.c();
                    AtomAction.Click click = c11 instanceof AtomAction.Click ? (AtomAction.Click) c11 : null;
                    if (click == null) {
                        fVar = new i.a.f("Incorrect action type", null);
                    } else {
                        String link = click.getLink();
                        Map<String, String> params = click.getParams();
                        if (link == null || params == null) {
                            fVar = new i.a.f(J.d.b("NPE link: ", link, " or params: ", params), null);
                        } else {
                            LinkedHashMap u11 = U.u(params);
                            String a11 = B.a(this, link);
                            A a12 = new A(a11, u11);
                            try {
                                ActionApi actionApi = this.f87780c;
                                String b11 = a12.b();
                                Map<String, Object> a13 = a12.a();
                                gVar.f87689d = this;
                                gVar.f87690e = a11;
                                gVar.f87693h = 1;
                                Object executeReplyChatMessageAction = actionApi.executeReplyChatMessageAction(b11, a13, gVar);
                                if (executeReplyChatMessageAction == aVar2) {
                                    return aVar2;
                                }
                                obj = executeReplyChatMessageAction;
                                str = a11;
                                yVar = this;
                            } catch (Exception e12) {
                                e11 = e12;
                                str = a11;
                                yVar = this;
                                Lm0.a.f17149a.w(e11);
                                mVar = ((B) yVar).f87658b;
                                mVar.b(str, e11);
                                c1724a = new i.a.C1724a(1, e11, null);
                                fVar = c1724a;
                                if (fVar instanceof i.b) {
                                }
                            }
                        }
                    }
                    if (fVar instanceof i.b) {
                        Object b12 = ((i.b) fVar).b();
                        return new i.b(b12 instanceof ReplyChatMessageResponseDTO ? (ReplyChatMessageResponseDTO) b12 : null);
                    }
                    if (fVar instanceof i.a) {
                        return fVar;
                    }
                    throw new Sc.o();
                }
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = gVar.f87690e;
                yVar = gVar.f87689d;
                try {
                    Sc.s.b(obj);
                } catch (Exception e13) {
                    e11 = e13;
                    Lm0.a.f17149a.w(e11);
                    mVar = ((B) yVar).f87658b;
                    mVar.b(str, e11);
                    c1724a = new i.a.C1724a(1, e11, null);
                    fVar = c1724a;
                    if (fVar instanceof i.b) {
                    }
                }
                response = (Response) obj;
                Object body = response.body();
                if (response.isSuccessful()) {
                    Lm0.a.f17149a.w(response.toString(), new Object[0]);
                    mVar2 = ((B) yVar).f87658b;
                    mVar2.c(response.code(), str);
                    c1724a = new i.a.C1724a(1, new HttpException(response), null);
                } else {
                    c1724a = new i.b(body);
                }
                fVar = c1724a;
                if (fVar instanceof i.b) {
                }
            }
        }
        gVar = new g(this, cVar);
        Object obj2 = gVar.f87691f;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = gVar.f87693h;
        if (i11 != 0) {
        }
        response = (Response) obj2;
        Object body2 = response.body();
        if (response.isSuccessful()) {
        }
        fVar = c1724a;
        if (fVar instanceof i.b) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007e A[Catch: Exception -> 0x002c, TryCatch #0 {Exception -> 0x002c, blocks: (B:11:0x0028, B:12:0x0072, B:14:0x007e, B:17:0x0084), top: B:10:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084 A[Catch: Exception -> 0x002c, TRY_LEAVE, TryCatch #0 {Exception -> 0x002c, blocks: (B:11:0x0028, B:12:0x0072, B:14:0x007e, B:17:0x0084), top: B:10:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(AtomActionDTO atomActionDTO, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        h hVar;
        int i11;
        Exception e11;
        String str;
        y yVar;
        ru.ozon.android.messenger.framework.data.m mVar;
        Response response;
        ru.ozon.android.messenger.framework.data.m mVar2;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i12 = hVar.f87698h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                hVar.f87698h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = hVar.f87696f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = hVar.f87698h;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    if (atomActionDTO == null) {
                        return new i.a.f("NPE AtomActionDTO", null);
                    }
                    String link = atomActionDTO.getLink();
                    Map<String, String> params = atomActionDTO.getParams();
                    if (link == null || params == null) {
                        return new i.a.f(J.d.b("NPE link: ", link, " or params: ", params), null);
                    }
                    LinkedHashMap u11 = U.u(params);
                    String a11 = B.a(this, link);
                    A a12 = new A(a11, u11);
                    try {
                        ActionApi actionApi = this.f87780c;
                        String b11 = a12.b();
                        Map<String, Object> a13 = a12.a();
                        hVar.f87694d = this;
                        hVar.f87695e = a11;
                        hVar.f87698h = 1;
                        Object sendAction = actionApi.sendAction(b11, a13, hVar);
                        if (sendAction == aVar) {
                            return aVar;
                        }
                        obj = sendAction;
                        str = a11;
                        yVar = this;
                    } catch (Exception e12) {
                        e11 = e12;
                        str = a11;
                        yVar = this;
                        Lm0.a.f17149a.w(e11);
                        mVar = ((B) yVar).f87658b;
                        mVar.b(str, e11);
                        return new i.a.C1724a(1, e11, null);
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = hVar.f87695e;
                    yVar = hVar.f87694d;
                    try {
                        Sc.s.b(obj);
                    } catch (Exception e13) {
                        e11 = e13;
                        Lm0.a.f17149a.w(e11);
                        mVar = ((B) yVar).f87658b;
                        mVar.b(str, e11);
                        return new i.a.C1724a(1, e11, null);
                    }
                }
                response = (Response) obj;
                Object body = response.body();
                if (!response.isSuccessful()) {
                    return new i.b(body);
                }
                Lm0.a.f17149a.w(response.toString(), new Object[0]);
                mVar2 = ((B) yVar).f87658b;
                mVar2.c(response.code(), str);
                return new i.a.C1724a(1, new HttpException(response), null);
            }
        }
        hVar = new h(this, cVar);
        Object obj2 = hVar.f87696f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = hVar.f87698h;
        if (i11 != 0) {
        }
        response = (Response) obj2;
        Object body2 = response.body();
        if (!response.isSuccessful()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0092 A[Catch: Exception -> 0x002c, TryCatch #0 {Exception -> 0x002c, blocks: (B:11:0x0028, B:12:0x0086, B:14:0x0092, B:17:0x0098), top: B:10:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0098 A[Catch: Exception -> 0x002c, TRY_LEAVE, TryCatch #0 {Exception -> 0x002c, blocks: (B:11:0x0028, B:12:0x0086, B:14:0x0092, B:17:0x0098), top: B:10:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(@NotNull ru.ozon.android.messenger.framework.navigation.action.a aVar, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        i iVar;
        int i11;
        Exception e11;
        String str;
        y yVar;
        ru.ozon.android.messenger.framework.data.m mVar;
        Response response;
        ru.ozon.android.messenger.framework.data.m mVar2;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i12 = iVar.f87703h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                iVar.f87703h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = iVar.f87701f;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = iVar.f87703h;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    AtomAction c11 = aVar.c();
                    AtomAction.Click click = c11 instanceof AtomAction.Click ? (AtomAction.Click) c11 : null;
                    if (click == null) {
                        return new i.a.f("Incorrect action type", null);
                    }
                    String link = click.getLink();
                    Map<String, String> params = click.getParams();
                    if (link == null || params == null) {
                        return new i.a.f(J.d.b("NPE link: ", link, " or params: ", params), null);
                    }
                    LinkedHashMap u11 = U.u(params);
                    String a11 = B.a(this, link);
                    A a12 = new A(a11, u11);
                    try {
                        ActionApi actionApi = this.f87780c;
                        String b11 = a12.b();
                        Map<String, Object> a13 = a12.a();
                        iVar.f87699d = this;
                        iVar.f87700e = a11;
                        iVar.f87703h = 1;
                        Object sendAction = actionApi.sendAction(b11, a13, iVar);
                        if (sendAction == aVar2) {
                            return aVar2;
                        }
                        obj = sendAction;
                        str = a11;
                        yVar = this;
                    } catch (Exception e12) {
                        e11 = e12;
                        str = a11;
                        yVar = this;
                        Lm0.a.f17149a.w(e11);
                        mVar = ((B) yVar).f87658b;
                        mVar.b(str, e11);
                        return new i.a.C1724a(1, e11, null);
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = iVar.f87700e;
                    yVar = iVar.f87699d;
                    try {
                        Sc.s.b(obj);
                    } catch (Exception e13) {
                        e11 = e13;
                        Lm0.a.f17149a.w(e11);
                        mVar = ((B) yVar).f87658b;
                        mVar.b(str, e11);
                        return new i.a.C1724a(1, e11, null);
                    }
                }
                response = (Response) obj;
                Object body = response.body();
                if (!response.isSuccessful()) {
                    return new i.b(body);
                }
                Lm0.a.f17149a.w(response.toString(), new Object[0]);
                mVar2 = ((B) yVar).f87658b;
                mVar2.c(response.code(), str);
                return new i.a.C1724a(1, new HttpException(response), null);
            }
        }
        iVar = new i(this, cVar);
        Object obj2 = iVar.f87701f;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = iVar.f87703h;
        if (i11 != 0) {
        }
        response = (Response) obj2;
        Object body2 = response.body();
        if (!response.isSuccessful()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x008c A[Catch: Exception -> 0x002c, TryCatch #0 {Exception -> 0x002c, blocks: (B:11:0x0028, B:12:0x0080, B:14:0x008c, B:28:0x0092), top: B:10:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0092 A[Catch: Exception -> 0x002c, TRY_LEAVE, TryCatch #0 {Exception -> 0x002c, blocks: (B:11:0x0028, B:12:0x0080, B:14:0x008c, B:28:0x0092), top: B:10:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(@NotNull ru.ozon.android.messenger.framework.navigation.action.a aVar, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        j jVar;
        int i11;
        Map<String, String> c11;
        Object fVar;
        Exception e11;
        String str;
        y yVar;
        ru.ozon.android.messenger.framework.data.m mVar;
        Response response;
        ru.ozon.android.messenger.framework.data.m mVar2;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i12 = jVar.f87708h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                jVar.f87708h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = jVar.f87706f;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = jVar.f87708h;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    AtomActionDTO b11 = aVar.b();
                    String link = b11 != null ? b11.getLink() : null;
                    AtomActionDTO b12 = aVar.b();
                    if (b12 == null || (c11 = b12.getParams()) == null) {
                        c11 = U.c();
                    }
                    if (link == null) {
                        fVar = new i.a.f(J.d.b("NPE link: ", link, " or params: ", c11), null);
                        if (fVar instanceof i.b) {
                            Object b13 = ((i.b) fVar).b();
                            return new i.b(b13 instanceof DisclaimerModalResponseDTO ? (DisclaimerModalResponseDTO) b13 : null);
                        }
                        if (fVar instanceof i.a) {
                            return fVar;
                        }
                        throw new Sc.o();
                    }
                    LinkedHashMap u11 = U.u(c11);
                    String a11 = B.a(this, link);
                    A a12 = new A(a11, u11);
                    try {
                        ActionApi actionApi = this.f87780c;
                        String b14 = a12.b();
                        Map<String, Object> a13 = a12.a();
                        jVar.f87704d = this;
                        jVar.f87705e = a11;
                        jVar.f87708h = 1;
                        Object openDisclaimerModalAction = actionApi.openDisclaimerModalAction(b14, a13, jVar);
                        if (openDisclaimerModalAction == aVar2) {
                            return aVar2;
                        }
                        obj = openDisclaimerModalAction;
                        str = a11;
                        yVar = this;
                    } catch (Exception e12) {
                        e11 = e12;
                        str = a11;
                        yVar = this;
                        Lm0.a.f17149a.w(e11);
                        mVar = ((B) yVar).f87658b;
                        mVar.b(str, e11);
                        fVar = new i.a.C1724a(1, e11, null);
                        if (fVar instanceof i.b) {
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = jVar.f87705e;
                    yVar = jVar.f87704d;
                    try {
                        Sc.s.b(obj);
                    } catch (Exception e13) {
                        e11 = e13;
                        Lm0.a.f17149a.w(e11);
                        mVar = ((B) yVar).f87658b;
                        mVar.b(str, e11);
                        fVar = new i.a.C1724a(1, e11, null);
                        if (fVar instanceof i.b) {
                        }
                    }
                }
                response = (Response) obj;
                Object body = response.body();
                if (response.isSuccessful()) {
                    Lm0.a.f17149a.w(response.toString(), new Object[0]);
                    mVar2 = ((B) yVar).f87658b;
                    mVar2.c(response.code(), str);
                    fVar = new i.a.C1724a(1, new HttpException(response), null);
                } else {
                    fVar = new i.b(body);
                }
                if (fVar instanceof i.b) {
                }
            }
        }
        jVar = new j(this, cVar);
        Object obj2 = jVar.f87706f;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = jVar.f87708h;
        if (i11 != 0) {
        }
        response = (Response) obj2;
        Object body2 = response.body();
        if (response.isSuccessful()) {
        }
        if (fVar instanceof i.b) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0089 A[Catch: Exception -> 0x002c, TryCatch #0 {Exception -> 0x002c, blocks: (B:11:0x0028, B:12:0x007d, B:14:0x0089, B:28:0x008f), top: B:10:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008f A[Catch: Exception -> 0x002c, TRY_LEAVE, TryCatch #0 {Exception -> 0x002c, blocks: (B:11:0x0028, B:12:0x007d, B:14:0x0089, B:28:0x008f), top: B:10:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(@NotNull ru.ozon.android.messenger.framework.navigation.action.a aVar, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        k kVar;
        int i11;
        Object fVar;
        Object fVar2;
        y yVar;
        String str;
        ru.ozon.android.messenger.framework.data.m mVar;
        Response response;
        ru.ozon.android.messenger.framework.data.m mVar2;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i12 = kVar.f87713h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                kVar.f87713h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = kVar.f87711f;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = kVar.f87713h;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    AtomActionDTO b11 = aVar.b();
                    Map<String, Object> d11 = aVar.d();
                    if (b11 != null) {
                        String link = b11.getLink();
                        Map<String, String> params = b11.getParams();
                        if (link == null || params == null) {
                            fVar2 = new i.a.f(J.d.b("NPE link: ", link, " or params: ", params), null);
                            fVar = fVar2;
                            if (!(fVar instanceof i.b)) {
                                Object b12 = ((i.b) fVar).b();
                                return new i.b(b12 instanceof RateMessengerSuccessModalDto ? (RateMessengerSuccessModalDto) b12 : null);
                            }
                            if (fVar instanceof i.a) {
                                return fVar;
                            }
                            throw new Sc.o();
                        }
                        LinkedHashMap u11 = U.u(params);
                        String a11 = B.a(this, link);
                        if (d11 != null) {
                            u11.putAll(d11);
                        }
                        A a12 = new A(a11, u11);
                        try {
                            ActionApi actionApi = this.f87780c;
                            String b13 = a12.b();
                            Map<String, Object> a13 = a12.a();
                            kVar.f87709d = this;
                            kVar.f87710e = a11;
                            kVar.f87713h = 1;
                            obj = actionApi.openRateMessengerSuccessModalAction(b13, a13, kVar);
                            if (obj == aVar2) {
                                return aVar2;
                            }
                            yVar = this;
                            str = a11;
                        } catch (Exception e11) {
                            e = e11;
                            yVar = this;
                            str = a11;
                            Lm0.a.f17149a.w(e);
                            mVar = ((B) yVar).f87658b;
                            mVar.b(str, e);
                            fVar2 = new i.a.C1724a(1, e, null);
                            fVar = fVar2;
                            if (!(fVar instanceof i.b)) {
                            }
                        }
                    } else {
                        fVar = new i.a.f("NPE AtomActionDTO", null);
                        if (!(fVar instanceof i.b)) {
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = kVar.f87710e;
                    yVar = kVar.f87709d;
                    try {
                        Sc.s.b(obj);
                    } catch (Exception e12) {
                        e = e12;
                        Lm0.a.f17149a.w(e);
                        mVar = ((B) yVar).f87658b;
                        mVar.b(str, e);
                        fVar2 = new i.a.C1724a(1, e, null);
                        fVar = fVar2;
                        if (!(fVar instanceof i.b)) {
                        }
                    }
                }
                response = (Response) obj;
                Object body = response.body();
                if (response.isSuccessful()) {
                    Lm0.a.f17149a.w(response.toString(), new Object[0]);
                    mVar2 = ((B) yVar).f87658b;
                    mVar2.c(response.code(), str);
                    fVar = new i.a.C1724a(1, new HttpException(response), null);
                } else {
                    fVar = new i.b(body);
                }
                if (!(fVar instanceof i.b)) {
                }
            }
        }
        kVar = new k(this, cVar);
        Object obj2 = kVar.f87711f;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = kVar.f87713h;
        if (i11 != 0) {
        }
        response = (Response) obj2;
        Object body2 = response.body();
        if (response.isSuccessful()) {
        }
        if (!(fVar instanceof i.b)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a6 A[Catch: Exception -> 0x002e, TryCatch #1 {Exception -> 0x002e, blocks: (B:11:0x0029, B:12:0x009a, B:14:0x00a6, B:28:0x00ac), top: B:10:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ac A[Catch: Exception -> 0x002e, TRY_LEAVE, TryCatch #1 {Exception -> 0x002e, blocks: (B:11:0x0029, B:12:0x009a, B:14:0x00a6, B:28:0x00ac), top: B:10:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(@NotNull String str, Map map, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        l lVar;
        int i11;
        Object fVar;
        String a11;
        y yVar;
        ru.ozon.android.messenger.framework.data.m mVar;
        Response response;
        ru.ozon.android.messenger.framework.data.m mVar2;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i12 = lVar.f87718h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                lVar.f87718h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = lVar.f87716f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = lVar.f87718h;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    String str2 = map != null ? (String) map.get("bodyParams") : null;
                    if (str2 == null) {
                        str2 = "";
                    }
                    String str3 = map != null ? (String) map.get("text") : null;
                    String j11 = j(this, str2, str3 != null ? str3 : "");
                    K.Companion companion = K.INSTANCE;
                    String X9 = kotlin.text.h.X(j11, "\n", "\\n", false);
                    companion.getClass();
                    J b11 = K.Companion.b(X9, f87779e);
                    if (str == null || map == null) {
                        fVar = new i.a.f(J.d.b("NPE link: ", str, " or params: ", map), null);
                        if (fVar instanceof i.b) {
                            Object b12 = ((i.b) fVar).b();
                            return new i.b(b12 instanceof AddFastAnswerResponseDTO ? (AddFastAnswerResponseDTO) b12 : null);
                        }
                        if (fVar instanceof i.a) {
                            return fVar;
                        }
                        throw new Sc.o();
                    }
                    LinkedHashMap u11 = U.u(map);
                    a11 = B.a(this, str);
                    A a12 = new A(a11, u11);
                    try {
                        ActionApi actionApi = this.f87780c;
                        String b13 = a12.b();
                        lVar.f87714d = this;
                        lVar.f87715e = a11;
                        lVar.f87718h = 1;
                        obj = actionApi.removeFastAnswerAction(b13, b11, lVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                        yVar = this;
                    } catch (Exception e11) {
                        e = e11;
                        yVar = this;
                        Lm0.a.f17149a.w(e);
                        mVar = ((B) yVar).f87658b;
                        mVar.b(a11, e);
                        fVar = new i.a.C1724a(1, e, null);
                        if (fVar instanceof i.b) {
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a11 = lVar.f87715e;
                    yVar = lVar.f87714d;
                    try {
                        Sc.s.b(obj);
                    } catch (Exception e12) {
                        e = e12;
                        Lm0.a.f17149a.w(e);
                        mVar = ((B) yVar).f87658b;
                        mVar.b(a11, e);
                        fVar = new i.a.C1724a(1, e, null);
                        if (fVar instanceof i.b) {
                        }
                    }
                }
                response = (Response) obj;
                Object body = response.body();
                if (response.isSuccessful()) {
                    Lm0.a.f17149a.w(response.toString(), new Object[0]);
                    mVar2 = ((B) yVar).f87658b;
                    mVar2.c(response.code(), a11);
                    fVar = new i.a.C1724a(1, new HttpException(response), null);
                } else {
                    fVar = new i.b(body);
                }
                if (fVar instanceof i.b) {
                }
            }
        }
        lVar = new l(this, cVar);
        Object obj2 = lVar.f87716f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = lVar.f87718h;
        if (i11 != 0) {
        }
        response = (Response) obj2;
        Object body2 = response.body();
        if (response.isSuccessful()) {
        }
        if (fVar instanceof i.b) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00cf A[Catch: Exception -> 0x002e, TryCatch #0 {Exception -> 0x002e, blocks: (B:11:0x0029, B:12:0x00c3, B:14:0x00cf, B:29:0x00d5), top: B:10:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d5 A[Catch: Exception -> 0x002e, TRY_LEAVE, TryCatch #0 {Exception -> 0x002e, blocks: (B:11:0x0029, B:12:0x00c3, B:14:0x00cf, B:29:0x00d5), top: B:10:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(@NotNull ru.ozon.android.messenger.framework.navigation.action.a aVar, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        m mVar;
        int i11;
        Object fVar;
        y yVar;
        String str;
        Object fVar2;
        ru.ozon.android.messenger.framework.data.m mVar2;
        Response response;
        ru.ozon.android.messenger.framework.data.m mVar3;
        if (cVar instanceof m) {
            mVar = (m) cVar;
            int i12 = mVar.f87723h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                mVar.f87723h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = mVar.f87721f;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = mVar.f87723h;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    AtomAction c11 = aVar.c();
                    AtomAction.Click click = c11 instanceof AtomAction.Click ? (AtomAction.Click) c11 : null;
                    if (click == null) {
                        fVar2 = new i.a.f("Incorrect action type", null);
                        if (!(fVar2 instanceof i.b)) {
                            Object b11 = ((i.b) fVar2).b();
                            return new i.b(b11 instanceof AddFastAnswerResponseDTO ? (AddFastAnswerResponseDTO) b11 : null);
                        }
                        if (fVar2 instanceof i.a) {
                            return fVar2;
                        }
                        throw new Sc.o();
                    }
                    Map<String, String> params = click.getParams();
                    String str2 = params != null ? params.get("bodyParams") : null;
                    if (str2 == null) {
                        str2 = "";
                    }
                    Map<String, String> params2 = click.getParams();
                    String str3 = params2 != null ? params2.get("text") : null;
                    String j11 = j(this, str2, str3 != null ? str3 : "");
                    K.Companion companion = K.INSTANCE;
                    String X9 = kotlin.text.h.X(j11, "\n", "\\n", false);
                    companion.getClass();
                    J b12 = K.Companion.b(X9, f87779e);
                    String link = click.getLink();
                    Map<String, String> params3 = click.getParams();
                    if (link == null || params3 == null) {
                        fVar = new i.a.f(J.d.b("NPE link: ", link, " or params: ", params3), null);
                        fVar2 = fVar;
                        if (!(fVar2 instanceof i.b)) {
                        }
                    } else {
                        LinkedHashMap u11 = U.u(params3);
                        String a11 = B.a(this, link);
                        A a12 = new A(a11, u11);
                        try {
                            ActionApi actionApi = this.f87780c;
                            String b13 = a12.b();
                            mVar.f87719d = this;
                            mVar.f87720e = a11;
                            mVar.f87723h = 1;
                            obj = actionApi.saveFastAnswerAction(b13, b12, mVar);
                            if (obj == aVar2) {
                                return aVar2;
                            }
                            yVar = this;
                            str = a11;
                        } catch (Exception e11) {
                            e = e11;
                            yVar = this;
                            str = a11;
                            Lm0.a.f17149a.w(e);
                            mVar2 = ((B) yVar).f87658b;
                            mVar2.b(str, e);
                            fVar = new i.a.C1724a(1, e, null);
                            fVar2 = fVar;
                            if (!(fVar2 instanceof i.b)) {
                            }
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = mVar.f87720e;
                    yVar = mVar.f87719d;
                    try {
                        Sc.s.b(obj);
                    } catch (Exception e12) {
                        e = e12;
                        Lm0.a.f17149a.w(e);
                        mVar2 = ((B) yVar).f87658b;
                        mVar2.b(str, e);
                        fVar = new i.a.C1724a(1, e, null);
                        fVar2 = fVar;
                        if (!(fVar2 instanceof i.b)) {
                        }
                    }
                }
                response = (Response) obj;
                Object body = response.body();
                if (response.isSuccessful()) {
                    Lm0.a.f17149a.w(response.toString(), new Object[0]);
                    mVar3 = ((B) yVar).f87658b;
                    mVar3.c(response.code(), str);
                    fVar = new i.a.C1724a(1, new HttpException(response), null);
                } else {
                    fVar = new i.b(body);
                }
                fVar2 = fVar;
                if (!(fVar2 instanceof i.b)) {
                }
            }
        }
        mVar = new m(this, cVar);
        Object obj2 = mVar.f87721f;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = mVar.f87723h;
        if (i11 != 0) {
        }
        response = (Response) obj2;
        Object body2 = response.body();
        if (response.isSuccessful()) {
        }
        fVar2 = fVar;
        if (!(fVar2 instanceof i.b)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007e A[Catch: Exception -> 0x002c, TryCatch #0 {Exception -> 0x002c, blocks: (B:11:0x0028, B:12:0x0072, B:14:0x007e, B:17:0x0084), top: B:10:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084 A[Catch: Exception -> 0x002c, TRY_LEAVE, TryCatch #0 {Exception -> 0x002c, blocks: (B:11:0x0028, B:12:0x0072, B:14:0x007e, B:17:0x0084), top: B:10:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(AtomActionDTO atomActionDTO, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        n nVar;
        int i11;
        Exception e11;
        String str;
        y yVar;
        ru.ozon.android.messenger.framework.data.m mVar;
        Response response;
        ru.ozon.android.messenger.framework.data.m mVar2;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i12 = nVar.f87728h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                nVar.f87728h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = nVar.f87726f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = nVar.f87728h;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    if (atomActionDTO == null) {
                        return new i.a.f("NPE AtomActionDTO", null);
                    }
                    String link = atomActionDTO.getLink();
                    Map<String, String> params = atomActionDTO.getParams();
                    if (link == null || params == null) {
                        return new i.a.f(J.d.b("NPE link: ", link, " or params: ", params), null);
                    }
                    LinkedHashMap u11 = U.u(params);
                    String a11 = B.a(this, link);
                    A a12 = new A(a11, u11);
                    try {
                        ActionApi actionApi = this.f87780c;
                        String b11 = a12.b();
                        Map<String, Object> a13 = a12.a();
                        nVar.f87724d = this;
                        nVar.f87725e = a11;
                        nVar.f87728h = 1;
                        Object sendAction = actionApi.sendAction(b11, a13, nVar);
                        if (sendAction == aVar) {
                            return aVar;
                        }
                        obj = sendAction;
                        str = a11;
                        yVar = this;
                    } catch (Exception e12) {
                        e11 = e12;
                        str = a11;
                        yVar = this;
                        Lm0.a.f17149a.w(e11);
                        mVar = ((B) yVar).f87658b;
                        mVar.b(str, e11);
                        return new i.a.C1724a(1, e11, null);
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = nVar.f87725e;
                    yVar = nVar.f87724d;
                    try {
                        Sc.s.b(obj);
                    } catch (Exception e13) {
                        e11 = e13;
                        Lm0.a.f17149a.w(e11);
                        mVar = ((B) yVar).f87658b;
                        mVar.b(str, e11);
                        return new i.a.C1724a(1, e11, null);
                    }
                }
                response = (Response) obj;
                Object body = response.body();
                if (!response.isSuccessful()) {
                    return new i.b(body);
                }
                Lm0.a.f17149a.w(response.toString(), new Object[0]);
                mVar2 = ((B) yVar).f87658b;
                mVar2.c(response.code(), str);
                return new i.a.C1724a(1, new HttpException(response), null);
            }
        }
        nVar = new n(this, cVar);
        Object obj2 = nVar.f87726f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = nVar.f87728h;
        if (i11 != 0) {
        }
        response = (Response) obj2;
        Object body2 = response.body();
        if (!response.isSuccessful()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0092 A[Catch: Exception -> 0x002c, TryCatch #0 {Exception -> 0x002c, blocks: (B:11:0x0028, B:12:0x0086, B:14:0x0092, B:17:0x0098), top: B:10:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0098 A[Catch: Exception -> 0x002c, TRY_LEAVE, TryCatch #0 {Exception -> 0x002c, blocks: (B:11:0x0028, B:12:0x0086, B:14:0x0092, B:17:0x0098), top: B:10:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(@NotNull ru.ozon.android.messenger.framework.navigation.action.a aVar, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        o oVar;
        int i11;
        Exception e11;
        String str;
        y yVar;
        ru.ozon.android.messenger.framework.data.m mVar;
        Response response;
        ru.ozon.android.messenger.framework.data.m mVar2;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i12 = oVar.f87733h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                oVar.f87733h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = oVar.f87731f;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = oVar.f87733h;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    AtomAction c11 = aVar.c();
                    AtomAction.ComposerAction composerAction = c11 instanceof AtomAction.ComposerAction ? (AtomAction.ComposerAction) c11 : null;
                    if (composerAction == null) {
                        return new i.a.f("Incorrect action type", null);
                    }
                    String actionName = composerAction.getActionName();
                    Map<String, String> params = composerAction.getParams();
                    if (actionName == null || params == null) {
                        return new i.a.f(J.d.b("NPE link: ", actionName, " or params: ", params), null);
                    }
                    LinkedHashMap u11 = U.u(params);
                    String a11 = B.a(this, actionName);
                    A a12 = new A(a11, u11);
                    try {
                        ActionApi actionApi = this.f87780c;
                        String b11 = a12.b();
                        Map<String, Object> a13 = a12.a();
                        oVar.f87729d = this;
                        oVar.f87730e = a11;
                        oVar.f87733h = 1;
                        Object sendAction = actionApi.sendAction(b11, a13, oVar);
                        if (sendAction == aVar2) {
                            return aVar2;
                        }
                        obj = sendAction;
                        str = a11;
                        yVar = this;
                    } catch (Exception e12) {
                        e11 = e12;
                        str = a11;
                        yVar = this;
                        Lm0.a.f17149a.w(e11);
                        mVar = ((B) yVar).f87658b;
                        mVar.b(str, e11);
                        return new i.a.C1724a(1, e11, null);
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = oVar.f87730e;
                    yVar = oVar.f87729d;
                    try {
                        Sc.s.b(obj);
                    } catch (Exception e13) {
                        e11 = e13;
                        Lm0.a.f17149a.w(e11);
                        mVar = ((B) yVar).f87658b;
                        mVar.b(str, e11);
                        return new i.a.C1724a(1, e11, null);
                    }
                }
                response = (Response) obj;
                Object body = response.body();
                if (!response.isSuccessful()) {
                    return new i.b(body);
                }
                Lm0.a.f17149a.w(response.toString(), new Object[0]);
                mVar2 = ((B) yVar).f87658b;
                mVar2.c(response.code(), str);
                return new i.a.C1724a(1, new HttpException(response), null);
            }
        }
        oVar = new o(this, cVar);
        Object obj2 = oVar.f87731f;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = oVar.f87733h;
        if (i11 != 0) {
        }
        response = (Response) obj2;
        Object body2 = response.body();
        if (!response.isSuccessful()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0089 A[Catch: Exception -> 0x002c, TryCatch #0 {Exception -> 0x002c, blocks: (B:11:0x0028, B:12:0x007d, B:14:0x0089, B:28:0x008f), top: B:10:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008f A[Catch: Exception -> 0x002c, TRY_LEAVE, TryCatch #0 {Exception -> 0x002c, blocks: (B:11:0x0028, B:12:0x007d, B:14:0x0089, B:28:0x008f), top: B:10:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(@NotNull ru.ozon.android.messenger.framework.navigation.action.a aVar, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        p pVar;
        int i11;
        Object fVar;
        Object fVar2;
        y yVar;
        String str;
        ru.ozon.android.messenger.framework.data.m mVar;
        Response response;
        ru.ozon.android.messenger.framework.data.m mVar2;
        if (cVar instanceof p) {
            pVar = (p) cVar;
            int i12 = pVar.f87738h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                pVar.f87738h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = pVar.f87736f;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = pVar.f87738h;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    AtomActionDTO b11 = aVar.b();
                    Map<String, Object> d11 = aVar.d();
                    if (b11 != null) {
                        String link = b11.getLink();
                        Map<String, String> params = b11.getParams();
                        if (link == null || params == null) {
                            fVar2 = new i.a.f(J.d.b("NPE link: ", link, " or params: ", params), null);
                            fVar = fVar2;
                            if (!(fVar instanceof i.b)) {
                                Object b12 = ((i.b) fVar).b();
                                return new i.b(b12 instanceof CouponActionResponseDTO ? (CouponActionResponseDTO) b12 : null);
                            }
                            if (fVar instanceof i.a) {
                                return fVar;
                            }
                            throw new Sc.o();
                        }
                        LinkedHashMap u11 = U.u(params);
                        String a11 = B.a(this, link);
                        if (d11 != null) {
                            u11.putAll(d11);
                        }
                        A a12 = new A(a11, u11);
                        try {
                            ActionApi actionApi = this.f87780c;
                            String b13 = a12.b();
                            Map<String, Object> a13 = a12.a();
                            pVar.f87734d = this;
                            pVar.f87735e = a11;
                            pVar.f87738h = 1;
                            obj = actionApi.sendCouponAction(b13, a13, pVar);
                            if (obj == aVar2) {
                                return aVar2;
                            }
                            yVar = this;
                            str = a11;
                        } catch (Exception e11) {
                            e = e11;
                            yVar = this;
                            str = a11;
                            Lm0.a.f17149a.w(e);
                            mVar = ((B) yVar).f87658b;
                            mVar.b(str, e);
                            fVar2 = new i.a.C1724a(1, e, null);
                            fVar = fVar2;
                            if (!(fVar instanceof i.b)) {
                            }
                        }
                    } else {
                        fVar = new i.a.f("NPE AtomActionDTO", null);
                        if (!(fVar instanceof i.b)) {
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = pVar.f87735e;
                    yVar = pVar.f87734d;
                    try {
                        Sc.s.b(obj);
                    } catch (Exception e12) {
                        e = e12;
                        Lm0.a.f17149a.w(e);
                        mVar = ((B) yVar).f87658b;
                        mVar.b(str, e);
                        fVar2 = new i.a.C1724a(1, e, null);
                        fVar = fVar2;
                        if (!(fVar instanceof i.b)) {
                        }
                    }
                }
                response = (Response) obj;
                Object body = response.body();
                if (response.isSuccessful()) {
                    Lm0.a.f17149a.w(response.toString(), new Object[0]);
                    mVar2 = ((B) yVar).f87658b;
                    mVar2.c(response.code(), str);
                    fVar = new i.a.C1724a(1, new HttpException(response), null);
                } else {
                    fVar = new i.b(body);
                }
                if (!(fVar instanceof i.b)) {
                }
            }
        }
        pVar = new p(this, cVar);
        Object obj2 = pVar.f87736f;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = pVar.f87738h;
        if (i11 != 0) {
        }
        response = (Response) obj2;
        Object body2 = response.body();
        if (response.isSuccessful()) {
        }
        if (!(fVar instanceof i.b)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0089 A[Catch: Exception -> 0x002c, TryCatch #0 {Exception -> 0x002c, blocks: (B:11:0x0028, B:12:0x007d, B:14:0x0089, B:17:0x008f), top: B:10:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008f A[Catch: Exception -> 0x002c, TRY_LEAVE, TryCatch #0 {Exception -> 0x002c, blocks: (B:11:0x0028, B:12:0x007d, B:14:0x0089, B:17:0x008f), top: B:10:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(@NotNull ru.ozon.android.messenger.framework.navigation.action.a aVar, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        q qVar;
        int i11;
        y yVar;
        String str;
        ru.ozon.android.messenger.framework.data.m mVar;
        Response response;
        ru.ozon.android.messenger.framework.data.m mVar2;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i12 = qVar.f87743h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                qVar.f87743h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = qVar.f87741f;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = qVar.f87743h;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    AtomActionDTO b11 = aVar.b();
                    Map<String, Object> d11 = aVar.d();
                    if (b11 == null) {
                        return new i.a.f("NPE AtomActionDTO", null);
                    }
                    String link = b11.getLink();
                    Map<String, String> params = b11.getParams();
                    if (link == null || params == null) {
                        return new i.a.f(J.d.b("NPE link: ", link, " or params: ", params), null);
                    }
                    LinkedHashMap u11 = U.u(params);
                    String a11 = B.a(this, link);
                    if (d11 != null) {
                        u11.putAll(d11);
                    }
                    A a12 = new A(a11, u11);
                    try {
                        ActionApi actionApi = this.f87780c;
                        String b12 = a12.b();
                        Map<String, Object> a13 = a12.a();
                        qVar.f87739d = this;
                        qVar.f87740e = a11;
                        qVar.f87743h = 1;
                        obj = actionApi.sendAction(b12, a13, qVar);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                        yVar = this;
                        str = a11;
                    } catch (Exception e11) {
                        e = e11;
                        yVar = this;
                        str = a11;
                        Lm0.a.f17149a.w(e);
                        mVar = ((B) yVar).f87658b;
                        mVar.b(str, e);
                        return new i.a.C1724a(1, e, null);
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = qVar.f87740e;
                    yVar = qVar.f87739d;
                    try {
                        Sc.s.b(obj);
                    } catch (Exception e12) {
                        e = e12;
                        Lm0.a.f17149a.w(e);
                        mVar = ((B) yVar).f87658b;
                        mVar.b(str, e);
                        return new i.a.C1724a(1, e, null);
                    }
                }
                response = (Response) obj;
                Object body = response.body();
                if (!response.isSuccessful()) {
                    return new i.b(body);
                }
                Lm0.a.f17149a.w(response.toString(), new Object[0]);
                mVar2 = ((B) yVar).f87658b;
                mVar2.c(response.code(), str);
                return new i.a.C1724a(1, new HttpException(response), null);
            }
        }
        qVar = new q(this, cVar);
        Object obj2 = qVar.f87741f;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = qVar.f87743h;
        if (i11 != 0) {
        }
        response = (Response) obj2;
        Object body2 = response.body();
        if (!response.isSuccessful()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0089 A[Catch: Exception -> 0x002c, TryCatch #0 {Exception -> 0x002c, blocks: (B:11:0x0028, B:12:0x007d, B:14:0x0089, B:28:0x008f), top: B:10:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008f A[Catch: Exception -> 0x002c, TRY_LEAVE, TryCatch #0 {Exception -> 0x002c, blocks: (B:11:0x0028, B:12:0x007d, B:14:0x0089, B:28:0x008f), top: B:10:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u(@NotNull ru.ozon.android.messenger.framework.navigation.action.a aVar, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        r rVar;
        int i11;
        Object fVar;
        Object fVar2;
        y yVar;
        String str;
        ru.ozon.android.messenger.framework.data.m mVar;
        Response response;
        ru.ozon.android.messenger.framework.data.m mVar2;
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i12 = rVar.f87748h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                rVar.f87748h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = rVar.f87746f;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = rVar.f87748h;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    AtomActionDTO b11 = aVar.b();
                    Map<String, Object> d11 = aVar.d();
                    if (b11 != null) {
                        String link = b11.getLink();
                        Map<String, String> params = b11.getParams();
                        if (link == null || params == null) {
                            fVar2 = new i.a.f(J.d.b("NPE link: ", link, " or params: ", params), null);
                            fVar = fVar2;
                            if (!(fVar instanceof i.b)) {
                                Object b12 = ((i.b) fVar).b();
                                return new i.b(b12 instanceof OriginalTextResponseDTO ? (OriginalTextResponseDTO) b12 : null);
                            }
                            if (fVar instanceof i.a) {
                                return fVar;
                            }
                            throw new Sc.o();
                        }
                        LinkedHashMap u11 = U.u(params);
                        String a11 = B.a(this, link);
                        if (d11 != null) {
                            u11.putAll(d11);
                        }
                        A a12 = new A(a11, u11);
                        try {
                            ActionApi actionApi = this.f87780c;
                            String b13 = a12.b();
                            Map<String, Object> a13 = a12.a();
                            rVar.f87744d = this;
                            rVar.f87745e = a11;
                            rVar.f87748h = 1;
                            obj = actionApi.getOriginalTextAction(b13, a13, rVar);
                            if (obj == aVar2) {
                                return aVar2;
                            }
                            yVar = this;
                            str = a11;
                        } catch (Exception e11) {
                            e = e11;
                            yVar = this;
                            str = a11;
                            Lm0.a.f17149a.w(e);
                            mVar = ((B) yVar).f87658b;
                            mVar.b(str, e);
                            fVar2 = new i.a.C1724a(1, e, null);
                            fVar = fVar2;
                            if (!(fVar instanceof i.b)) {
                            }
                        }
                    } else {
                        fVar = new i.a.f("NPE AtomActionDTO", null);
                        if (!(fVar instanceof i.b)) {
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = rVar.f87745e;
                    yVar = rVar.f87744d;
                    try {
                        Sc.s.b(obj);
                    } catch (Exception e12) {
                        e = e12;
                        Lm0.a.f17149a.w(e);
                        mVar = ((B) yVar).f87658b;
                        mVar.b(str, e);
                        fVar2 = new i.a.C1724a(1, e, null);
                        fVar = fVar2;
                        if (!(fVar instanceof i.b)) {
                        }
                    }
                }
                response = (Response) obj;
                Object body = response.body();
                if (response.isSuccessful()) {
                    Lm0.a.f17149a.w(response.toString(), new Object[0]);
                    mVar2 = ((B) yVar).f87658b;
                    mVar2.c(response.code(), str);
                    fVar = new i.a.C1724a(1, new HttpException(response), null);
                } else {
                    fVar = new i.b(body);
                }
                if (!(fVar instanceof i.b)) {
                }
            }
        }
        rVar = new r(this, cVar);
        Object obj2 = rVar.f87746f;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = rVar.f87748h;
        if (i11 != 0) {
        }
        response = (Response) obj2;
        Object body2 = response.body();
        if (response.isSuccessful()) {
        }
        if (!(fVar instanceof i.b)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00ee A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:11:0x0028, B:12:0x00e2, B:14:0x00ee, B:17:0x00f4), top: B:10:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00f4 A[Catch: Exception -> 0x002d, TRY_LEAVE, TryCatch #0 {Exception -> 0x002d, blocks: (B:11:0x0028, B:12:0x00e2, B:14:0x00ee, B:17:0x00f4), top: B:10:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(@NotNull ru.ozon.android.messenger.blocks.rateoperator.bottomsheet.j jVar, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        s sVar;
        int i11;
        y yVar;
        String str;
        ru.ozon.android.messenger.framework.data.m mVar;
        Response response;
        ru.ozon.android.messenger.framework.data.m mVar2;
        if (cVar instanceof s) {
            sVar = (s) cVar;
            int i12 = sVar.f87753h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                sVar.f87753h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = sVar.f87751f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = sVar.f87753h;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    List<d.b> c11 = jVar.c();
                    Intrinsics.checkNotNullParameter(c11, "<this>");
                    ArrayList arrayList = new ArrayList(C7714v.z(c11, 10));
                    for (d.b bVar : c11) {
                        arrayList.add(new RateDTO.ReasonDTO(bVar.a(), bVar.getName()));
                    }
                    Map j11 = U.j(new Pair(d.c.RATE.a(), Integer.valueOf(jVar.b())), new Pair(d.c.TEXT.a(), jVar.d()), new Pair(d.c.REASONS.a(), arrayList));
                    AtomActionDTO a11 = jVar.a();
                    if (a11 == null) {
                        return new i.a.f("NPE AtomActionDTO", null);
                    }
                    String link = a11.getLink();
                    Map<String, String> params = a11.getParams();
                    if (link == null || params == null) {
                        return new i.a.f(J.d.b("NPE link: ", link, " or params: ", params), null);
                    }
                    LinkedHashMap u11 = U.u(params);
                    String a12 = B.a(this, link);
                    u11.putAll(j11);
                    A a13 = new A(a12, u11);
                    try {
                        ActionApi actionApi = this.f87780c;
                        String b11 = a13.b();
                        Map<String, Object> a14 = a13.a();
                        sVar.f87749d = this;
                        sVar.f87750e = a12;
                        sVar.f87753h = 1;
                        obj = actionApi.sendAction(b11, a14, sVar);
                        if (obj == aVar) {
                            return aVar;
                        }
                        yVar = this;
                        str = a12;
                    } catch (Exception e11) {
                        e = e11;
                        yVar = this;
                        str = a12;
                        Lm0.a.f17149a.w(e);
                        mVar = ((B) yVar).f87658b;
                        mVar.b(str, e);
                        return new i.a.C1724a(1, e, null);
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = sVar.f87750e;
                    yVar = sVar.f87749d;
                    try {
                        Sc.s.b(obj);
                    } catch (Exception e12) {
                        e = e12;
                        Lm0.a.f17149a.w(e);
                        mVar = ((B) yVar).f87658b;
                        mVar.b(str, e);
                        return new i.a.C1724a(1, e, null);
                    }
                }
                response = (Response) obj;
                Object body = response.body();
                if (!response.isSuccessful()) {
                    return new i.b(body);
                }
                Lm0.a.f17149a.w(response.toString(), new Object[0]);
                mVar2 = ((B) yVar).f87658b;
                mVar2.c(response.code(), str);
                return new i.a.C1724a(1, new HttpException(response), null);
            }
        }
        sVar = new s(this, cVar);
        Object obj2 = sVar.f87751f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = sVar.f87753h;
        if (i11 != 0) {
        }
        response = (Response) obj2;
        Object body2 = response.body();
        if (!response.isSuccessful()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0092 A[Catch: Exception -> 0x002c, TryCatch #0 {Exception -> 0x002c, blocks: (B:11:0x0028, B:12:0x0086, B:14:0x0092, B:28:0x0098), top: B:10:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098 A[Catch: Exception -> 0x002c, TRY_LEAVE, TryCatch #0 {Exception -> 0x002c, blocks: (B:11:0x0028, B:12:0x0086, B:14:0x0092, B:28:0x0098), top: B:10:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object w(@NotNull ru.ozon.android.messenger.framework.navigation.action.a aVar, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        t tVar;
        int i11;
        Object fVar;
        Exception e11;
        String str;
        y yVar;
        ru.ozon.android.messenger.framework.data.m mVar;
        Response response;
        ru.ozon.android.messenger.framework.data.m mVar2;
        if (cVar instanceof t) {
            tVar = (t) cVar;
            int i12 = tVar.f87758h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                tVar.f87758h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = tVar.f87756f;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = tVar.f87758h;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    AtomAction c11 = aVar.c();
                    AtomAction.Click click = c11 instanceof AtomAction.Click ? (AtomAction.Click) c11 : null;
                    if (click == null) {
                        return new i.a.f("Incorrect action type", null);
                    }
                    String link = click.getLink();
                    Map<String, String> params = click.getParams();
                    if (link == null || params == null) {
                        fVar = new i.a.f(J.d.b("NPE link: ", link, " or params: ", params), null);
                        if (fVar instanceof i.b) {
                            Object b11 = ((i.b) fVar).b();
                            return new i.b(b11 instanceof ReadAllResponseDTO ? (ReadAllResponseDTO) b11 : null);
                        }
                        if (fVar instanceof i.a) {
                            return fVar;
                        }
                        throw new Sc.o();
                    }
                    LinkedHashMap u11 = U.u(params);
                    String a11 = B.a(this, link);
                    A a12 = new A(a11, u11);
                    try {
                        ActionApi actionApi = this.f87780c;
                        String b12 = a12.b();
                        Map<String, Object> a13 = a12.a();
                        tVar.f87754d = this;
                        tVar.f87755e = a11;
                        tVar.f87758h = 1;
                        Object sendReadAllAction = actionApi.sendReadAllAction(b12, a13, tVar);
                        if (sendReadAllAction == aVar2) {
                            return aVar2;
                        }
                        obj = sendReadAllAction;
                        str = a11;
                        yVar = this;
                    } catch (Exception e12) {
                        e11 = e12;
                        str = a11;
                        yVar = this;
                        Lm0.a.f17149a.w(e11);
                        mVar = ((B) yVar).f87658b;
                        mVar.b(str, e11);
                        fVar = new i.a.C1724a(1, e11, null);
                        if (fVar instanceof i.b) {
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = tVar.f87755e;
                    yVar = tVar.f87754d;
                    try {
                        Sc.s.b(obj);
                    } catch (Exception e13) {
                        e11 = e13;
                        Lm0.a.f17149a.w(e11);
                        mVar = ((B) yVar).f87658b;
                        mVar.b(str, e11);
                        fVar = new i.a.C1724a(1, e11, null);
                        if (fVar instanceof i.b) {
                        }
                    }
                }
                response = (Response) obj;
                Object body = response.body();
                if (response.isSuccessful()) {
                    Lm0.a.f17149a.w(response.toString(), new Object[0]);
                    mVar2 = ((B) yVar).f87658b;
                    mVar2.c(response.code(), str);
                    fVar = new i.a.C1724a(1, new HttpException(response), null);
                } else {
                    fVar = new i.b(body);
                }
                if (fVar instanceof i.b) {
                }
            }
        }
        tVar = new t(this, cVar);
        Object obj2 = tVar.f87756f;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = tVar.f87758h;
        if (i11 != 0) {
        }
        response = (Response) obj2;
        Object body2 = response.body();
        if (response.isSuccessful()) {
        }
        if (fVar instanceof i.b) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0114 A[Catch: Exception -> 0x002e, TryCatch #0 {Exception -> 0x002e, blocks: (B:11:0x0029, B:12:0x0108, B:14:0x0114, B:29:0x011a), top: B:10:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x011a A[Catch: Exception -> 0x002e, TRY_LEAVE, TryCatch #0 {Exception -> 0x002e, blocks: (B:11:0x0029, B:12:0x0108, B:14:0x0114, B:29:0x011a), top: B:10:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object x(@NotNull ru.ozon.android.messenger.framework.navigation.action.a aVar, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        u uVar;
        int i11;
        JSONObject jSONObject;
        Object fVar;
        y yVar;
        String str;
        Object fVar2;
        ru.ozon.android.messenger.framework.data.m mVar;
        Response response;
        ru.ozon.android.messenger.framework.data.m mVar2;
        if (cVar instanceof u) {
            uVar = (u) cVar;
            int i12 = uVar.f87763h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                uVar.f87763h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = uVar.f87761f;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = uVar.f87763h;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    AtomAction c11 = aVar.c();
                    AtomAction.Click click = c11 instanceof AtomAction.Click ? (AtomAction.Click) c11 : null;
                    if (click == null) {
                        fVar2 = new i.a.f("Incorrect action type", null);
                        if (!(fVar2 instanceof i.b)) {
                            Object b11 = ((i.b) fVar2).b();
                            return new i.b(b11 instanceof CurtainModalResponseDTO ? (CurtainModalResponseDTO) b11 : null);
                        }
                        if (fVar2 instanceof i.a) {
                            return fVar2;
                        }
                        throw new Sc.o();
                    }
                    Map<String, String> params = click.getParams();
                    String str2 = params != null ? params.get("bodyParams") : null;
                    if (str2 == null) {
                        str2 = "";
                    }
                    String obj2 = kotlin.text.h.z0(androidx.core.text.b.a(str2, 0).toString()).toString();
                    Map<String, String> params2 = click.getParams();
                    String str3 = params2 != null ? params2.get("reason") : null;
                    if (str3 == null) {
                        str3 = "";
                    }
                    Map<String, String> params3 = click.getParams();
                    String str4 = params3 != null ? params3.get("description") : null;
                    String str5 = str4 != null ? str4 : "";
                    if (kotlin.text.h.K(obj2)) {
                        jSONObject = new JSONObject();
                    } else {
                        try {
                            jSONObject = new JSONObject(obj2);
                        } catch (Exception unused) {
                            jSONObject = new JSONObject();
                        }
                    }
                    jSONObject.put("reason", str3);
                    jSONObject.put("description", str5);
                    K.Companion companion = K.INSTANCE;
                    String jSONObject2 = jSONObject.toString();
                    Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
                    String X9 = kotlin.text.h.X(jSONObject2, "\n", "\\n", false);
                    companion.getClass();
                    J b12 = K.Companion.b(X9, f87779e);
                    String link = click.getLink();
                    Map<String, String> params4 = click.getParams();
                    if (link == null || params4 == null) {
                        fVar = new i.a.f(J.d.b("NPE link: ", link, " or params: ", params4), null);
                        fVar2 = fVar;
                        if (!(fVar2 instanceof i.b)) {
                        }
                    } else {
                        LinkedHashMap u11 = U.u(params4);
                        String a11 = B.a(this, link);
                        A a12 = new A(a11, u11);
                        try {
                            ActionApi actionApi = this.f87780c;
                            String b13 = a12.b();
                            uVar.f87759d = this;
                            uVar.f87760e = a11;
                            uVar.f87763h = 1;
                            obj = actionApi.sendReportAbuseAction(b13, b12, uVar);
                            if (obj == aVar2) {
                                return aVar2;
                            }
                            yVar = this;
                            str = a11;
                        } catch (Exception e11) {
                            e = e11;
                            yVar = this;
                            str = a11;
                            Lm0.a.f17149a.w(e);
                            mVar = ((B) yVar).f87658b;
                            mVar.b(str, e);
                            fVar = new i.a.C1724a(1, e, null);
                            fVar2 = fVar;
                            if (!(fVar2 instanceof i.b)) {
                            }
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = uVar.f87760e;
                    yVar = uVar.f87759d;
                    try {
                        Sc.s.b(obj);
                    } catch (Exception e12) {
                        e = e12;
                        Lm0.a.f17149a.w(e);
                        mVar = ((B) yVar).f87658b;
                        mVar.b(str, e);
                        fVar = new i.a.C1724a(1, e, null);
                        fVar2 = fVar;
                        if (!(fVar2 instanceof i.b)) {
                        }
                    }
                }
                response = (Response) obj;
                Object body = response.body();
                if (response.isSuccessful()) {
                    Lm0.a.f17149a.w(response.toString(), new Object[0]);
                    mVar2 = ((B) yVar).f87658b;
                    mVar2.c(response.code(), str);
                    fVar = new i.a.C1724a(1, new HttpException(response), null);
                } else {
                    fVar = new i.b(body);
                }
                fVar2 = fVar;
                if (!(fVar2 instanceof i.b)) {
                }
            }
        }
        uVar = new u(this, cVar);
        Object obj3 = uVar.f87761f;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = uVar.f87763h;
        if (i11 != 0) {
        }
        response = (Response) obj3;
        Object body2 = response.body();
        if (response.isSuccessful()) {
        }
        fVar2 = fVar;
        if (!(fVar2 instanceof i.b)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0092 A[Catch: Exception -> 0x002c, TryCatch #0 {Exception -> 0x002c, blocks: (B:11:0x0028, B:12:0x0086, B:14:0x0092, B:17:0x0098), top: B:10:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0098 A[Catch: Exception -> 0x002c, TRY_LEAVE, TryCatch #0 {Exception -> 0x002c, blocks: (B:11:0x0028, B:12:0x0086, B:14:0x0092, B:17:0x0098), top: B:10:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object y(@NotNull ru.ozon.android.messenger.framework.navigation.action.a aVar, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        v vVar;
        int i11;
        Exception e11;
        String str;
        y yVar;
        ru.ozon.android.messenger.framework.data.m mVar;
        Response response;
        ru.ozon.android.messenger.framework.data.m mVar2;
        if (cVar instanceof v) {
            vVar = (v) cVar;
            int i12 = vVar.f87768h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                vVar.f87768h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = vVar.f87766f;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = vVar.f87768h;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    AtomAction c11 = aVar.c();
                    AtomAction.Click click = c11 instanceof AtomAction.Click ? (AtomAction.Click) c11 : null;
                    if (click == null) {
                        return new i.a.f("Incorrect action type", null);
                    }
                    String link = click.getLink();
                    Map<String, String> params = click.getParams();
                    if (link == null || params == null) {
                        return new i.a.f(J.d.b("NPE link: ", link, " or params: ", params), null);
                    }
                    LinkedHashMap u11 = U.u(params);
                    String a11 = B.a(this, link);
                    A a12 = new A(a11, u11);
                    try {
                        ActionApi actionApi = this.f87780c;
                        String b11 = a12.b();
                        Map<String, Object> a13 = a12.a();
                        vVar.f87764d = this;
                        vVar.f87765e = a11;
                        vVar.f87768h = 1;
                        Object sendAction = actionApi.sendAction(b11, a13, vVar);
                        if (sendAction == aVar2) {
                            return aVar2;
                        }
                        obj = sendAction;
                        str = a11;
                        yVar = this;
                    } catch (Exception e12) {
                        e11 = e12;
                        str = a11;
                        yVar = this;
                        Lm0.a.f17149a.w(e11);
                        mVar = ((B) yVar).f87658b;
                        mVar.b(str, e11);
                        return new i.a.C1724a(1, e11, null);
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = vVar.f87765e;
                    yVar = vVar.f87764d;
                    try {
                        Sc.s.b(obj);
                    } catch (Exception e13) {
                        e11 = e13;
                        Lm0.a.f17149a.w(e11);
                        mVar = ((B) yVar).f87658b;
                        mVar.b(str, e11);
                        return new i.a.C1724a(1, e11, null);
                    }
                }
                response = (Response) obj;
                Object body = response.body();
                if (!response.isSuccessful()) {
                    return new i.b(body);
                }
                Lm0.a.f17149a.w(response.toString(), new Object[0]);
                mVar2 = ((B) yVar).f87658b;
                mVar2.c(response.code(), str);
                return new i.a.C1724a(1, new HttpException(response), null);
            }
        }
        vVar = new v(this, cVar);
        Object obj2 = vVar.f87766f;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = vVar.f87768h;
        if (i11 != 0) {
        }
        response = (Response) obj2;
        Object body2 = response.body();
        if (!response.isSuccessful()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0092 A[Catch: Exception -> 0x002c, TryCatch #0 {Exception -> 0x002c, blocks: (B:11:0x0028, B:12:0x0086, B:14:0x0092, B:17:0x0098), top: B:10:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0098 A[Catch: Exception -> 0x002c, TRY_LEAVE, TryCatch #0 {Exception -> 0x002c, blocks: (B:11:0x0028, B:12:0x0086, B:14:0x0092, B:17:0x0098), top: B:10:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object z(@NotNull ru.ozon.android.messenger.framework.navigation.action.a aVar, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        w wVar;
        int i11;
        Exception e11;
        String str;
        y yVar;
        ru.ozon.android.messenger.framework.data.m mVar;
        Response response;
        ru.ozon.android.messenger.framework.data.m mVar2;
        if (cVar instanceof w) {
            wVar = (w) cVar;
            int i12 = wVar.f87773h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                wVar.f87773h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = wVar.f87771f;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = wVar.f87773h;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    AtomAction c11 = aVar.c();
                    AtomAction.Click click = c11 instanceof AtomAction.Click ? (AtomAction.Click) c11 : null;
                    if (click == null) {
                        return new i.a.f("Incorrect action type", null);
                    }
                    String link = click.getLink();
                    Map<String, String> params = click.getParams();
                    if (link == null || params == null) {
                        return new i.a.f(J.d.b("NPE link: ", link, " or params: ", params), null);
                    }
                    LinkedHashMap u11 = U.u(params);
                    String a11 = B.a(this, link);
                    A a12 = new A(a11, u11);
                    try {
                        ActionApi actionApi = this.f87780c;
                        String b11 = a12.b();
                        Map<String, Object> a13 = a12.a();
                        wVar.f87769d = this;
                        wVar.f87770e = a11;
                        wVar.f87773h = 1;
                        Object sendAction = actionApi.sendAction(b11, a13, wVar);
                        if (sendAction == aVar2) {
                            return aVar2;
                        }
                        obj = sendAction;
                        str = a11;
                        yVar = this;
                    } catch (Exception e12) {
                        e11 = e12;
                        str = a11;
                        yVar = this;
                        Lm0.a.f17149a.w(e11);
                        mVar = ((B) yVar).f87658b;
                        mVar.b(str, e11);
                        return new i.a.C1724a(1, e11, null);
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = wVar.f87770e;
                    yVar = wVar.f87769d;
                    try {
                        Sc.s.b(obj);
                    } catch (Exception e13) {
                        e11 = e13;
                        Lm0.a.f17149a.w(e11);
                        mVar = ((B) yVar).f87658b;
                        mVar.b(str, e11);
                        return new i.a.C1724a(1, e11, null);
                    }
                }
                response = (Response) obj;
                Object body = response.body();
                if (!response.isSuccessful()) {
                    return new i.b(body);
                }
                Lm0.a.f17149a.w(response.toString(), new Object[0]);
                mVar2 = ((B) yVar).f87658b;
                mVar2.c(response.code(), str);
                return new i.a.C1724a(1, new HttpException(response), null);
            }
        }
        wVar = new w(this, cVar);
        Object obj2 = wVar.f87771f;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = wVar.f87773h;
        if (i11 != 0) {
        }
        response = (Response) obj2;
        Object body2 = response.body();
        if (!response.isSuccessful()) {
        }
    }
}
