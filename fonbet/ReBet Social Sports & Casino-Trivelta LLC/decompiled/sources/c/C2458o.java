package c;

import Ph.AbstractC1440a0;
import Ph.AbstractC1459k;
import Ph.C1452g0;
import Ph.C1469p;
import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import com.surt.guardian.GuardianSDK;
import com.surt.guardian.core.Configuration;
import com.surt.guardian.network.CollectResult;
import com.surt.guardian.utils.Logger;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.UUID;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import l0.AbstractC5338c;
import org.json.JSONObject;
import zc.AbstractC6956b;
import zc.C6957c;

/* renamed from: c.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2458o extends SuspendLambda implements Function2 {

    /* renamed from: n, reason: collision with root package name */
    public Object f26639n;

    /* renamed from: o, reason: collision with root package name */
    public Object f26640o;

    /* renamed from: p, reason: collision with root package name */
    public String f26641p;

    /* renamed from: q, reason: collision with root package name */
    public int f26642q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f26643r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ GuardianSDK f26644s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f26645t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f26646u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Function1 f26647v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2458o(GuardianSDK guardianSDK, boolean z10, String str, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.f26644s = guardianSDK;
        this.f26645t = z10;
        this.f26646u = str;
        this.f26647v = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C2458o c2458o = new C2458o(this.f26644s, this.f26645t, this.f26646u, this.f26647v, continuation);
        c2458o.f26643r = obj;
        return c2458o;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C2458o) create((Ph.P) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0204 A[Catch: Exception -> 0x006b, TryCatch #0 {Exception -> 0x006b, blocks: (B:14:0x0603, B:16:0x0613, B:17:0x061a, B:21:0x0689, B:25:0x0695, B:30:0x0668, B:32:0x0672, B:34:0x067a, B:40:0x05ea, B:46:0x005a, B:49:0x0269, B:51:0x026f, B:52:0x027b, B:54:0x0297, B:55:0x02b1, B:57:0x04f3, B:58:0x0513, B:60:0x0519, B:62:0x0525, B:63:0x052c, B:64:0x0534, B:66:0x0538, B:68:0x053e, B:69:0x0562, B:71:0x0568, B:72:0x0584, B:74:0x058a, B:75:0x05a6, B:94:0x007c, B:96:0x01ea, B:98:0x01f0, B:99:0x024b, B:103:0x0204, B:105:0x0208, B:107:0x0226, B:109:0x022a, B:112:0x0093, B:114:0x018c, B:117:0x01b9, B:119:0x01c5, B:125:0x00a4, B:127:0x017d, B:131:0x00bb, B:133:0x0167, B:137:0x00cd, B:139:0x00e0, B:140:0x00e9, B:142:0x00ed, B:144:0x00f7, B:146:0x00ff, B:148:0x010e, B:150:0x0116, B:152:0x0120, B:154:0x015e), top: B:2:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01c5 A[Catch: Exception -> 0x006b, TryCatch #0 {Exception -> 0x006b, blocks: (B:14:0x0603, B:16:0x0613, B:17:0x061a, B:21:0x0689, B:25:0x0695, B:30:0x0668, B:32:0x0672, B:34:0x067a, B:40:0x05ea, B:46:0x005a, B:49:0x0269, B:51:0x026f, B:52:0x027b, B:54:0x0297, B:55:0x02b1, B:57:0x04f3, B:58:0x0513, B:60:0x0519, B:62:0x0525, B:63:0x052c, B:64:0x0534, B:66:0x0538, B:68:0x053e, B:69:0x0562, B:71:0x0568, B:72:0x0584, B:74:0x058a, B:75:0x05a6, B:94:0x007c, B:96:0x01ea, B:98:0x01f0, B:99:0x024b, B:103:0x0204, B:105:0x0208, B:107:0x0226, B:109:0x022a, B:112:0x0093, B:114:0x018c, B:117:0x01b9, B:119:0x01c5, B:125:0x00a4, B:127:0x017d, B:131:0x00bb, B:133:0x0167, B:137:0x00cd, B:139:0x00e0, B:140:0x00e9, B:142:0x00ed, B:144:0x00f7, B:146:0x00ff, B:148:0x010e, B:150:0x0116, B:152:0x0120, B:154:0x015e), top: B:2:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0613 A[Catch: Exception -> 0x006b, TryCatch #0 {Exception -> 0x006b, blocks: (B:14:0x0603, B:16:0x0613, B:17:0x061a, B:21:0x0689, B:25:0x0695, B:30:0x0668, B:32:0x0672, B:34:0x067a, B:40:0x05ea, B:46:0x005a, B:49:0x0269, B:51:0x026f, B:52:0x027b, B:54:0x0297, B:55:0x02b1, B:57:0x04f3, B:58:0x0513, B:60:0x0519, B:62:0x0525, B:63:0x052c, B:64:0x0534, B:66:0x0538, B:68:0x053e, B:69:0x0562, B:71:0x0568, B:72:0x0584, B:74:0x058a, B:75:0x05a6, B:94:0x007c, B:96:0x01ea, B:98:0x01f0, B:99:0x024b, B:103:0x0204, B:105:0x0208, B:107:0x0226, B:109:0x022a, B:112:0x0093, B:114:0x018c, B:117:0x01b9, B:119:0x01c5, B:125:0x00a4, B:127:0x017d, B:131:0x00bb, B:133:0x0167, B:137:0x00cd, B:139:0x00e0, B:140:0x00e9, B:142:0x00ed, B:144:0x00f7, B:146:0x00ff, B:148:0x010e, B:150:0x0116, B:152:0x0120, B:154:0x015e), top: B:2:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0665  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0689 A[Catch: Exception -> 0x006b, TryCatch #0 {Exception -> 0x006b, blocks: (B:14:0x0603, B:16:0x0613, B:17:0x061a, B:21:0x0689, B:25:0x0695, B:30:0x0668, B:32:0x0672, B:34:0x067a, B:40:0x05ea, B:46:0x005a, B:49:0x0269, B:51:0x026f, B:52:0x027b, B:54:0x0297, B:55:0x02b1, B:57:0x04f3, B:58:0x0513, B:60:0x0519, B:62:0x0525, B:63:0x052c, B:64:0x0534, B:66:0x0538, B:68:0x053e, B:69:0x0562, B:71:0x0568, B:72:0x0584, B:74:0x058a, B:75:0x05a6, B:94:0x007c, B:96:0x01ea, B:98:0x01f0, B:99:0x024b, B:103:0x0204, B:105:0x0208, B:107:0x0226, B:109:0x022a, B:112:0x0093, B:114:0x018c, B:117:0x01b9, B:119:0x01c5, B:125:0x00a4, B:127:0x017d, B:131:0x00bb, B:133:0x0167, B:137:0x00cd, B:139:0x00e0, B:140:0x00e9, B:142:0x00ed, B:144:0x00f7, B:146:0x00ff, B:148:0x010e, B:150:0x0116, B:152:0x0120, B:154:0x015e), top: B:2:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0668 A[Catch: Exception -> 0x006b, TryCatch #0 {Exception -> 0x006b, blocks: (B:14:0x0603, B:16:0x0613, B:17:0x061a, B:21:0x0689, B:25:0x0695, B:30:0x0668, B:32:0x0672, B:34:0x067a, B:40:0x05ea, B:46:0x005a, B:49:0x0269, B:51:0x026f, B:52:0x027b, B:54:0x0297, B:55:0x02b1, B:57:0x04f3, B:58:0x0513, B:60:0x0519, B:62:0x0525, B:63:0x052c, B:64:0x0534, B:66:0x0538, B:68:0x053e, B:69:0x0562, B:71:0x0568, B:72:0x0584, B:74:0x058a, B:75:0x05a6, B:94:0x007c, B:96:0x01ea, B:98:0x01f0, B:99:0x024b, B:103:0x0204, B:105:0x0208, B:107:0x0226, B:109:0x022a, B:112:0x0093, B:114:0x018c, B:117:0x01b9, B:119:0x01c5, B:125:0x00a4, B:127:0x017d, B:131:0x00bb, B:133:0x0167, B:137:0x00cd, B:139:0x00e0, B:140:0x00e9, B:142:0x00ed, B:144:0x00f7, B:146:0x00ff, B:148:0x010e, B:150:0x0116, B:152:0x0120, B:154:0x015e), top: B:2:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x026f A[Catch: Exception -> 0x006b, TryCatch #0 {Exception -> 0x006b, blocks: (B:14:0x0603, B:16:0x0613, B:17:0x061a, B:21:0x0689, B:25:0x0695, B:30:0x0668, B:32:0x0672, B:34:0x067a, B:40:0x05ea, B:46:0x005a, B:49:0x0269, B:51:0x026f, B:52:0x027b, B:54:0x0297, B:55:0x02b1, B:57:0x04f3, B:58:0x0513, B:60:0x0519, B:62:0x0525, B:63:0x052c, B:64:0x0534, B:66:0x0538, B:68:0x053e, B:69:0x0562, B:71:0x0568, B:72:0x0584, B:74:0x058a, B:75:0x05a6, B:94:0x007c, B:96:0x01ea, B:98:0x01f0, B:99:0x024b, B:103:0x0204, B:105:0x0208, B:107:0x0226, B:109:0x022a, B:112:0x0093, B:114:0x018c, B:117:0x01b9, B:119:0x01c5, B:125:0x00a4, B:127:0x017d, B:131:0x00bb, B:133:0x0167, B:137:0x00cd, B:139:0x00e0, B:140:0x00e9, B:142:0x00ed, B:144:0x00f7, B:146:0x00ff, B:148:0x010e, B:150:0x0116, B:152:0x0120, B:154:0x015e), top: B:2:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0297 A[Catch: Exception -> 0x006b, TryCatch #0 {Exception -> 0x006b, blocks: (B:14:0x0603, B:16:0x0613, B:17:0x061a, B:21:0x0689, B:25:0x0695, B:30:0x0668, B:32:0x0672, B:34:0x067a, B:40:0x05ea, B:46:0x005a, B:49:0x0269, B:51:0x026f, B:52:0x027b, B:54:0x0297, B:55:0x02b1, B:57:0x04f3, B:58:0x0513, B:60:0x0519, B:62:0x0525, B:63:0x052c, B:64:0x0534, B:66:0x0538, B:68:0x053e, B:69:0x0562, B:71:0x0568, B:72:0x0584, B:74:0x058a, B:75:0x05a6, B:94:0x007c, B:96:0x01ea, B:98:0x01f0, B:99:0x024b, B:103:0x0204, B:105:0x0208, B:107:0x0226, B:109:0x022a, B:112:0x0093, B:114:0x018c, B:117:0x01b9, B:119:0x01c5, B:125:0x00a4, B:127:0x017d, B:131:0x00bb, B:133:0x0167, B:137:0x00cd, B:139:0x00e0, B:140:0x00e9, B:142:0x00ed, B:144:0x00f7, B:146:0x00ff, B:148:0x010e, B:150:0x0116, B:152:0x0120, B:154:0x015e), top: B:2:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x04f3 A[Catch: Exception -> 0x006b, TryCatch #0 {Exception -> 0x006b, blocks: (B:14:0x0603, B:16:0x0613, B:17:0x061a, B:21:0x0689, B:25:0x0695, B:30:0x0668, B:32:0x0672, B:34:0x067a, B:40:0x05ea, B:46:0x005a, B:49:0x0269, B:51:0x026f, B:52:0x027b, B:54:0x0297, B:55:0x02b1, B:57:0x04f3, B:58:0x0513, B:60:0x0519, B:62:0x0525, B:63:0x052c, B:64:0x0534, B:66:0x0538, B:68:0x053e, B:69:0x0562, B:71:0x0568, B:72:0x0584, B:74:0x058a, B:75:0x05a6, B:94:0x007c, B:96:0x01ea, B:98:0x01f0, B:99:0x024b, B:103:0x0204, B:105:0x0208, B:107:0x0226, B:109:0x022a, B:112:0x0093, B:114:0x018c, B:117:0x01b9, B:119:0x01c5, B:125:0x00a4, B:127:0x017d, B:131:0x00bb, B:133:0x0167, B:137:0x00cd, B:139:0x00e0, B:140:0x00e9, B:142:0x00ed, B:144:0x00f7, B:146:0x00ff, B:148:0x010e, B:150:0x0116, B:152:0x0120, B:154:0x015e), top: B:2:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0519 A[Catch: Exception -> 0x006b, TryCatch #0 {Exception -> 0x006b, blocks: (B:14:0x0603, B:16:0x0613, B:17:0x061a, B:21:0x0689, B:25:0x0695, B:30:0x0668, B:32:0x0672, B:34:0x067a, B:40:0x05ea, B:46:0x005a, B:49:0x0269, B:51:0x026f, B:52:0x027b, B:54:0x0297, B:55:0x02b1, B:57:0x04f3, B:58:0x0513, B:60:0x0519, B:62:0x0525, B:63:0x052c, B:64:0x0534, B:66:0x0538, B:68:0x053e, B:69:0x0562, B:71:0x0568, B:72:0x0584, B:74:0x058a, B:75:0x05a6, B:94:0x007c, B:96:0x01ea, B:98:0x01f0, B:99:0x024b, B:103:0x0204, B:105:0x0208, B:107:0x0226, B:109:0x022a, B:112:0x0093, B:114:0x018c, B:117:0x01b9, B:119:0x01c5, B:125:0x00a4, B:127:0x017d, B:131:0x00bb, B:133:0x0167, B:137:0x00cd, B:139:0x00e0, B:140:0x00e9, B:142:0x00ed, B:144:0x00f7, B:146:0x00ff, B:148:0x010e, B:150:0x0116, B:152:0x0120, B:154:0x015e), top: B:2:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0568 A[Catch: Exception -> 0x006b, TryCatch #0 {Exception -> 0x006b, blocks: (B:14:0x0603, B:16:0x0613, B:17:0x061a, B:21:0x0689, B:25:0x0695, B:30:0x0668, B:32:0x0672, B:34:0x067a, B:40:0x05ea, B:46:0x005a, B:49:0x0269, B:51:0x026f, B:52:0x027b, B:54:0x0297, B:55:0x02b1, B:57:0x04f3, B:58:0x0513, B:60:0x0519, B:62:0x0525, B:63:0x052c, B:64:0x0534, B:66:0x0538, B:68:0x053e, B:69:0x0562, B:71:0x0568, B:72:0x0584, B:74:0x058a, B:75:0x05a6, B:94:0x007c, B:96:0x01ea, B:98:0x01f0, B:99:0x024b, B:103:0x0204, B:105:0x0208, B:107:0x0226, B:109:0x022a, B:112:0x0093, B:114:0x018c, B:117:0x01b9, B:119:0x01c5, B:125:0x00a4, B:127:0x017d, B:131:0x00bb, B:133:0x0167, B:137:0x00cd, B:139:0x00e0, B:140:0x00e9, B:142:0x00ed, B:144:0x00f7, B:146:0x00ff, B:148:0x010e, B:150:0x0116, B:152:0x0120, B:154:0x015e), top: B:2:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x058a A[Catch: Exception -> 0x006b, TryCatch #0 {Exception -> 0x006b, blocks: (B:14:0x0603, B:16:0x0613, B:17:0x061a, B:21:0x0689, B:25:0x0695, B:30:0x0668, B:32:0x0672, B:34:0x067a, B:40:0x05ea, B:46:0x005a, B:49:0x0269, B:51:0x026f, B:52:0x027b, B:54:0x0297, B:55:0x02b1, B:57:0x04f3, B:58:0x0513, B:60:0x0519, B:62:0x0525, B:63:0x052c, B:64:0x0534, B:66:0x0538, B:68:0x053e, B:69:0x0562, B:71:0x0568, B:72:0x0584, B:74:0x058a, B:75:0x05a6, B:94:0x007c, B:96:0x01ea, B:98:0x01f0, B:99:0x024b, B:103:0x0204, B:105:0x0208, B:107:0x0226, B:109:0x022a, B:112:0x0093, B:114:0x018c, B:117:0x01b9, B:119:0x01c5, B:125:0x00a4, B:127:0x017d, B:131:0x00bb, B:133:0x0167, B:137:0x00cd, B:139:0x00e0, B:140:0x00e9, B:142:0x00ed, B:144:0x00f7, B:146:0x00ff, B:148:0x010e, B:150:0x0116, B:152:0x0120, B:154:0x015e), top: B:2:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x05c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01f0 A[Catch: Exception -> 0x006b, TryCatch #0 {Exception -> 0x006b, blocks: (B:14:0x0603, B:16:0x0613, B:17:0x061a, B:21:0x0689, B:25:0x0695, B:30:0x0668, B:32:0x0672, B:34:0x067a, B:40:0x05ea, B:46:0x005a, B:49:0x0269, B:51:0x026f, B:52:0x027b, B:54:0x0297, B:55:0x02b1, B:57:0x04f3, B:58:0x0513, B:60:0x0519, B:62:0x0525, B:63:0x052c, B:64:0x0534, B:66:0x0538, B:68:0x053e, B:69:0x0562, B:71:0x0568, B:72:0x0584, B:74:0x058a, B:75:0x05a6, B:94:0x007c, B:96:0x01ea, B:98:0x01f0, B:99:0x024b, B:103:0x0204, B:105:0x0208, B:107:0x0226, B:109:0x022a, B:112:0x0093, B:114:0x018c, B:117:0x01b9, B:119:0x01c5, B:125:0x00a4, B:127:0x017d, B:131:0x00bb, B:133:0x0167, B:137:0x00cd, B:139:0x00e0, B:140:0x00e9, B:142:0x00ed, B:144:0x00f7, B:146:0x00ff, B:148:0x010e, B:150:0x0116, B:152:0x0120, B:154:0x015e), top: B:2:0x0020 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        Z z10;
        String str2;
        String str3;
        Ph.P p10;
        v0 v0Var;
        WeakReference weakReference;
        Context context;
        Configuration configuration;
        Z z11;
        Object access$collectFingerprint;
        String encodeToString;
        C6957c c6957c;
        String str4;
        C6957c c6957c2;
        Ph.P p11;
        C6957c c6957c3;
        Object b10;
        String str5;
        String str6;
        Ph.P p12;
        String str7;
        v0 v0Var2;
        Object a10;
        String str8;
        Ph.P p13;
        AbstractC6956b abstractC6956b;
        String str9;
        String str10;
        int b11;
        long a11;
        C2447i0 a12;
        String str11;
        y0 y0Var;
        Q0 q02;
        N g10;
        C2460p c2460p;
        Map a13;
        Z z12;
        String str12;
        Z z13;
        Object a14;
        F0 f10;
        C2461p0 c2461p0;
        Ph.P p14;
        String str13;
        v0 v0Var3;
        String str14;
        String str15;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        try {
        } catch (Exception e10) {
            Logger.f41582a.b("GuardianSDK", "Collect failed", e10);
            S0.b("collect", e10);
            GuardianSDK.access$handleCollectFailure(this.f26644s, new D0(e10), this.f26647v);
        }
        switch (this.f26642q) {
            case 0:
                ResultKt.throwOnFailure(obj);
                Ph.P p15 = (Ph.P) this.f26643r;
                str = "unavailable";
                Logger.f41582a.d("GuardianSDK", "Starting collect");
                z10 = this.f26644s.f41542h;
                if (z10.f26512b) {
                    z11 = this.f26644s.f41542h;
                    z11.b();
                }
                if (this.f26645t) {
                    v0Var = this.f26644s.f41540f;
                    K0 k02 = v0Var.f26707k;
                    if (k02 == null || (AbstractC5338c.checkSelfPermission(k02.f26453a, "android.permission.ACCESS_FINE_LOCATION") != 0 && AbstractC5338c.checkSelfPermission(k02.f26453a, "android.permission.ACCESS_COARSE_LOCATION") != 0)) {
                        weakReference = this.f26644s.f41538d;
                        Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
                        if (activity != null) {
                            str2 = "failed";
                            context = this.f26644s.f41535a;
                            str3 = "collected";
                            configuration = this.f26644s.f41536b;
                            U u10 = new U(context, configuration);
                            this.f26643r = p15;
                            this.f26639n = activity;
                            this.f26640o = u10;
                            this.f26642q = 1;
                            C1469p c1469p = new C1469p(IntrinsicsKt.intercepted(this), 1);
                            c1469p.F();
                            u10.a(activity, new C2442g(c1469p));
                            Object z14 = c1469p.z();
                            if (z14 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                DebugProbesKt.probeCoroutineSuspended(this);
                            }
                            if (z14 == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            p10 = p15;
                            this.f26643r = p10;
                            this.f26639n = null;
                            this.f26640o = null;
                            this.f26642q = 2;
                            if (AbstractC1440a0.a(500L, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            GuardianSDK guardianSDK = this.f26644s;
                            this.f26643r = p10;
                            this.f26642q = 3;
                            access$collectFingerprint = GuardianSDK.access$collectFingerprint(guardianSDK, this);
                            if (access$collectFingerprint == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            String uuid = UUID.randomUUID().toString();
                            Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
                            byte[] bytes = uuid.getBytes(Charsets.UTF_8);
                            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                            encodeToString = Base64.encodeToString(bytes, 10);
                            c6957c = this.f26644s.f41541g;
                            str4 = c6957c.e() ? str2 : "not_supported";
                            c6957c2 = this.f26644s.f41541g;
                            if (c6957c2.e()) {
                                c6957c3 = this.f26644s.f41541g;
                                Intrinsics.checkNotNull(encodeToString);
                                Long boxLong = Boxing.boxLong(817986950837L);
                                this.f26643r = p10;
                                this.f26639n = encodeToString;
                                this.f26640o = str4;
                                p11 = p10;
                                this.f26642q = 4;
                                b10 = c6957c3.b(encodeToString, boxLong, this);
                                if (b10 == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                abstractC6956b = (AbstractC6956b) b10;
                                if (!(abstractC6956b instanceof AbstractC6956b.C0983b)) {
                                    String b12 = ((AbstractC6956b.C0983b) abstractC6956b).b();
                                    Logger.f41582a.d("GuardianSDK", "Attestation successful during collect");
                                    str7 = b12;
                                    str6 = encodeToString;
                                    str5 = str3;
                                    p12 = p11;
                                    v0Var2 = this.f26644s.f41540f;
                                    this.f26643r = p12;
                                    this.f26639n = str6;
                                    this.f26640o = str7;
                                    this.f26641p = str5;
                                    this.f26642q = 5;
                                    a10 = v0Var2.a();
                                    if (a10 == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    str8 = str6;
                                    p13 = p12;
                                    String str16 = str7;
                                    y0 y0Var2 = (y0) a10;
                                    str9 = this.f26646u;
                                    if (str9 == null) {
                                        c2461p0 = this.f26644s.f41547m;
                                        str10 = c2461p0.a(str9);
                                    } else {
                                        str10 = null;
                                    }
                                    String d10 = y0Var2.d();
                                    b11 = this.f26644s.b();
                                    String access$calculateRiskLevel = GuardianSDK.access$calculateRiskLevel(this.f26644s, y0Var2);
                                    a11 = this.f26644s.a();
                                    long currentTimeMillis = System.currentTimeMillis();
                                    N0 n02 = str16 == null ? new N0("google_play_integrity", str16, null, str8, Boxing.boxLong(System.currentTimeMillis()), "PRODUCTION", null) : null;
                                    String h10 = y0Var2.c().h();
                                    String i10 = y0Var2.c().i();
                                    String b13 = y0Var2.c().b();
                                    String j10 = y0Var2.c().j();
                                    Integer boxInt = Boxing.boxInt(y0Var2.c().n());
                                    Integer boxInt2 = Boxing.boxInt(y0Var2.c().m());
                                    Integer boxInt3 = Boxing.boxInt(y0Var2.c().k());
                                    StringBuilder sb2 = new StringBuilder();
                                    String str17 = str10;
                                    sb2.append(y0Var2.c().m());
                                    sb2.append('x');
                                    sb2.append(y0Var2.c().k());
                                    C2436d c2436d = new C2436d(h10, i10, b13, j10, boxInt, boxInt2, boxInt3, sb2.toString(), Boxing.boxFloat(y0Var2.c().d()), y0Var2.c().l(), Boxing.boxLong(y0Var2.c().p()), Boxing.boxLong(y0Var2.c().q()), y0Var2.c().a(), y0Var2.c().o(), Boxing.boxBoolean(y0Var2.c().g()), Boxing.boxBoolean(y0Var2.c().f()), y0Var2.c().c(), y0Var2.c().e(), y0Var2.c().r());
                                    C2444h c2444h = new C2444h(Boxing.boxBoolean(y0Var2.e().j()), Boxing.boxDouble(y0Var2.e().g()), y0Var2.e().h(), Boxing.boxBoolean(y0Var2.e().i()), y0Var2.e().a(), y0Var2.e().d(), y0Var2.e().e(), y0Var2.e().f(), y0Var2.e().c(), y0Var2.e().b());
                                    C2467t c2467t = new C2467t(Boxing.boxBoolean(y0Var2.h().n()), Boxing.boxDouble(y0Var2.h().b()), Boxing.boxBoolean(y0Var2.h().p()), Boxing.boxBoolean(y0Var2.h().m()), Boxing.boxBoolean(y0Var2.h().k()), Boxing.boxBoolean(y0Var2.h().o()), Boxing.boxBoolean(y0Var2.h().a()), Boxing.boxBoolean(y0Var2.h().c()), Boxing.boxBoolean(y0Var2.h().j()), Boxing.boxBoolean(y0Var2.h().g()), Boxing.boxBoolean(y0Var2.h().d()), Boxing.boxBoolean(y0Var2.h().l()), Boxing.boxBoolean(y0Var2.h().e()), y0Var2.h().h(), Boxing.boxBoolean(y0Var2.h().f()), y0Var2.h().i());
                                    C2429B c2429b = new C2429B(y0Var2.j().c(), y0Var2.j().d(), y0Var2.j().g(), y0Var2.j().e(), y0Var2.j().a(), y0Var2.j().b(), y0Var2.j().f());
                                    String k10 = y0Var2.k();
                                    a12 = y0Var2.a();
                                    if (a12 == null) {
                                        str11 = d10;
                                        y0Var = y0Var2;
                                        q02 = new Q0(a12.a(), a12.c(), a12.b());
                                    } else {
                                        str11 = d10;
                                        y0Var = y0Var2;
                                        q02 = null;
                                    }
                                    g10 = y0Var.g();
                                    if (g10 == null) {
                                        c2460p = new C2460p(g10.c(), g10.a(), str17 == null ? g10.b() : str17);
                                    } else {
                                        c2460p = null;
                                    }
                                    C2452l c2452l = (this.f26645t || (f10 = y0Var.f()) == null) ? null : new C2452l(f10.c(), f10.d(), f10.a(), f10.g(), f10.b(), f10.f(), f10.e());
                                    C2437d0 l10 = y0Var.l();
                                    F f11 = l10 == null ? new F(l10.e(), l10.a(), l10.c(), l10.d(), l10.b()) : null;
                                    C2464r0 i11 = y0Var.i();
                                    a13 = new J(str11, b11, access$calculateRiskLevel, a11, currentTimeMillis, n02, c2436d, c2444h, c2467t, c2429b, k10, q02, c2460p, c2452l, f11, i11 == null ? new C2471x(i11.b(), i11.a(), i11.d(), i11.c(), i11.e()) : null, Boxing.boxDouble(y0Var.b())).a();
                                    z12 = this.f26644s.f41542h;
                                    if (z12.f26512b) {
                                        try {
                                            z13 = this.f26644s.f41542h;
                                            this.f26643r = p13;
                                            this.f26639n = str5;
                                            this.f26640o = a13;
                                            this.f26641p = null;
                                            this.f26642q = 6;
                                            a14 = z13.a(this);
                                        } catch (Exception e11) {
                                            e = e11;
                                            str12 = str5;
                                            Logger.f41582a.f("GuardianSDK", "Failed to get Verisoul session ID: " + e.getMessage());
                                            str5 = str12;
                                            p14 = p13;
                                            str13 = null;
                                            Map mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to("device_data", a13));
                                            if (str13 != null) {
                                            }
                                            Intrinsics.checkNotNull(mutableMapOf, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
                                            String jSONObject = new JSONObject(mutableMapOf).toString();
                                            Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
                                            byte[] bytes2 = jSONObject.getBytes(Charsets.UTF_8);
                                            Intrinsics.checkNotNullExpressionValue(bytes2, "this as java.lang.String).getBytes(charset)");
                                            String a15 = new C2462q(C2454m.f26625a.a().a()).a(bytes2);
                                            Logger.f41582a.d("GuardianSDK", "Collect complete, payload size: " + a15.length() + " chars");
                                            if (this.f26645t) {
                                            }
                                            if (str13 != null) {
                                            }
                                            str15 = str;
                                            AbstractC1459k.d(p14, C1452g0.c(), null, new C2450k(this.f26647v, new CollectResult(a15, GuardianSDK.access$buildDeviceDiagnostics(this.f26644s, str14, str5, str15)), null), 2, null);
                                            return Unit.INSTANCE;
                                        }
                                        if (a14 != coroutine_suspended) {
                                            str12 = str5;
                                            try {
                                                str13 = (String) a14;
                                                str5 = str12;
                                                p14 = p13;
                                            } catch (Exception e12) {
                                                e = e12;
                                                Logger.f41582a.f("GuardianSDK", "Failed to get Verisoul session ID: " + e.getMessage());
                                                str5 = str12;
                                                p14 = p13;
                                                str13 = null;
                                                Map mutableMapOf2 = MapsKt.mutableMapOf(TuplesKt.to("device_data", a13));
                                                if (str13 != null) {
                                                }
                                                Intrinsics.checkNotNull(mutableMapOf2, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
                                                String jSONObject2 = new JSONObject(mutableMapOf2).toString();
                                                Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
                                                byte[] bytes22 = jSONObject2.getBytes(Charsets.UTF_8);
                                                Intrinsics.checkNotNullExpressionValue(bytes22, "this as java.lang.String).getBytes(charset)");
                                                String a152 = new C2462q(C2454m.f26625a.a().a()).a(bytes22);
                                                Logger.f41582a.d("GuardianSDK", "Collect complete, payload size: " + a152.length() + " chars");
                                                if (this.f26645t) {
                                                }
                                                if (str13 != null) {
                                                }
                                                str15 = str;
                                                AbstractC1459k.d(p14, C1452g0.c(), null, new C2450k(this.f26647v, new CollectResult(a152, GuardianSDK.access$buildDeviceDiagnostics(this.f26644s, str14, str5, str15)), null), 2, null);
                                                return Unit.INSTANCE;
                                            }
                                            Map mutableMapOf22 = MapsKt.mutableMapOf(TuplesKt.to("device_data", a13));
                                            if (str13 != null) {
                                                mutableMapOf22.put("verisoul_session_id", str13);
                                                Unit unit = Unit.INSTANCE;
                                            }
                                            Intrinsics.checkNotNull(mutableMapOf22, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
                                            String jSONObject22 = new JSONObject(mutableMapOf22).toString();
                                            Intrinsics.checkNotNullExpressionValue(jSONObject22, "toString(...)");
                                            byte[] bytes222 = jSONObject22.getBytes(Charsets.UTF_8);
                                            Intrinsics.checkNotNullExpressionValue(bytes222, "this as java.lang.String).getBytes(charset)");
                                            String a1522 = new C2462q(C2454m.f26625a.a().a()).a(bytes222);
                                            Logger.f41582a.d("GuardianSDK", "Collect complete, payload size: " + a1522.length() + " chars");
                                            if (this.f26645t) {
                                                v0Var3 = this.f26644s.f41540f;
                                                K0 k03 = v0Var3.f26707k;
                                                str14 = (k03 == null || !(AbstractC5338c.checkSelfPermission(k03.f26453a, "android.permission.ACCESS_FINE_LOCATION") == 0 || AbstractC5338c.checkSelfPermission(k03.f26453a, "android.permission.ACCESS_COARSE_LOCATION") == 0)) ? "denied" : str3;
                                            } else {
                                                str14 = "not_requested";
                                            }
                                            if (str13 != null && !StringsKt.isBlank(str13)) {
                                                str15 = str3;
                                                AbstractC1459k.d(p14, C1452g0.c(), null, new C2450k(this.f26647v, new CollectResult(a1522, GuardianSDK.access$buildDeviceDiagnostics(this.f26644s, str14, str5, str15)), null), 2, null);
                                                return Unit.INSTANCE;
                                            }
                                            str15 = str;
                                            AbstractC1459k.d(p14, C1452g0.c(), null, new C2450k(this.f26647v, new CollectResult(a1522, GuardianSDK.access$buildDeviceDiagnostics(this.f26644s, str14, str5, str15)), null), 2, null);
                                            return Unit.INSTANCE;
                                        }
                                        return coroutine_suspended;
                                    }
                                    p14 = p13;
                                    str13 = null;
                                    Map mutableMapOf222 = MapsKt.mutableMapOf(TuplesKt.to("device_data", a13));
                                    if (str13 != null) {
                                    }
                                    Intrinsics.checkNotNull(mutableMapOf222, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
                                    String jSONObject222 = new JSONObject(mutableMapOf222).toString();
                                    Intrinsics.checkNotNullExpressionValue(jSONObject222, "toString(...)");
                                    byte[] bytes2222 = jSONObject222.getBytes(Charsets.UTF_8);
                                    Intrinsics.checkNotNullExpressionValue(bytes2222, "this as java.lang.String).getBytes(charset)");
                                    String a15222 = new C2462q(C2454m.f26625a.a().a()).a(bytes2222);
                                    Logger.f41582a.d("GuardianSDK", "Collect complete, payload size: " + a15222.length() + " chars");
                                    if (this.f26645t) {
                                    }
                                    if (str13 != null) {
                                        str15 = str3;
                                        AbstractC1459k.d(p14, C1452g0.c(), null, new C2450k(this.f26647v, new CollectResult(a15222, GuardianSDK.access$buildDeviceDiagnostics(this.f26644s, str14, str5, str15)), null), 2, null);
                                        return Unit.INSTANCE;
                                    }
                                    str15 = str;
                                    AbstractC1459k.d(p14, C1452g0.c(), null, new C2450k(this.f26647v, new CollectResult(a15222, GuardianSDK.access$buildDeviceDiagnostics(this.f26644s, str14, str5, str15)), null), 2, null);
                                    return Unit.INSTANCE;
                                }
                                if (abstractC6956b instanceof AbstractC6956b.a) {
                                    Logger.f41582a.f("GuardianSDK", "Attestation failed during collect: " + ((AbstractC6956b.a) abstractC6956b).a());
                                    str6 = encodeToString;
                                    str5 = str2;
                                } else {
                                    if (abstractC6956b instanceof AbstractC6956b.c) {
                                        Logger.f41582a.f("GuardianSDK", "Attestation unavailable during collect: " + ((AbstractC6956b.c) abstractC6956b).a());
                                        str6 = encodeToString;
                                        str5 = str;
                                    }
                                    str5 = str4;
                                    str6 = encodeToString;
                                }
                                p12 = p11;
                                str7 = null;
                                v0Var2 = this.f26644s.f41540f;
                                this.f26643r = p12;
                                this.f26639n = str6;
                                this.f26640o = str7;
                                this.f26641p = str5;
                                this.f26642q = 5;
                                a10 = v0Var2.a();
                                if (a10 == coroutine_suspended) {
                                }
                            } else {
                                p11 = p10;
                                str5 = str4;
                                str6 = encodeToString;
                                p12 = p11;
                                str7 = null;
                                v0Var2 = this.f26644s.f41540f;
                                this.f26643r = p12;
                                this.f26639n = str6;
                                this.f26640o = str7;
                                this.f26641p = str5;
                                this.f26642q = 5;
                                a10 = v0Var2.a();
                                if (a10 == coroutine_suspended) {
                                }
                            }
                        }
                    }
                }
                str2 = "failed";
                str3 = "collected";
                p10 = p15;
                GuardianSDK guardianSDK2 = this.f26644s;
                this.f26643r = p10;
                this.f26642q = 3;
                access$collectFingerprint = GuardianSDK.access$collectFingerprint(guardianSDK2, this);
                if (access$collectFingerprint == coroutine_suspended) {
                }
                String uuid2 = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(uuid2, "toString(...)");
                byte[] bytes3 = uuid2.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes3, "this as java.lang.String).getBytes(charset)");
                encodeToString = Base64.encodeToString(bytes3, 10);
                c6957c = this.f26644s.f41541g;
                if (c6957c.e()) {
                }
                c6957c2 = this.f26644s.f41541g;
                if (c6957c2.e()) {
                }
                break;
            case 1:
                p10 = (Ph.P) this.f26643r;
                ResultKt.throwOnFailure(obj);
                str = "unavailable";
                str2 = "failed";
                str3 = "collected";
                this.f26643r = p10;
                this.f26639n = null;
                this.f26640o = null;
                this.f26642q = 2;
                if (AbstractC1440a0.a(500L, this) == coroutine_suspended) {
                }
                GuardianSDK guardianSDK22 = this.f26644s;
                this.f26643r = p10;
                this.f26642q = 3;
                access$collectFingerprint = GuardianSDK.access$collectFingerprint(guardianSDK22, this);
                if (access$collectFingerprint == coroutine_suspended) {
                }
                String uuid22 = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(uuid22, "toString(...)");
                byte[] bytes32 = uuid22.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes32, "this as java.lang.String).getBytes(charset)");
                encodeToString = Base64.encodeToString(bytes32, 10);
                c6957c = this.f26644s.f41541g;
                if (c6957c.e()) {
                }
                c6957c2 = this.f26644s.f41541g;
                if (c6957c2.e()) {
                }
                break;
            case 2:
                p10 = (Ph.P) this.f26643r;
                ResultKt.throwOnFailure(obj);
                str = "unavailable";
                str2 = "failed";
                str3 = "collected";
                GuardianSDK guardianSDK222 = this.f26644s;
                this.f26643r = p10;
                this.f26642q = 3;
                access$collectFingerprint = GuardianSDK.access$collectFingerprint(guardianSDK222, this);
                if (access$collectFingerprint == coroutine_suspended) {
                }
                String uuid222 = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(uuid222, "toString(...)");
                byte[] bytes322 = uuid222.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes322, "this as java.lang.String).getBytes(charset)");
                encodeToString = Base64.encodeToString(bytes322, 10);
                c6957c = this.f26644s.f41541g;
                if (c6957c.e()) {
                }
                c6957c2 = this.f26644s.f41541g;
                if (c6957c2.e()) {
                }
                break;
            case 3:
                p10 = (Ph.P) this.f26643r;
                ResultKt.throwOnFailure(obj);
                str = "unavailable";
                str2 = "failed";
                str3 = "collected";
                access$collectFingerprint = obj;
                String uuid2222 = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(uuid2222, "toString(...)");
                byte[] bytes3222 = uuid2222.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes3222, "this as java.lang.String).getBytes(charset)");
                encodeToString = Base64.encodeToString(bytes3222, 10);
                c6957c = this.f26644s.f41541g;
                if (c6957c.e()) {
                }
                c6957c2 = this.f26644s.f41541g;
                if (c6957c2.e()) {
                }
                break;
            case 4:
                String str18 = (String) this.f26640o;
                encodeToString = (String) this.f26639n;
                Ph.P p16 = (Ph.P) this.f26643r;
                ResultKt.throwOnFailure(obj);
                str = "unavailable";
                str4 = str18;
                p11 = p16;
                str2 = "failed";
                str3 = "collected";
                b10 = obj;
                abstractC6956b = (AbstractC6956b) b10;
                if (!(abstractC6956b instanceof AbstractC6956b.C0983b)) {
                }
                break;
            case 5:
                String str19 = this.f26641p;
                str7 = (String) this.f26640o;
                String str20 = (String) this.f26639n;
                Ph.P p17 = (Ph.P) this.f26643r;
                ResultKt.throwOnFailure(obj);
                str8 = str20;
                str = "unavailable";
                p13 = p17;
                str3 = "collected";
                a10 = obj;
                str5 = str19;
                String str162 = str7;
                y0 y0Var22 = (y0) a10;
                str9 = this.f26646u;
                if (str9 == null) {
                }
                String d102 = y0Var22.d();
                b11 = this.f26644s.b();
                String access$calculateRiskLevel2 = GuardianSDK.access$calculateRiskLevel(this.f26644s, y0Var22);
                a11 = this.f26644s.a();
                long currentTimeMillis2 = System.currentTimeMillis();
                if (str162 == null) {
                }
                String h102 = y0Var22.c().h();
                String i102 = y0Var22.c().i();
                String b132 = y0Var22.c().b();
                String j102 = y0Var22.c().j();
                Integer boxInt4 = Boxing.boxInt(y0Var22.c().n());
                Integer boxInt22 = Boxing.boxInt(y0Var22.c().m());
                Integer boxInt32 = Boxing.boxInt(y0Var22.c().k());
                StringBuilder sb22 = new StringBuilder();
                String str172 = str10;
                sb22.append(y0Var22.c().m());
                sb22.append('x');
                sb22.append(y0Var22.c().k());
                C2436d c2436d2 = new C2436d(h102, i102, b132, j102, boxInt4, boxInt22, boxInt32, sb22.toString(), Boxing.boxFloat(y0Var22.c().d()), y0Var22.c().l(), Boxing.boxLong(y0Var22.c().p()), Boxing.boxLong(y0Var22.c().q()), y0Var22.c().a(), y0Var22.c().o(), Boxing.boxBoolean(y0Var22.c().g()), Boxing.boxBoolean(y0Var22.c().f()), y0Var22.c().c(), y0Var22.c().e(), y0Var22.c().r());
                C2444h c2444h2 = new C2444h(Boxing.boxBoolean(y0Var22.e().j()), Boxing.boxDouble(y0Var22.e().g()), y0Var22.e().h(), Boxing.boxBoolean(y0Var22.e().i()), y0Var22.e().a(), y0Var22.e().d(), y0Var22.e().e(), y0Var22.e().f(), y0Var22.e().c(), y0Var22.e().b());
                C2467t c2467t2 = new C2467t(Boxing.boxBoolean(y0Var22.h().n()), Boxing.boxDouble(y0Var22.h().b()), Boxing.boxBoolean(y0Var22.h().p()), Boxing.boxBoolean(y0Var22.h().m()), Boxing.boxBoolean(y0Var22.h().k()), Boxing.boxBoolean(y0Var22.h().o()), Boxing.boxBoolean(y0Var22.h().a()), Boxing.boxBoolean(y0Var22.h().c()), Boxing.boxBoolean(y0Var22.h().j()), Boxing.boxBoolean(y0Var22.h().g()), Boxing.boxBoolean(y0Var22.h().d()), Boxing.boxBoolean(y0Var22.h().l()), Boxing.boxBoolean(y0Var22.h().e()), y0Var22.h().h(), Boxing.boxBoolean(y0Var22.h().f()), y0Var22.h().i());
                C2429B c2429b2 = new C2429B(y0Var22.j().c(), y0Var22.j().d(), y0Var22.j().g(), y0Var22.j().e(), y0Var22.j().a(), y0Var22.j().b(), y0Var22.j().f());
                String k102 = y0Var22.k();
                a12 = y0Var22.a();
                if (a12 == null) {
                }
                g10 = y0Var.g();
                if (g10 == null) {
                }
                if (this.f26645t) {
                    break;
                }
                C2437d0 l102 = y0Var.l();
                if (l102 == null) {
                }
                C2464r0 i112 = y0Var.i();
                a13 = new J(str11, b11, access$calculateRiskLevel2, a11, currentTimeMillis2, n02, c2436d2, c2444h2, c2467t2, c2429b2, k102, q02, c2460p, c2452l, f11, i112 == null ? new C2471x(i112.b(), i112.a(), i112.d(), i112.c(), i112.e()) : null, Boxing.boxDouble(y0Var.b())).a();
                z12 = this.f26644s.f41542h;
                if (z12.f26512b) {
                }
                p14 = p13;
                str13 = null;
                Map mutableMapOf2222 = MapsKt.mutableMapOf(TuplesKt.to("device_data", a13));
                if (str13 != null) {
                }
                Intrinsics.checkNotNull(mutableMapOf2222, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
                String jSONObject2222 = new JSONObject(mutableMapOf2222).toString();
                Intrinsics.checkNotNullExpressionValue(jSONObject2222, "toString(...)");
                byte[] bytes22222 = jSONObject2222.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes22222, "this as java.lang.String).getBytes(charset)");
                String a152222 = new C2462q(C2454m.f26625a.a().a()).a(bytes22222);
                Logger.f41582a.d("GuardianSDK", "Collect complete, payload size: " + a152222.length() + " chars");
                if (this.f26645t) {
                }
                if (str13 != null) {
                }
                str15 = str;
                AbstractC1459k.d(p14, C1452g0.c(), null, new C2450k(this.f26647v, new CollectResult(a152222, GuardianSDK.access$buildDeviceDiagnostics(this.f26644s, str14, str5, str15)), null), 2, null);
                return Unit.INSTANCE;
            case 6:
                a13 = (Map) this.f26640o;
                str12 = (String) this.f26639n;
                p13 = (Ph.P) this.f26643r;
                try {
                    ResultKt.throwOnFailure(obj);
                    a14 = obj;
                    str = "unavailable";
                    str3 = "collected";
                    str13 = (String) a14;
                    str5 = str12;
                    p14 = p13;
                } catch (Exception e13) {
                    e = e13;
                    str = "unavailable";
                    str3 = "collected";
                    Logger.f41582a.f("GuardianSDK", "Failed to get Verisoul session ID: " + e.getMessage());
                    str5 = str12;
                    p14 = p13;
                    str13 = null;
                    Map mutableMapOf22222 = MapsKt.mutableMapOf(TuplesKt.to("device_data", a13));
                    if (str13 != null) {
                    }
                    Intrinsics.checkNotNull(mutableMapOf22222, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
                    String jSONObject22222 = new JSONObject(mutableMapOf22222).toString();
                    Intrinsics.checkNotNullExpressionValue(jSONObject22222, "toString(...)");
                    byte[] bytes222222 = jSONObject22222.getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes222222, "this as java.lang.String).getBytes(charset)");
                    String a1522222 = new C2462q(C2454m.f26625a.a().a()).a(bytes222222);
                    Logger.f41582a.d("GuardianSDK", "Collect complete, payload size: " + a1522222.length() + " chars");
                    if (this.f26645t) {
                    }
                    if (str13 != null) {
                    }
                    str15 = str;
                    AbstractC1459k.d(p14, C1452g0.c(), null, new C2450k(this.f26647v, new CollectResult(a1522222, GuardianSDK.access$buildDeviceDiagnostics(this.f26644s, str14, str5, str15)), null), 2, null);
                    return Unit.INSTANCE;
                }
                Map mutableMapOf222222 = MapsKt.mutableMapOf(TuplesKt.to("device_data", a13));
                if (str13 != null) {
                }
                Intrinsics.checkNotNull(mutableMapOf222222, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
                String jSONObject222222 = new JSONObject(mutableMapOf222222).toString();
                Intrinsics.checkNotNullExpressionValue(jSONObject222222, "toString(...)");
                byte[] bytes2222222 = jSONObject222222.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes2222222, "this as java.lang.String).getBytes(charset)");
                String a15222222 = new C2462q(C2454m.f26625a.a().a()).a(bytes2222222);
                Logger.f41582a.d("GuardianSDK", "Collect complete, payload size: " + a15222222.length() + " chars");
                if (this.f26645t) {
                }
                if (str13 != null) {
                }
                str15 = str;
                AbstractC1459k.d(p14, C1452g0.c(), null, new C2450k(this.f26647v, new CollectResult(a15222222, GuardianSDK.access$buildDeviceDiagnostics(this.f26644s, str14, str5, str15)), null), 2, null);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
