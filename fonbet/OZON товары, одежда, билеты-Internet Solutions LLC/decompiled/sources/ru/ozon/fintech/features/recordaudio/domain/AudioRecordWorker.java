package ru.ozon.fintech.features.recordaudio.domain;

import Sc.s;
import We.C;
import We.D;
import We.H;
import We.J;
import We.K;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.e;
import androidx.work.n;
import g30.InterfaceC6618a;
import java.io.File;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.Response;
import ru.ozon.fintech.features.recordaudio.network.AudioRecordNetwork;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/fintech/features/recordaudio/domain/AudioRecordWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "record-audio_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AudioRecordWorker extends CoroutineWorker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioRecordWorker(@NotNull Context context, @NotNull WorkerParameters params) {
        super(context, params);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(params, "params");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b7 A[Catch: Exception -> 0x00b2, TRY_LEAVE, TryCatch #0 {Exception -> 0x00b2, blocks: (B:13:0x00a1, B:15:0x00a9, B:19:0x00b7, B:36:0x0065), top: B:35:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(File file, c cVar) {
        b bVar;
        int i11;
        boolean z11;
        InterfaceC6618a e02;
        Object sendAudioRecordChunk;
        Exception e11;
        Response response;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i12 = bVar.f96145h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                bVar.f96145h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = bVar.f96143f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = bVar.f96145h;
                boolean z12 = false;
                z11 = true;
                if (i11 != 0) {
                    s.b(obj);
                    e inputData = getInputData();
                    Intrinsics.checkNotNullExpressionValue(inputData, "getInputData(...)");
                    U70.a aVar2 = (U70.a) O30.a.a(O30.c.b(inputData)).a(T70.a.class);
                    AudioRecordNetwork X02 = aVar2.X0();
                    e02 = aVar2.e0();
                    try {
                        K.Companion companion = K.INSTANCE;
                        C.f33536g.getClass();
                        C b11 = C.a.b("audio/*");
                        companion.getClass();
                        H a11 = K.Companion.a(file, b11);
                        D.c.a aVar3 = D.c.f33553c;
                        String name = file.getName();
                        aVar3.getClass();
                        D.c b12 = D.c.a.b("uploadFile", name, a11);
                        J b13 = K.Companion.b("meetingAudio", C.a.b("text/plain"));
                        bVar.f96141d = file;
                        bVar.f96142e = e02;
                        bVar.f96145h = 1;
                        sendAudioRecordChunk = X02.sendAudioRecordChunk(b12, b13, bVar);
                        if (sendAudioRecordChunk == aVar) {
                            return aVar;
                        }
                    } catch (Exception e12) {
                        e11 = e12;
                        String name2 = file.getName();
                        Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                        e02.W(name2, Boolean.FALSE, e11.getMessage(), new Integer(0));
                        return Boolean.valueOf(z12);
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    InterfaceC6618a interfaceC6618a = bVar.f96142e;
                    File file2 = bVar.f96141d;
                    try {
                        s.b(obj);
                        e02 = interfaceC6618a;
                        file = file2;
                        sendAudioRecordChunk = obj;
                    } catch (Exception e13) {
                        e02 = interfaceC6618a;
                        file = file2;
                        e11 = e13;
                        String name22 = file.getName();
                        Intrinsics.checkNotNullExpressionValue(name22, "getName(...)");
                        e02.W(name22, Boolean.FALSE, e11.getMessage(), new Integer(0));
                        return Boolean.valueOf(z12);
                    }
                }
                response = (Response) sendAudioRecordChunk;
                if (response.isSuccessful() || response.code() != 200) {
                    z11 = false;
                }
                if (!z11) {
                    String name3 = file.getName();
                    Intrinsics.checkNotNullExpressionValue(name3, "getName(...)");
                    e02.W(name3, Boolean.TRUE, response.message(), new Integer(response.code()));
                }
                z12 = z11;
                return Boolean.valueOf(z12);
            }
        }
        bVar = new b(this, cVar);
        Object obj2 = bVar.f96143f;
        Wc.a aVar4 = Wc.a.COROUTINE_SUSPENDED;
        i11 = bVar.f96145h;
        boolean z122 = false;
        z11 = true;
        if (i11 != 0) {
        }
        response = (Response) sendAudioRecordChunk;
        if (response.isSuccessful()) {
        }
        z11 = false;
        if (!z11) {
        }
        z122 = z11;
        return Boolean.valueOf(z122);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0077 A[Catch: Exception -> 0x0029, TryCatch #0 {Exception -> 0x0029, blocks: (B:11:0x0025, B:12:0x006f, B:14:0x0077, B:17:0x0080, B:26:0x0052, B:28:0x0058, B:30:0x0063), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0080 A[Catch: Exception -> 0x0029, TRY_LEAVE, TryCatch #0 {Exception -> 0x0029, blocks: (B:11:0x0025, B:12:0x006f, B:14:0x0077, B:17:0x0080, B:26:0x0052, B:28:0x0058, B:30:0x0063), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(@NotNull c cVar) {
        a aVar;
        Object obj;
        int i11;
        File file;
        try {
            if (cVar instanceof a) {
                aVar = (a) cVar;
                int i12 = aVar.f96140g;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    aVar.f96140g = i12 - LinearLayoutManager.INVALID_OFFSET;
                    obj = aVar.f96138e;
                    Object obj2 = Wc.a.COROUTINE_SUSPENDED;
                    i11 = aVar.f96140g;
                    if (i11 != 0) {
                        s.b(obj);
                        String d11 = getInputData().d("filePath");
                        if (d11 == null) {
                            n.a.C0823a c0823a = new n.a.C0823a();
                            Intrinsics.checkNotNullExpressionValue(c0823a, "failure(...)");
                            return c0823a;
                        }
                        File file2 = new File(d11);
                        if (!file2.exists()) {
                            n.a.c cVar2 = new n.a.c();
                            Intrinsics.checkNotNullExpressionValue(cVar2, "success(...)");
                            return cVar2;
                        }
                        aVar.f96137d = file2;
                        aVar.f96140g = 1;
                        obj = g(file2, aVar);
                        if (obj == obj2) {
                            return obj2;
                        }
                        file = file2;
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        file = aVar.f96137d;
                        s.b(obj);
                    }
                    if (((Boolean) obj).booleanValue()) {
                        return new n.a.b();
                    }
                    file.delete();
                    return new n.a.c();
                }
            }
            if (i11 != 0) {
            }
            if (((Boolean) obj).booleanValue()) {
            }
        } catch (Exception e11) {
            e11.printStackTrace();
            return new n.a.b();
        }
        aVar = new a(this, cVar);
        obj = aVar.f96138e;
        Object obj22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = aVar.f96140g;
    }
}
