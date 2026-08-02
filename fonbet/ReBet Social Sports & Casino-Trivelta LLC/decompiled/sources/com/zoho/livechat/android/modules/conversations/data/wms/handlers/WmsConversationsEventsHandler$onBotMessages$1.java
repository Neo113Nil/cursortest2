package com.zoho.livechat.android.modules.conversations.data.wms.handlers;

import Ph.AbstractC1440a0;
import Ph.P;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.zoho.livechat.android.models.SalesIQChat;
import com.zoho.livechat.android.modules.conversations.data.local.ConversationsLocalDataSource;
import com.zoho.livechat.android.modules.conversations.data.local.entities.WaitingChatDetails;
import com.zoho.livechat.android.modules.messages.data.local.entities.MessageEntity;
import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import com.zoho.livechat.android.utils.LiveChatUtil;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import me.C5582a;
import ne.j;
import og.AbstractC5895g;
import og.i;
import org.json.JSONObject;
import qf.C6152a;
import rd.C6218a;
import td.C6461a;
import vf.c;

/* loaded from: classes4.dex */
public final class WmsConversationsEventsHandler$onBotMessages$1 extends SuspendLambda implements Function2 {

    /* renamed from: A, reason: collision with root package name */
    public boolean f42989A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f42990B;

    /* renamed from: C, reason: collision with root package name */
    public int f42991C;

    /* renamed from: D, reason: collision with root package name */
    public int f42992D;

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ List f42993E;

    /* renamed from: F, reason: collision with root package name */
    public final /* synthetic */ boolean f42994F;

    /* renamed from: G, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f42995G;

    /* renamed from: H, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f42996H;

    /* renamed from: I, reason: collision with root package name */
    public final /* synthetic */ String f42997I;

    /* renamed from: J, reason: collision with root package name */
    public final /* synthetic */ WmsConversationsEventsHandler f42998J;

    /* renamed from: K, reason: collision with root package name */
    public final /* synthetic */ Ref.IntRef f42999K;

    /* renamed from: L, reason: collision with root package name */
    public final /* synthetic */ boolean f43000L;

    /* renamed from: O, reason: collision with root package name */
    public final /* synthetic */ Rf.a f43001O;

    /* renamed from: n, reason: collision with root package name */
    public Object f43002n;

    /* renamed from: o, reason: collision with root package name */
    public Object f43003o;

    /* renamed from: p, reason: collision with root package name */
    public Object f43004p;

    /* renamed from: q, reason: collision with root package name */
    public Object f43005q;

    /* renamed from: r, reason: collision with root package name */
    public Object f43006r;

    /* renamed from: s, reason: collision with root package name */
    public Object f43007s;

    /* renamed from: t, reason: collision with root package name */
    public Object f43008t;

    /* renamed from: u, reason: collision with root package name */
    public Object f43009u;

    /* renamed from: v, reason: collision with root package name */
    public Object f43010v;

    /* renamed from: w, reason: collision with root package name */
    public Object f43011w;

    /* renamed from: x, reason: collision with root package name */
    public Object f43012x;

    /* renamed from: y, reason: collision with root package name */
    public Object f43013y;

    /* renamed from: z, reason: collision with root package name */
    public Object f43014z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WmsConversationsEventsHandler$onBotMessages$1(List list, boolean z10, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, String str, WmsConversationsEventsHandler wmsConversationsEventsHandler, Ref.IntRef intRef, boolean z11, Rf.a aVar, Continuation continuation) {
        super(2, continuation);
        this.f42993E = list;
        this.f42994F = z10;
        this.f42995G = objectRef;
        this.f42996H = objectRef2;
        this.f42997I = str;
        this.f42998J = wmsConversationsEventsHandler;
        this.f42999K = intRef;
        this.f43000L = z11;
        this.f43001O = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WmsConversationsEventsHandler$onBotMessages$1(this.f42993E, this.f42994F, this.f42995G, this.f42996H, this.f42997I, this.f42998J, this.f42999K, this.f43000L, this.f43001O, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(P p10, Continuation continuation) {
        return ((WmsConversationsEventsHandler$onBotMessages$1) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x07f5  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x07f8  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x080f A[Catch: all -> 0x0825, TryCatch #5 {all -> 0x0825, blocks: (B:10:0x0a6f, B:11:0x0a72, B:13:0x0a78, B:14:0x0a7d, B:28:0x0a1f, B:31:0x0a40, B:33:0x0a48, B:45:0x08ea, B:47:0x08f2, B:49:0x08f8, B:51:0x091e, B:52:0x0923, B:120:0x0809, B:122:0x080f, B:124:0x081e, B:128:0x082b, B:130:0x083f, B:133:0x0845, B:135:0x0851, B:136:0x0857, B:138:0x085d, B:140:0x0867, B:142:0x086d, B:144:0x0873, B:145:0x0879, B:147:0x087f, B:148:0x0885, B:151:0x0896, B:153:0x089e, B:211:0x098b), top: B:44:0x08ea }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0843  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0a78 A[Catch: all -> 0x0825, TryCatch #5 {all -> 0x0825, blocks: (B:10:0x0a6f, B:11:0x0a72, B:13:0x0a78, B:14:0x0a7d, B:28:0x0a1f, B:31:0x0a40, B:33:0x0a48, B:45:0x08ea, B:47:0x08f2, B:49:0x08f8, B:51:0x091e, B:52:0x0923, B:120:0x0809, B:122:0x080f, B:124:0x081e, B:128:0x082b, B:130:0x083f, B:133:0x0845, B:135:0x0851, B:136:0x0857, B:138:0x085d, B:140:0x0867, B:142:0x086d, B:144:0x0873, B:145:0x0879, B:147:0x087f, B:148:0x0885, B:151:0x0896, B:153:0x089e, B:211:0x098b), top: B:44:0x08ea }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x083c  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0745  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x078d  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0966  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x098b A[Catch: all -> 0x0825, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x0825, blocks: (B:10:0x0a6f, B:11:0x0a72, B:13:0x0a78, B:14:0x0a7d, B:28:0x0a1f, B:31:0x0a40, B:33:0x0a48, B:45:0x08ea, B:47:0x08f2, B:49:0x08f8, B:51:0x091e, B:52:0x0923, B:120:0x0809, B:122:0x080f, B:124:0x081e, B:128:0x082b, B:130:0x083f, B:133:0x0845, B:135:0x0851, B:136:0x0857, B:138:0x085d, B:140:0x0867, B:142:0x086d, B:144:0x0873, B:145:0x0879, B:147:0x087f, B:148:0x0885, B:151:0x0896, B:153:0x089e, B:211:0x098b), top: B:44:0x08ea }] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x04cf A[Catch: all -> 0x00a4, TryCatch #2 {all -> 0x00a4, blocks: (B:41:0x008b, B:62:0x0550, B:77:0x05e4, B:79:0x05ea, B:239:0x00e5, B:242:0x013a, B:245:0x018c, B:248:0x01e1, B:254:0x04c0, B:256:0x04cf, B:258:0x04d5, B:259:0x04da, B:298:0x0278, B:319:0x0396, B:334:0x047c, B:336:0x0485, B:338:0x048f, B:360:0x0307, B:368:0x0317), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x097a  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x04df A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:304:0x03e7 A[Catch: all -> 0x032e, TryCatch #10 {all -> 0x032e, blocks: (B:302:0x03dd, B:304:0x03e7, B:306:0x03f3, B:308:0x03f9, B:311:0x0446, B:347:0x0403, B:372:0x0323, B:375:0x0329, B:376:0x0334, B:378:0x0336, B:380:0x033c, B:381:0x0343), top: B:371:0x0323 }] */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0368 A[Catch: all -> 0x045c, TRY_LEAVE, TryCatch #22 {all -> 0x045c, blocks: (B:315:0x0362, B:317:0x0368, B:321:0x039c), top: B:314:0x0362 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0a40 A[Catch: all -> 0x0825, TryCatch #5 {all -> 0x0825, blocks: (B:10:0x0a6f, B:11:0x0a72, B:13:0x0a78, B:14:0x0a7d, B:28:0x0a1f, B:31:0x0a40, B:33:0x0a48, B:45:0x08ea, B:47:0x08f2, B:49:0x08f8, B:51:0x091e, B:52:0x0923, B:120:0x0809, B:122:0x080f, B:124:0x081e, B:128:0x082b, B:130:0x083f, B:133:0x0845, B:135:0x0851, B:136:0x0857, B:138:0x085d, B:140:0x0867, B:142:0x086d, B:144:0x0873, B:145:0x0879, B:147:0x087f, B:148:0x0885, B:151:0x0896, B:153:0x089e, B:211:0x098b), top: B:44:0x08ea }] */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x048f A[Catch: all -> 0x00a4, TryCatch #2 {all -> 0x00a4, blocks: (B:41:0x008b, B:62:0x0550, B:77:0x05e4, B:79:0x05ea, B:239:0x00e5, B:242:0x013a, B:245:0x018c, B:248:0x01e1, B:254:0x04c0, B:256:0x04cf, B:258:0x04d5, B:259:0x04da, B:298:0x0278, B:319:0x0396, B:334:0x047c, B:336:0x0485, B:338:0x048f, B:360:0x0307, B:368:0x0317), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0311 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0546 A[Catch: all -> 0x0961, TRY_LEAVE, TryCatch #0 {all -> 0x0961, blocks: (B:57:0x0540, B:59:0x0546, B:65:0x0555), top: B:56:0x0540 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0641 A[Catch: all -> 0x073f, TryCatch #23 {all -> 0x073f, blocks: (B:89:0x063b, B:91:0x0641, B:94:0x066e, B:97:0x0682, B:182:0x0652, B:186:0x066b), top: B:88:0x063b }] */
    /* JADX WARN: Type inference failed for: r0v122, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v49, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v3, types: [T, com.zoho.livechat.android.models.SalesIQChat] */
    /* JADX WARN: Type inference failed for: r2v3, types: [Wh.a] */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v76 */
    /* JADX WARN: Type inference failed for: r2v77 */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v117 */
    /* JADX WARN: Type inference failed for: r3v118 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [T] */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [int] */
    /* JADX WARN: Type inference failed for: r3v95, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v98 */
    /* JADX WARN: Type inference failed for: r5v27, types: [T, com.zoho.livechat.android.models.SalesIQChat] */
    /* JADX WARN: Type inference failed for: r6v30, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v33, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v36, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v38, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v28, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:154:0x08e0 -> B:43:0x00a0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:161:0x093f -> B:54:0x093c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:318:0x03cd -> B:291:0x03d3). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3;
        ?? r22;
        boolean z10;
        long j10;
        Wh.a a10;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        String str;
        WmsConversationsEventsHandler wmsConversationsEventsHandler;
        Ref.IntRef intRef;
        boolean z11;
        List list;
        boolean z12;
        Rf.a aVar;
        Ref.ObjectRef objectRef3;
        List list2;
        Wh.a aVar2;
        String str2;
        Ref.ObjectRef objectRef4;
        List list3;
        Ref.ObjectRef objectRef5;
        WmsConversationsEventsHandler wmsConversationsEventsHandler2;
        Iterator it;
        Ref.ObjectRef objectRef6;
        Rf.a aVar3;
        ArrayList arrayList;
        String str3;
        ArrayList arrayList2;
        String str4;
        List list4;
        Object obj4;
        List filterNotNull;
        Object J10;
        List list5;
        Rf.a aVar4;
        List list6;
        Object obj5;
        Wh.a aVar5;
        Wh.a aVar6;
        MessageEntity i10;
        String str5;
        String str6;
        Object K10;
        Object obj6;
        MessageEntity messageEntity;
        String str7;
        Collection collection;
        Object obj7;
        SalesIQChat salesIQChat;
        Wh.a aVar7;
        Iterator it2;
        boolean z13;
        boolean z14;
        Rf.a aVar8;
        ArrayList arrayList3;
        int i11;
        ArrayList arrayList4;
        WmsConversationsEventsHandler$onBotMessages$1 wmsConversationsEventsHandler$onBotMessages$1;
        Object obj8;
        ArrayList arrayList5;
        Wh.a aVar9;
        Wh.a aVar10;
        Object obj9;
        Ref.ObjectRef objectRef7;
        int i12;
        Ref.ObjectRef objectRef8;
        String str8;
        WmsConversationsEventsHandler wmsConversationsEventsHandler3;
        Rf.a aVar11;
        Ref.ObjectRef objectRef9;
        Iterator it3;
        MessageEntity messageEntity2;
        Map map;
        ArrayList arrayList6;
        boolean z15;
        boolean z16;
        boolean z17;
        int i13;
        ArrayList arrayList7;
        Ref.ObjectRef objectRef10;
        Object obj10;
        List list7;
        MessageEntity messageEntity3;
        Iterator it4;
        Ref.ObjectRef objectRef11;
        Rf.a aVar12;
        WmsConversationsEventsHandler wmsConversationsEventsHandler4;
        String str9;
        Ref.ObjectRef objectRef12;
        Object obj11;
        Wh.a aVar13;
        boolean z18;
        Map map2;
        boolean z19;
        List list8;
        WmsConversationsEventsHandler$onBotMessages$1 wmsConversationsEventsHandler$onBotMessages$12;
        boolean z20;
        Object obj12;
        Object obj13;
        Wh.a aVar14;
        ArrayList arrayList8;
        int i14;
        boolean z21;
        boolean z22;
        Rf.a aVar15;
        String str10;
        Map map3;
        Iterator it5;
        Ref.ObjectRef objectRef13;
        Ref.ObjectRef objectRef14;
        MessageEntity messageEntity4;
        List list9;
        WmsConversationsEventsHandler wmsConversationsEventsHandler5;
        Ref.ObjectRef objectRef15;
        String str11;
        ?? chat;
        ArrayList arrayList9;
        WmsConversationsEventsHandler wmsConversationsEventsHandler6;
        Ref.ObjectRef objectRef16;
        Wh.a aVar16;
        boolean z23;
        Object updateConversation;
        Wh.a aVar17;
        String message;
        boolean z24;
        String str12;
        ArrayList arrayList10;
        Object obj14;
        boolean z25;
        Object C10;
        String str13;
        WmsConversationsEventsHandler wmsConversationsEventsHandler7;
        boolean z26;
        ArrayList arrayList11;
        String S02;
        WmsConversationsEventsHandler wmsConversationsEventsHandler8;
        Object obj15;
        Ref.ObjectRef objectRef17;
        Iterator it6;
        MessageEntity messageEntity5;
        Map map4;
        ArrayList arrayList12;
        boolean z27;
        boolean z28;
        Rf.a aVar18;
        String str14;
        Ref.ObjectRef objectRef18;
        Wh.a aVar19;
        C6152a L10;
        String chatId;
        String messageId;
        Object obj16;
        Ref.ObjectRef objectRef19;
        ArrayList arrayList13;
        boolean z29;
        boolean z30;
        Wh.a aVar20;
        ArrayList arrayList14;
        String str15;
        boolean z31;
        boolean z32;
        int i15;
        Ref.ObjectRef objectRef20;
        boolean z33;
        ArrayList arrayList15;
        MessageEntity messageEntity6;
        Iterator it7;
        Ref.ObjectRef objectRef21;
        Rf.a aVar21;
        WmsConversationsEventsHandler wmsConversationsEventsHandler9;
        String str16;
        Ref.ObjectRef objectRef22;
        WmsConversationsEventsHandler$onBotMessages$1 wmsConversationsEventsHandler$onBotMessages$13;
        Object updateConversation2;
        Long typingDelay;
        Object obj17;
        Wh.a aVar22;
        Wh.a aVar23;
        Wh.a aVar24;
        MessageEntity messageEntity7;
        Iterator it8;
        ArrayList arrayList16;
        Ref.ObjectRef objectRef23;
        Function0 function0;
        Wh.a aVar25;
        WmsConversationsEventsHandler$onBotMessages$1 wmsConversationsEventsHandler$onBotMessages$14 = this;
        String str17 = "text";
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r32 = wmsConversationsEventsHandler$onBotMessages$14.f42992D;
        try {
            try {
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            obj2 = r32;
        }
        switch (r32) {
            case 0:
                z10 = false;
                j10 = -1;
                ResultKt.throwOnFailure(obj);
                a10 = C6461a.C0913a.f65814a.a();
                List list10 = wmsConversationsEventsHandler$onBotMessages$14.f42993E;
                boolean z34 = wmsConversationsEventsHandler$onBotMessages$14.f42994F;
                objectRef = wmsConversationsEventsHandler$onBotMessages$14.f42995G;
                objectRef2 = wmsConversationsEventsHandler$onBotMessages$14.f42996H;
                str = wmsConversationsEventsHandler$onBotMessages$14.f42997I;
                wmsConversationsEventsHandler = wmsConversationsEventsHandler$onBotMessages$14.f42998J;
                intRef = wmsConversationsEventsHandler$onBotMessages$14.f42999K;
                z11 = wmsConversationsEventsHandler$onBotMessages$14.f43000L;
                Rf.a aVar26 = wmsConversationsEventsHandler$onBotMessages$14.f43001O;
                wmsConversationsEventsHandler$onBotMessages$14.f43002n = a10;
                wmsConversationsEventsHandler$onBotMessages$14.f43003o = list10;
                wmsConversationsEventsHandler$onBotMessages$14.f43004p = objectRef;
                wmsConversationsEventsHandler$onBotMessages$14.f43005q = objectRef2;
                wmsConversationsEventsHandler$onBotMessages$14.f43006r = str;
                wmsConversationsEventsHandler$onBotMessages$14.f43007s = wmsConversationsEventsHandler;
                wmsConversationsEventsHandler$onBotMessages$14.f43008t = intRef;
                wmsConversationsEventsHandler$onBotMessages$14.f43009u = aVar26;
                wmsConversationsEventsHandler$onBotMessages$14.f42989A = z34;
                wmsConversationsEventsHandler$onBotMessages$14.f42990B = z11;
                wmsConversationsEventsHandler$onBotMessages$14.f42992D = 1;
                Object obj18 = coroutine_suspended;
                if (a10.f(null, wmsConversationsEventsHandler$onBotMessages$14) != coroutine_suspended) {
                    list = list10;
                    z12 = z34;
                    aVar = aVar26;
                    try {
                        objectRef3 = new Ref.ObjectRef();
                        list2 = (str == null || objectRef2.element != null) ? list : null;
                    } catch (Throwable th4) {
                        th = th4;
                        obj2 = a10;
                    }
                    if (list2 == null) {
                        try {
                            String str18 = (String) objectRef2.element;
                            if (str18 == null) {
                                str18 = LiveChatUtil.getChatid(str);
                            }
                            ?? chat2 = LiveChatUtil.getChat(str18);
                            objectRef3.element = chat2;
                            aVar2 = a10;
                            try {
                                if (objectRef2.element == null) {
                                    objectRef2.element = chat2 != 0 ? chat2.getChid() : 0;
                                }
                                SalesIQChat salesIQChat2 = (SalesIQChat) objectRef3.element;
                                intRef.element = salesIQChat2 != null ? salesIQChat2.getUnreadCount() : z10;
                                List list11 = list2;
                                ArrayList arrayList17 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list11, 10));
                                str2 = str;
                                objectRef4 = objectRef;
                                list3 = list;
                                objectRef5 = objectRef3;
                                wmsConversationsEventsHandler2 = wmsConversationsEventsHandler;
                                it = list11.iterator();
                                objectRef6 = objectRef2;
                                aVar3 = aVar;
                                arrayList = arrayList17;
                                obj5 = coroutine_suspended;
                                aVar5 = aVar2;
                                try {
                                } catch (Throwable th5) {
                                    th = th5;
                                    aVar6 = aVar5;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                coroutine_suspended = aVar2;
                                obj2 = coroutine_suspended;
                                obj3 = null;
                                r22 = obj2;
                                r22.g(obj3);
                                throw th;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            aVar2 = a10;
                            coroutine_suspended = aVar2;
                            obj2 = coroutine_suspended;
                            obj3 = null;
                            r22 = obj2;
                            r22.g(obj3);
                            throw th;
                        }
                        if (it.hasNext()) {
                            try {
                                i10 = c.i((Map) it.next(), str2, (String) objectRef6.element, null, (SalesIQChat) objectRef5.element, 4, null);
                                str5 = str2;
                                str6 = str17;
                                C6152a L11 = wmsConversationsEventsHandler2.L();
                                Object obj19 = obj5;
                                String str19 = (String) objectRef6.element;
                                if (str19 == null) {
                                    str19 = i10.getChatId();
                                }
                                String messageId2 = i10.getMessageId();
                                wmsConversationsEventsHandler$onBotMessages$14.f43002n = aVar5;
                                wmsConversationsEventsHandler$onBotMessages$14.f43003o = list3;
                                wmsConversationsEventsHandler$onBotMessages$14.f43004p = objectRef4;
                                wmsConversationsEventsHandler$onBotMessages$14.f43005q = objectRef6;
                                wmsConversationsEventsHandler$onBotMessages$14.f43006r = str5;
                                wmsConversationsEventsHandler$onBotMessages$14.f43007s = wmsConversationsEventsHandler2;
                                wmsConversationsEventsHandler$onBotMessages$14.f43008t = aVar3;
                                wmsConversationsEventsHandler$onBotMessages$14.f43009u = objectRef5;
                                wmsConversationsEventsHandler$onBotMessages$14.f43010v = arrayList;
                                wmsConversationsEventsHandler$onBotMessages$14.f43011w = it;
                                wmsConversationsEventsHandler$onBotMessages$14.f43012x = arrayList;
                                wmsConversationsEventsHandler$onBotMessages$14.f43013y = i10;
                                wmsConversationsEventsHandler$onBotMessages$14.f42989A = z12;
                                wmsConversationsEventsHandler$onBotMessages$14.f42990B = z11;
                                wmsConversationsEventsHandler$onBotMessages$14.f42992D = 2;
                                K10 = L11.K(str19, messageId2, wmsConversationsEventsHandler$onBotMessages$14);
                                obj6 = obj19;
                                obj18 = obj6;
                            } catch (Throwable th8) {
                                th = th8;
                            }
                            aVar6 = aVar5;
                            if (K10 != obj6) {
                                messageEntity = i10;
                                a10 = aVar6;
                                str7 = str5;
                                collection = arrayList;
                                obj7 = obj6;
                                aVar2 = a10;
                                collection.add(Intrinsics.areEqual(((C5582a) K10).b(), Boxing.boxBoolean(true)) ? null : (messageEntity.getTime().getPreviousMessageTime() == j10 && (salesIQChat = (SalesIQChat) objectRef5.element) != null && salesIQChat.getStatus() == 2) ? messageEntity : MessageEntity.copy$default(messageEntity, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, Boxing.boxBoolean(z10), null, null, null, null, false, null, null, 133693439, null));
                                str2 = str7;
                                str17 = str6;
                                obj5 = obj7;
                                aVar5 = aVar2;
                                if (it.hasNext()) {
                                    str3 = str17;
                                    aVar6 = aVar5;
                                    arrayList2 = arrayList;
                                    str4 = str2;
                                    list4 = list3;
                                    a10 = aVar6;
                                    obj4 = obj5;
                                    filterNotNull = (arrayList2 != null || (list6 = CollectionsKt.toList(arrayList2)) == null) ? null : CollectionsKt.filterNotNull(list6);
                                    if (filterNotNull != null) {
                                        C6152a L12 = wmsConversationsEventsHandler2.L();
                                        wmsConversationsEventsHandler$onBotMessages$14.f43002n = a10;
                                        wmsConversationsEventsHandler$onBotMessages$14.f43003o = list4;
                                        wmsConversationsEventsHandler$onBotMessages$14.f43004p = objectRef4;
                                        wmsConversationsEventsHandler$onBotMessages$14.f43005q = objectRef6;
                                        wmsConversationsEventsHandler$onBotMessages$14.f43006r = str4;
                                        wmsConversationsEventsHandler$onBotMessages$14.f43007s = wmsConversationsEventsHandler2;
                                        wmsConversationsEventsHandler$onBotMessages$14.f43008t = aVar3;
                                        wmsConversationsEventsHandler$onBotMessages$14.f43009u = objectRef5;
                                        wmsConversationsEventsHandler$onBotMessages$14.f43010v = filterNotNull;
                                        wmsConversationsEventsHandler$onBotMessages$14.f43011w = arrayList2;
                                        wmsConversationsEventsHandler$onBotMessages$14.f43012x = null;
                                        wmsConversationsEventsHandler$onBotMessages$14.f43013y = null;
                                        wmsConversationsEventsHandler$onBotMessages$14.f42989A = z12;
                                        wmsConversationsEventsHandler$onBotMessages$14.f42990B = z11;
                                        wmsConversationsEventsHandler$onBotMessages$14.f42992D = 3;
                                        J10 = L12.J(filterNotNull, wmsConversationsEventsHandler$onBotMessages$14);
                                        if (J10 == obj4) {
                                            obj18 = obj4;
                                        } else {
                                            Rf.a aVar27 = aVar3;
                                            list5 = filterNotNull;
                                            aVar4 = aVar27;
                                            obj4 = obj4;
                                            List list12 = list5;
                                            aVar3 = aVar4;
                                            filterNotNull = list12;
                                        }
                                    }
                                    if (z12) {
                                        Function0 function02 = (Function0) objectRef4.element;
                                        if (function02 != null) {
                                            function02.invoke();
                                            Unit unit = Unit.INSTANCE;
                                        }
                                        objectRef4.element = null;
                                    }
                                    if (filterNotNull == null) {
                                        ArrayList arrayList18 = arrayList2;
                                        wmsConversationsEventsHandler$onBotMessages$1 = wmsConversationsEventsHandler$onBotMessages$14;
                                        obj8 = obj4;
                                        arrayList5 = arrayList18;
                                        aVar9 = a10;
                                        wmsConversationsEventsHandler5 = wmsConversationsEventsHandler2;
                                        objectRef15 = objectRef4;
                                        str11 = (String) objectRef6.element;
                                        if (str11 == null) {
                                        }
                                        chat = LiveChatUtil.getChat(str11);
                                        objectRef5.element = chat;
                                        if (chat != 0) {
                                        }
                                        arrayList9 = arrayList5;
                                        wmsConversationsEventsHandler6 = wmsConversationsEventsHandler5;
                                        objectRef16 = objectRef15;
                                        aVar16 = aVar9;
                                        arrayList16 = arrayList9;
                                        aVar24 = aVar16;
                                        if (arrayList16 != null) {
                                        }
                                        function0 = (Function0) objectRef16.element;
                                        if (function0 != null) {
                                        }
                                        Unit unit2 = Unit.INSTANCE;
                                        aVar24.g(null);
                                        return Unit.INSTANCE;
                                    }
                                    try {
                                        ArrayList arrayList19 = new ArrayList();
                                        for (Object obj20 : filterNotNull) {
                                            try {
                                                try {
                                                    if (((MessageEntity) obj20).getTime().getPreviousMessageTime() == j10) {
                                                        arrayList4 = arrayList2;
                                                        SalesIQChat salesIQChat3 = (SalesIQChat) objectRef5.element;
                                                        if (salesIQChat3 != null) {
                                                            aVar7 = a10;
                                                            if (salesIQChat3.getStatus() == 2) {
                                                                arrayList2 = arrayList4;
                                                                a10 = aVar7;
                                                            }
                                                            arrayList19.add(obj20);
                                                            arrayList2 = arrayList4;
                                                            a10 = aVar7;
                                                        }
                                                    } else {
                                                        arrayList4 = arrayList2;
                                                    }
                                                    arrayList19.add(obj20);
                                                    arrayList2 = arrayList4;
                                                    a10 = aVar7;
                                                } catch (Throwable th9) {
                                                    th = th9;
                                                    obj2 = aVar7;
                                                    obj3 = null;
                                                    r22 = obj2;
                                                    r22.g(obj3);
                                                    throw th;
                                                }
                                                aVar7 = a10;
                                            } catch (Throwable th10) {
                                                th = th10;
                                                aVar7 = a10;
                                                obj2 = aVar7;
                                                obj3 = null;
                                                r22 = obj2;
                                                r22.g(obj3);
                                                throw th;
                                            }
                                        }
                                        ArrayList arrayList20 = arrayList2;
                                        aVar7 = a10;
                                        Rf.a aVar28 = aVar3;
                                        it2 = arrayList19.iterator();
                                        z13 = z12;
                                        z14 = z11;
                                        aVar8 = aVar28;
                                        arrayList3 = arrayList20;
                                        i11 = z10 ? 1 : 0;
                                        r32 = aVar7;
                                        obj17 = obj4;
                                        try {
                                            if (it2.hasNext()) {
                                                try {
                                                    Object next = it2.next();
                                                    int i16 = i11 + 1;
                                                    if (i11 < 0) {
                                                        CollectionsKt.throwIndexOverflow();
                                                    }
                                                    Object obj21 = obj17;
                                                    MessageEntity messageEntity8 = (MessageEntity) next;
                                                    Map map5 = (Map) list4.get(i11);
                                                    C6152a L13 = wmsConversationsEventsHandler2.L();
                                                    String chatId2 = messageEntity8.getChatId();
                                                    String messageId3 = messageEntity8.getMessageId();
                                                    Boolean boxBoolean = Boxing.boxBoolean(true);
                                                    wmsConversationsEventsHandler$onBotMessages$14.f43002n = r32;
                                                    wmsConversationsEventsHandler$onBotMessages$14.f43003o = list4;
                                                    wmsConversationsEventsHandler$onBotMessages$14.f43004p = objectRef4;
                                                    wmsConversationsEventsHandler$onBotMessages$14.f43005q = objectRef6;
                                                    wmsConversationsEventsHandler$onBotMessages$14.f43006r = str4;
                                                    wmsConversationsEventsHandler$onBotMessages$14.f43007s = wmsConversationsEventsHandler2;
                                                    wmsConversationsEventsHandler$onBotMessages$14.f43008t = aVar8;
                                                    wmsConversationsEventsHandler$onBotMessages$14.f43009u = objectRef5;
                                                    wmsConversationsEventsHandler$onBotMessages$14.f43010v = it2;
                                                    wmsConversationsEventsHandler$onBotMessages$14.f43011w = messageEntity8;
                                                    wmsConversationsEventsHandler$onBotMessages$14.f43012x = map5;
                                                    wmsConversationsEventsHandler$onBotMessages$14.f43013y = arrayList3;
                                                    wmsConversationsEventsHandler$onBotMessages$14.f43014z = null;
                                                    wmsConversationsEventsHandler$onBotMessages$14.f42989A = z13;
                                                    wmsConversationsEventsHandler$onBotMessages$14.f42990B = z14;
                                                    wmsConversationsEventsHandler$onBotMessages$14.f42991C = i16;
                                                    boolean z35 = z13;
                                                    wmsConversationsEventsHandler$onBotMessages$14.f42992D = 4;
                                                    Object obj22 = obj21;
                                                    obj18 = obj22;
                                                    if (L13.W(chatId2, messageId3, boxBoolean, wmsConversationsEventsHandler$onBotMessages$14) != obj22) {
                                                        i12 = i16;
                                                        obj9 = obj22;
                                                        map = map5;
                                                        objectRef7 = objectRef4;
                                                        aVar10 = aVar22;
                                                        arrayList6 = arrayList3;
                                                        objectRef8 = objectRef6;
                                                        z15 = z35;
                                                        str8 = str4;
                                                        wmsConversationsEventsHandler3 = wmsConversationsEventsHandler2;
                                                        aVar11 = aVar8;
                                                        objectRef9 = objectRef5;
                                                        it3 = it2;
                                                        messageEntity2 = messageEntity8;
                                                        if (z14) {
                                                            int i17 = i12;
                                                            try {
                                                                boolean z36 = z14;
                                                                boolean z37 = z15;
                                                                Message.Meta meta = (Message.Meta) AbstractC5895g.b(wmsConversationsEventsHandler3.K(), messageEntity2.getMeta(), Message.Meta.class);
                                                                ArrayList arrayList21 = arrayList6;
                                                                long longValue = 1000 * ((meta == null || (typingDelay = meta.getTypingDelay()) == null) ? 3L : typingDelay.longValue());
                                                                wmsConversationsEventsHandler$onBotMessages$14.f43002n = aVar10;
                                                                wmsConversationsEventsHandler$onBotMessages$14.f43003o = list4;
                                                                wmsConversationsEventsHandler$onBotMessages$14.f43004p = objectRef7;
                                                                wmsConversationsEventsHandler$onBotMessages$14.f43005q = objectRef8;
                                                                wmsConversationsEventsHandler$onBotMessages$14.f43006r = str8;
                                                                wmsConversationsEventsHandler$onBotMessages$14.f43007s = wmsConversationsEventsHandler3;
                                                                wmsConversationsEventsHandler$onBotMessages$14.f43008t = aVar11;
                                                                wmsConversationsEventsHandler$onBotMessages$14.f43009u = objectRef9;
                                                                wmsConversationsEventsHandler$onBotMessages$14.f43010v = it3;
                                                                wmsConversationsEventsHandler$onBotMessages$14.f43011w = messageEntity2;
                                                                wmsConversationsEventsHandler$onBotMessages$14.f43012x = map;
                                                                wmsConversationsEventsHandler$onBotMessages$14.f43013y = arrayList21;
                                                                wmsConversationsEventsHandler$onBotMessages$14.f42989A = z37;
                                                                wmsConversationsEventsHandler$onBotMessages$14.f42990B = z36;
                                                                wmsConversationsEventsHandler$onBotMessages$14.f42991C = i17;
                                                                i13 = i17;
                                                                wmsConversationsEventsHandler$onBotMessages$14.f42992D = 5;
                                                                Object a11 = AbstractC1440a0.a(longValue, wmsConversationsEventsHandler$onBotMessages$14);
                                                                Object obj23 = obj9;
                                                                if (a11 == obj23) {
                                                                    return obj23;
                                                                }
                                                                try {
                                                                    arrayList7 = arrayList21;
                                                                    list7 = list4;
                                                                    obj10 = obj23;
                                                                    z17 = z37;
                                                                    z16 = z36;
                                                                    objectRef10 = objectRef7;
                                                                    str15 = (String) objectRef8.element;
                                                                    if (str15 == null) {
                                                                        try {
                                                                            Object obj24 = objectRef9.element;
                                                                            SalesIQChat salesIQChat4 = (SalesIQChat) obj24;
                                                                            if (salesIQChat4 != null) {
                                                                                SalesIQChat salesIQChat5 = (SalesIQChat) obj24;
                                                                                if (salesIQChat5 != null) {
                                                                                    z31 = true;
                                                                                    int unreadCount = salesIQChat5.getUnreadCount() + 1;
                                                                                    z32 = z16;
                                                                                    i15 = unreadCount;
                                                                                } else {
                                                                                    z31 = true;
                                                                                    z32 = z16;
                                                                                    i15 = 1;
                                                                                }
                                                                                salesIQChat4.setUnreadCount(i15);
                                                                            } else {
                                                                                z32 = z16;
                                                                                z31 = true;
                                                                            }
                                                                            ConversationsLocalDataSource J11 = wmsConversationsEventsHandler3.J();
                                                                            SalesIQChat salesIQChat6 = (SalesIQChat) objectRef9.element;
                                                                            Integer boxInt = salesIQChat6 != null ? Boxing.boxInt(salesIQChat6.getUnreadCount()) : null;
                                                                            wmsConversationsEventsHandler$onBotMessages$14.f43002n = aVar13;
                                                                            wmsConversationsEventsHandler$onBotMessages$14.f43003o = list7;
                                                                            wmsConversationsEventsHandler$onBotMessages$14.f43004p = objectRef10;
                                                                            wmsConversationsEventsHandler$onBotMessages$14.f43005q = objectRef8;
                                                                            wmsConversationsEventsHandler$onBotMessages$14.f43006r = str8;
                                                                            wmsConversationsEventsHandler$onBotMessages$14.f43007s = wmsConversationsEventsHandler3;
                                                                            wmsConversationsEventsHandler$onBotMessages$14.f43008t = aVar11;
                                                                            wmsConversationsEventsHandler$onBotMessages$14.f43009u = objectRef9;
                                                                            wmsConversationsEventsHandler$onBotMessages$14.f43010v = it3;
                                                                            wmsConversationsEventsHandler$onBotMessages$14.f43011w = messageEntity2;
                                                                            wmsConversationsEventsHandler$onBotMessages$14.f43012x = map;
                                                                            wmsConversationsEventsHandler$onBotMessages$14.f43013y = arrayList7;
                                                                            wmsConversationsEventsHandler$onBotMessages$14.f42989A = z17;
                                                                            List list13 = list7;
                                                                            boolean z38 = z32;
                                                                            wmsConversationsEventsHandler$onBotMessages$14.f42990B = z38;
                                                                            int i18 = i13;
                                                                            wmsConversationsEventsHandler$onBotMessages$14.f42991C = i18;
                                                                            wmsConversationsEventsHandler$onBotMessages$14.f42992D = 6;
                                                                            updateConversation2 = J11.updateConversation(str15, (r39 & 2) != 0 ? null : null, (r39 & 4) != 0 ? null : null, (r39 & 8) != 0 ? null : boxInt, (r39 & 16) != 0 ? null : null, (r39 & 32) != 0 ? null : null, (r39 & 64) != 0 ? null : null, (r39 & 128) != 0 ? null : null, (r39 & 256) != 0 ? null : null, (r39 & 512) != 0 ? null : null, (r39 & 1024) != 0 ? null : null, (r39 & 2048) != 0 ? null : null, (r39 & 4096) != 0 ? null : null, (r39 & 8192) != 0 ? null : null, (r39 & 16384) != 0 ? null : null, (r39 & 32768) != 0 ? null : null, wmsConversationsEventsHandler$onBotMessages$13);
                                                                            wmsConversationsEventsHandler$onBotMessages$12 = wmsConversationsEventsHandler$onBotMessages$13;
                                                                            if (updateConversation2 == obj11) {
                                                                                return obj11;
                                                                            }
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        aVar13 = aVar13;
                                                                                        objectRef4 = objectRef20;
                                                                                        list8 = list13;
                                                                                        z18 = z38;
                                                                                        z20 = z33;
                                                                                        arrayList14 = arrayList15;
                                                                                        messageEntity3 = messageEntity6;
                                                                                        it4 = it7;
                                                                                        objectRef11 = objectRef21;
                                                                                        aVar12 = aVar21;
                                                                                        wmsConversationsEventsHandler4 = wmsConversationsEventsHandler9;
                                                                                        str9 = str16;
                                                                                        objectRef12 = objectRef22;
                                                                                        i13 = i18;
                                                                                        z19 = false;
                                                                                        j.s0(z19, 1, obj12);
                                                                                        Unit unit3 = Unit.INSTANCE;
                                                                                        z29 = z18;
                                                                                        arrayList13 = arrayList14;
                                                                                        objectRef19 = objectRef12;
                                                                                        z30 = z20;
                                                                                        str8 = str9;
                                                                                        wmsConversationsEventsHandler3 = wmsConversationsEventsHandler4;
                                                                                        aVar11 = aVar12;
                                                                                        objectRef9 = objectRef11;
                                                                                        it3 = it4;
                                                                                        messageEntity2 = messageEntity3;
                                                                                        map = map2;
                                                                                        aVar20 = aVar13;
                                                                                        obj15 = obj11;
                                                                                        aVar18 = aVar11;
                                                                                        wmsConversationsEventsHandler8 = wmsConversationsEventsHandler3;
                                                                                        str14 = str8;
                                                                                        objectRef18 = objectRef19;
                                                                                        messageEntity5 = messageEntity2;
                                                                                        it6 = it3;
                                                                                        objectRef17 = objectRef9;
                                                                                        arrayList12 = arrayList13;
                                                                                        z27 = z30;
                                                                                        map4 = map;
                                                                                        z28 = z29;
                                                                                        list9 = list8;
                                                                                        aVar10 = aVar20;
                                                                                        L10 = wmsConversationsEventsHandler8.L();
                                                                                        chatId = messageEntity5.getChatId();
                                                                                        messageId = messageEntity5.getMessageId();
                                                                                        wmsConversationsEventsHandler$onBotMessages$12.f43002n = aVar10;
                                                                                        wmsConversationsEventsHandler$onBotMessages$12.f43003o = list9;
                                                                                        wmsConversationsEventsHandler$onBotMessages$12.f43004p = objectRef4;
                                                                                        wmsConversationsEventsHandler$onBotMessages$12.f43005q = objectRef18;
                                                                                        wmsConversationsEventsHandler$onBotMessages$12.f43006r = str14;
                                                                                        Ref.ObjectRef objectRef24 = objectRef18;
                                                                                        WmsConversationsEventsHandler wmsConversationsEventsHandler10 = wmsConversationsEventsHandler8;
                                                                                        wmsConversationsEventsHandler$onBotMessages$12.f43007s = wmsConversationsEventsHandler10;
                                                                                        wmsConversationsEventsHandler$onBotMessages$12.f43008t = aVar18;
                                                                                        wmsConversationsEventsHandler$onBotMessages$12.f43009u = objectRef17;
                                                                                        wmsConversationsEventsHandler$onBotMessages$12.f43010v = it6;
                                                                                        wmsConversationsEventsHandler$onBotMessages$12.f43011w = messageEntity5;
                                                                                        wmsConversationsEventsHandler$onBotMessages$12.f43012x = map4;
                                                                                        wmsConversationsEventsHandler$onBotMessages$12.f43013y = arrayList12;
                                                                                        wmsConversationsEventsHandler$onBotMessages$12.f42989A = z27;
                                                                                        wmsConversationsEventsHandler$onBotMessages$12.f42990B = z28;
                                                                                        wmsConversationsEventsHandler$onBotMessages$12.f42991C = r2;
                                                                                        wmsConversationsEventsHandler$onBotMessages$12.f42992D = 7;
                                                                                        obj16 = obj15;
                                                                                        if (L10.W(chatId, messageId, null, wmsConversationsEventsHandler$onBotMessages$12) != obj16) {
                                                                                            return obj16;
                                                                                        }
                                                                                        obj13 = obj16;
                                                                                        arrayList8 = arrayList12;
                                                                                        it5 = it6;
                                                                                        aVar14 = aVar19;
                                                                                        objectRef14 = objectRef24;
                                                                                        map3 = map4;
                                                                                        str10 = str14;
                                                                                        aVar15 = aVar18;
                                                                                        z22 = z28;
                                                                                        z21 = z27;
                                                                                        objectRef13 = objectRef17;
                                                                                        messageEntity4 = messageEntity5;
                                                                                        wmsConversationsEventsHandler2 = wmsConversationsEventsHandler10;
                                                                                        message = messageEntity4.getMessage();
                                                                                        if (message == null) {
                                                                                            z24 = z22;
                                                                                            JSONObject jSONObject = new JSONObject(message);
                                                                                            String str20 = str3;
                                                                                            if (!jSONObject.has(str20) || jSONObject.isNull(str20)) {
                                                                                                jSONObject = null;
                                                                                            }
                                                                                            str12 = jSONObject != null ? i.u(jSONObject.get(str20).toString()) : null;
                                                                                            str3 = str20;
                                                                                        } else {
                                                                                            z24 = z22;
                                                                                            str12 = null;
                                                                                        }
                                                                                        if (aVar15 != Rf.a.Clicked) {
                                                                                            if (z21) {
                                                                                                z25 = z21;
                                                                                            } else {
                                                                                                String y10 = C6218a.y();
                                                                                                z25 = z21;
                                                                                                SalesIQChat salesIQChat7 = (SalesIQChat) objectRef13.element;
                                                                                                if (!Intrinsics.areEqual(y10, salesIQChat7 != null ? salesIQChat7.getChid() : null) && (S02 = Te.a.S0(messageEntity4.getSender())) != null && i.e(S02)) {
                                                                                                    SalesIQChat salesIQChat8 = (SalesIQChat) objectRef13.element;
                                                                                                    WaitingChatDetails D10 = Tf.b.D(salesIQChat8 != null ? salesIQChat8.getConvID() : null);
                                                                                                    if (!Intrinsics.areEqual(S02, D10 != null ? D10.getAttenderId() : null)) {
                                                                                                    }
                                                                                                }
                                                                                                z21 = z25;
                                                                                            }
                                                                                            if (i.e(objectRef13.element)) {
                                                                                                Object obj25 = objectRef13.element;
                                                                                                Intrinsics.checkNotNull(obj25);
                                                                                                wmsConversationsEventsHandler$onBotMessages$12.f43002n = aVar14;
                                                                                                wmsConversationsEventsHandler$onBotMessages$12.f43003o = list9;
                                                                                                wmsConversationsEventsHandler$onBotMessages$12.f43004p = objectRef4;
                                                                                                wmsConversationsEventsHandler$onBotMessages$12.f43005q = objectRef14;
                                                                                                wmsConversationsEventsHandler$onBotMessages$12.f43006r = str10;
                                                                                                wmsConversationsEventsHandler$onBotMessages$12.f43007s = wmsConversationsEventsHandler2;
                                                                                                wmsConversationsEventsHandler$onBotMessages$12.f43008t = aVar15;
                                                                                                wmsConversationsEventsHandler$onBotMessages$12.f43009u = objectRef13;
                                                                                                wmsConversationsEventsHandler$onBotMessages$12.f43010v = it5;
                                                                                                wmsConversationsEventsHandler$onBotMessages$12.f43011w = messageEntity4;
                                                                                                wmsConversationsEventsHandler$onBotMessages$12.f43012x = map3;
                                                                                                wmsConversationsEventsHandler$onBotMessages$12.f43013y = arrayList8;
                                                                                                wmsConversationsEventsHandler$onBotMessages$12.f43014z = str12;
                                                                                                z21 = z25;
                                                                                                wmsConversationsEventsHandler$onBotMessages$12.f42989A = z21;
                                                                                                ArrayList arrayList22 = arrayList8;
                                                                                                boolean z39 = z24;
                                                                                                wmsConversationsEventsHandler$onBotMessages$12.f42990B = z39;
                                                                                                int i19 = i14;
                                                                                                wmsConversationsEventsHandler$onBotMessages$12.f42991C = i19;
                                                                                                i14 = i19;
                                                                                                wmsConversationsEventsHandler$onBotMessages$12.f42992D = 8;
                                                                                                C10 = wmsConversationsEventsHandler2.C(messageEntity4, (SalesIQChat) obj25, false, wmsConversationsEventsHandler$onBotMessages$12);
                                                                                                obj14 = obj13;
                                                                                                if (C10 == obj14) {
                                                                                                    return obj14;
                                                                                                }
                                                                                                try {
                                                                                                    str13 = str12;
                                                                                                    wmsConversationsEventsHandler7 = wmsConversationsEventsHandler2;
                                                                                                    z26 = z39;
                                                                                                    arrayList11 = arrayList22;
                                                                                                    aVar24 = aVar14;
                                                                                                    if (((Boolean) C10).booleanValue() || !i.e(str13)) {
                                                                                                        it8 = it5;
                                                                                                    } else {
                                                                                                        Type type = new TypeToken<Hashtable<String, Object>>() { // from class: com.zoho.livechat.android.modules.conversations.data.wms.handlers.WmsConversationsEventsHandler$onBotMessages$1$1$3$hashTableType$1
                                                                                                        }.getType();
                                                                                                        Gson j11 = Yd.a.j();
                                                                                                        it8 = it5;
                                                                                                        String hVar = Yd.a.j().B(map3).toString();
                                                                                                        Intrinsics.checkNotNull(type);
                                                                                                        Hashtable hashtable = (Hashtable) AbstractC5895g.c(j11, hVar, type);
                                                                                                        if (hashtable == null) {
                                                                                                            hashtable = new Hashtable();
                                                                                                        }
                                                                                                        WmsConversationsEventsHandler.Q(wmsConversationsEventsHandler7, messageEntity7, str13, hashtable, false, 8, null);
                                                                                                    }
                                                                                                    objectRef6 = objectRef14;
                                                                                                    str4 = str10;
                                                                                                    arrayList10 = arrayList11;
                                                                                                    wmsConversationsEventsHandler2 = wmsConversationsEventsHandler7;
                                                                                                    aVar8 = aVar15;
                                                                                                    z14 = z26;
                                                                                                    objectRef5 = objectRef13;
                                                                                                    it2 = it8;
                                                                                                    aVar23 = aVar24;
                                                                                                    r32 = aVar23;
                                                                                                    list4 = list9;
                                                                                                    obj17 = obj14;
                                                                                                    z13 = z21;
                                                                                                    wmsConversationsEventsHandler$onBotMessages$14 = wmsConversationsEventsHandler$onBotMessages$12;
                                                                                                    i11 = i14;
                                                                                                    arrayList3 = arrayList10;
                                                                                                    z10 = false;
                                                                                                    if (it2.hasNext()) {
                                                                                                        wmsConversationsEventsHandler$onBotMessages$1 = wmsConversationsEventsHandler$onBotMessages$14;
                                                                                                        obj8 = obj17;
                                                                                                        aVar22 = r32;
                                                                                                        try {
                                                                                                            Unit unit4 = Unit.INSTANCE;
                                                                                                            arrayList5 = arrayList3;
                                                                                                            aVar9 = aVar22;
                                                                                                            wmsConversationsEventsHandler5 = wmsConversationsEventsHandler2;
                                                                                                            objectRef15 = objectRef4;
                                                                                                            try {
                                                                                                                str11 = (String) objectRef6.element;
                                                                                                                if (str11 == null) {
                                                                                                                    str11 = LiveChatUtil.getChatid(str4);
                                                                                                                }
                                                                                                                chat = LiveChatUtil.getChat(str11);
                                                                                                                objectRef5.element = chat;
                                                                                                                if (chat != 0 || chat.getStatus() != 4) {
                                                                                                                    arrayList9 = arrayList5;
                                                                                                                    wmsConversationsEventsHandler6 = wmsConversationsEventsHandler5;
                                                                                                                    objectRef16 = objectRef15;
                                                                                                                    aVar16 = aVar9;
                                                                                                                    arrayList16 = arrayList9;
                                                                                                                    aVar24 = aVar16;
                                                                                                                    if (arrayList16 != null) {
                                                                                                                        MessageEntity messageEntity9 = (MessageEntity) CollectionsKt.lastOrNull((List) arrayList16);
                                                                                                                        aVar24 = aVar16;
                                                                                                                        if (messageEntity9 != null) {
                                                                                                                            wmsConversationsEventsHandler$onBotMessages$1.f43002n = aVar16;
                                                                                                                            wmsConversationsEventsHandler$onBotMessages$1.f43003o = objectRef16;
                                                                                                                            wmsConversationsEventsHandler$onBotMessages$1.f43004p = null;
                                                                                                                            wmsConversationsEventsHandler$onBotMessages$1.f43005q = null;
                                                                                                                            wmsConversationsEventsHandler$onBotMessages$1.f43006r = null;
                                                                                                                            wmsConversationsEventsHandler$onBotMessages$1.f43007s = null;
                                                                                                                            wmsConversationsEventsHandler$onBotMessages$1.f43008t = null;
                                                                                                                            wmsConversationsEventsHandler$onBotMessages$1.f43009u = null;
                                                                                                                            wmsConversationsEventsHandler$onBotMessages$1.f43010v = null;
                                                                                                                            wmsConversationsEventsHandler$onBotMessages$1.f43011w = null;
                                                                                                                            wmsConversationsEventsHandler$onBotMessages$1.f43012x = null;
                                                                                                                            wmsConversationsEventsHandler$onBotMessages$1.f43013y = null;
                                                                                                                            wmsConversationsEventsHandler$onBotMessages$1.f43014z = null;
                                                                                                                            wmsConversationsEventsHandler$onBotMessages$1.f42992D = 10;
                                                                                                                            if (wmsConversationsEventsHandler6.v0(messageEntity9, wmsConversationsEventsHandler$onBotMessages$1) == obj8) {
                                                                                                                                return obj8;
                                                                                                                            }
                                                                                                                            objectRef23 = objectRef16;
                                                                                                                            aVar25 = aVar16;
                                                                                                                            Unit unit5 = Unit.INSTANCE;
                                                                                                                            objectRef16 = objectRef23;
                                                                                                                            aVar24 = aVar25;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    function0 = (Function0) objectRef16.element;
                                                                                                                    if (function0 != null) {
                                                                                                                        function0.invoke();
                                                                                                                        Unit unit6 = Unit.INSTANCE;
                                                                                                                    }
                                                                                                                    Unit unit22 = Unit.INSTANCE;
                                                                                                                    aVar24.g(null);
                                                                                                                    return Unit.INSTANCE;
                                                                                                                }
                                                                                                                ConversationsLocalDataSource J12 = wmsConversationsEventsHandler5.J();
                                                                                                                Object obj26 = objectRef5.element;
                                                                                                                Intrinsics.checkNotNull(obj26);
                                                                                                                String chid = ((SalesIQChat) obj26).getChid();
                                                                                                                Intrinsics.checkNotNullExpressionValue(chid, "getChid(...)");
                                                                                                                Integer boxInt2 = Boxing.boxInt(0);
                                                                                                                wmsConversationsEventsHandler$onBotMessages$1.f43002n = aVar9;
                                                                                                                wmsConversationsEventsHandler$onBotMessages$1.f43003o = objectRef15;
                                                                                                                wmsConversationsEventsHandler$onBotMessages$1.f43004p = wmsConversationsEventsHandler5;
                                                                                                                wmsConversationsEventsHandler$onBotMessages$1.f43005q = arrayList5;
                                                                                                                wmsConversationsEventsHandler$onBotMessages$1.f43006r = null;
                                                                                                                wmsConversationsEventsHandler$onBotMessages$1.f43007s = null;
                                                                                                                wmsConversationsEventsHandler$onBotMessages$1.f43008t = null;
                                                                                                                wmsConversationsEventsHandler$onBotMessages$1.f43009u = null;
                                                                                                                wmsConversationsEventsHandler$onBotMessages$1.f43010v = null;
                                                                                                                wmsConversationsEventsHandler$onBotMessages$1.f43011w = null;
                                                                                                                wmsConversationsEventsHandler$onBotMessages$1.f43012x = null;
                                                                                                                wmsConversationsEventsHandler$onBotMessages$1.f43013y = null;
                                                                                                                wmsConversationsEventsHandler$onBotMessages$1.f43014z = null;
                                                                                                                wmsConversationsEventsHandler$onBotMessages$1.f42992D = 9;
                                                                                                                arrayList9 = arrayList5;
                                                                                                                aVar7 = aVar9;
                                                                                                                z23 = false;
                                                                                                                try {
                                                                                                                    updateConversation = J12.updateConversation(chid, (r39 & 2) != 0 ? null : null, (r39 & 4) != 0 ? null : null, (r39 & 8) != 0 ? null : boxInt2, (r39 & 16) != 0 ? null : null, (r39 & 32) != 0 ? null : null, (r39 & 64) != 0 ? null : null, (r39 & 128) != 0 ? null : null, (r39 & 256) != 0 ? null : null, (r39 & 512) != 0 ? null : null, (r39 & 1024) != 0 ? null : null, (r39 & 2048) != 0 ? null : null, (r39 & 4096) != 0 ? null : null, (r39 & 8192) != 0 ? null : null, (r39 & 16384) != 0 ? null : null, (r39 & 32768) != 0 ? null : null, this);
                                                                                                                    wmsConversationsEventsHandler$onBotMessages$1 = this;
                                                                                                                    if (updateConversation == obj8) {
                                                                                                                        return obj8;
                                                                                                                    }
                                                                                                                    wmsConversationsEventsHandler6 = wmsConversationsEventsHandler5;
                                                                                                                    objectRef16 = objectRef15;
                                                                                                                    aVar17 = aVar7;
                                                                                                                    j.s0(z23, 1, null);
                                                                                                                    aVar16 = aVar17;
                                                                                                                    arrayList16 = arrayList9;
                                                                                                                    aVar24 = aVar16;
                                                                                                                    if (arrayList16 != null) {
                                                                                                                    }
                                                                                                                    function0 = (Function0) objectRef16.element;
                                                                                                                    if (function0 != null) {
                                                                                                                    }
                                                                                                                    Unit unit222 = Unit.INSTANCE;
                                                                                                                    aVar24.g(null);
                                                                                                                    return Unit.INSTANCE;
                                                                                                                } catch (Throwable th11) {
                                                                                                                    th = th11;
                                                                                                                    obj2 = aVar7;
                                                                                                                    obj3 = null;
                                                                                                                    r22 = obj2;
                                                                                                                    r22.g(obj3);
                                                                                                                    throw th;
                                                                                                                }
                                                                                                            } catch (Throwable th12) {
                                                                                                                th = th12;
                                                                                                                obj2 = aVar9;
                                                                                                            }
                                                                                                        } catch (Throwable th13) {
                                                                                                            th = th13;
                                                                                                        }
                                                                                                    }
                                                                                                } catch (Throwable th14) {
                                                                                                    th = th14;
                                                                                                    obj2 = aVar24;
                                                                                                }
                                                                                                messageEntity7 = messageEntity4;
                                                                                            }
                                                                                            z21 = z25;
                                                                                        }
                                                                                        arrayList10 = arrayList8;
                                                                                        obj14 = obj13;
                                                                                        objectRef6 = objectRef14;
                                                                                        str4 = str10;
                                                                                        aVar8 = aVar15;
                                                                                        objectRef5 = objectRef13;
                                                                                        z14 = z24;
                                                                                        it2 = it5;
                                                                                        aVar23 = aVar14;
                                                                                        r32 = aVar23;
                                                                                        list4 = list9;
                                                                                        obj17 = obj14;
                                                                                        z13 = z21;
                                                                                        wmsConversationsEventsHandler$onBotMessages$14 = wmsConversationsEventsHandler$onBotMessages$12;
                                                                                        i11 = i14;
                                                                                        arrayList3 = arrayList10;
                                                                                        z10 = false;
                                                                                        if (it2.hasNext()) {
                                                                                        }
                                                                                    } catch (Throwable th15) {
                                                                                        th = th15;
                                                                                        obj2 = aVar19;
                                                                                        obj3 = null;
                                                                                        r22 = obj2;
                                                                                        r22.g(obj3);
                                                                                        throw th;
                                                                                    }
                                                                                    i14 = r2;
                                                                                    aVar19 = aVar10;
                                                                                } catch (Throwable th16) {
                                                                                    th = th16;
                                                                                    obj3 = obj12;
                                                                                    r22 = aVar13;
                                                                                    r22.g(obj3);
                                                                                    throw th;
                                                                                }
                                                                            } catch (Throwable th17) {
                                                                                th = th17;
                                                                                aVar19 = aVar10;
                                                                            }
                                                                            int i20 = i13;
                                                                        } catch (Throwable th18) {
                                                                            th = th18;
                                                                            aVar13 = aVar13;
                                                                            obj3 = obj12;
                                                                            r22 = aVar13;
                                                                            r22.g(obj3);
                                                                            throw th;
                                                                        }
                                                                        objectRef20 = objectRef10;
                                                                        z33 = z17;
                                                                        arrayList15 = arrayList7;
                                                                        map2 = map;
                                                                        messageEntity6 = messageEntity2;
                                                                        it7 = it3;
                                                                        objectRef21 = objectRef9;
                                                                        aVar21 = aVar11;
                                                                        wmsConversationsEventsHandler9 = wmsConversationsEventsHandler3;
                                                                        str16 = str8;
                                                                        objectRef22 = objectRef8;
                                                                        obj11 = obj10;
                                                                        wmsConversationsEventsHandler$onBotMessages$13 = wmsConversationsEventsHandler$onBotMessages$14;
                                                                        obj12 = null;
                                                                    } else {
                                                                        List list14 = list7;
                                                                        arrayList13 = arrayList7;
                                                                        objectRef19 = objectRef8;
                                                                        obj11 = obj10;
                                                                        wmsConversationsEventsHandler$onBotMessages$12 = wmsConversationsEventsHandler$onBotMessages$14;
                                                                        z29 = z16;
                                                                        objectRef4 = objectRef10;
                                                                        list8 = list14;
                                                                        z30 = z17;
                                                                        aVar20 = aVar13;
                                                                        obj15 = obj11;
                                                                        aVar18 = aVar11;
                                                                        wmsConversationsEventsHandler8 = wmsConversationsEventsHandler3;
                                                                        str14 = str8;
                                                                        objectRef18 = objectRef19;
                                                                        messageEntity5 = messageEntity2;
                                                                        it6 = it3;
                                                                        objectRef17 = objectRef9;
                                                                        arrayList12 = arrayList13;
                                                                        z27 = z30;
                                                                        map4 = map;
                                                                        z28 = z29;
                                                                        list9 = list8;
                                                                        aVar10 = aVar20;
                                                                        int i202 = i13;
                                                                        L10 = wmsConversationsEventsHandler8.L();
                                                                        chatId = messageEntity5.getChatId();
                                                                        messageId = messageEntity5.getMessageId();
                                                                        wmsConversationsEventsHandler$onBotMessages$12.f43002n = aVar10;
                                                                        wmsConversationsEventsHandler$onBotMessages$12.f43003o = list9;
                                                                        wmsConversationsEventsHandler$onBotMessages$12.f43004p = objectRef4;
                                                                        wmsConversationsEventsHandler$onBotMessages$12.f43005q = objectRef18;
                                                                        wmsConversationsEventsHandler$onBotMessages$12.f43006r = str14;
                                                                        Ref.ObjectRef objectRef242 = objectRef18;
                                                                        WmsConversationsEventsHandler wmsConversationsEventsHandler102 = wmsConversationsEventsHandler8;
                                                                        wmsConversationsEventsHandler$onBotMessages$12.f43007s = wmsConversationsEventsHandler102;
                                                                        wmsConversationsEventsHandler$onBotMessages$12.f43008t = aVar18;
                                                                        wmsConversationsEventsHandler$onBotMessages$12.f43009u = objectRef17;
                                                                        wmsConversationsEventsHandler$onBotMessages$12.f43010v = it6;
                                                                        wmsConversationsEventsHandler$onBotMessages$12.f43011w = messageEntity5;
                                                                        wmsConversationsEventsHandler$onBotMessages$12.f43012x = map4;
                                                                        wmsConversationsEventsHandler$onBotMessages$12.f43013y = arrayList12;
                                                                        wmsConversationsEventsHandler$onBotMessages$12.f42989A = z27;
                                                                        wmsConversationsEventsHandler$onBotMessages$12.f42990B = z28;
                                                                        wmsConversationsEventsHandler$onBotMessages$12.f42991C = i202;
                                                                        wmsConversationsEventsHandler$onBotMessages$12.f42992D = 7;
                                                                        i14 = i202;
                                                                        aVar19 = aVar10;
                                                                        obj16 = obj15;
                                                                        if (L10.W(chatId, messageId, null, wmsConversationsEventsHandler$onBotMessages$12) != obj16) {
                                                                        }
                                                                    }
                                                                } catch (Throwable th19) {
                                                                    th = th19;
                                                                    obj12 = null;
                                                                }
                                                                aVar13 = aVar10;
                                                            } catch (Throwable th20) {
                                                                th = th20;
                                                                obj3 = null;
                                                                r22 = aVar10;
                                                            }
                                                        } else {
                                                            i13 = i12;
                                                            boolean z40 = z14;
                                                            boolean z41 = z15;
                                                            boolean z42 = z10 ? 1 : 0;
                                                            List list15 = list4;
                                                            ArrayList arrayList23 = arrayList6;
                                                            wmsConversationsEventsHandler$onBotMessages$12 = wmsConversationsEventsHandler$onBotMessages$14;
                                                            aVar18 = aVar11;
                                                            str14 = str8;
                                                            objectRef18 = objectRef8;
                                                            obj15 = obj9;
                                                            objectRef4 = objectRef7;
                                                            messageEntity5 = messageEntity2;
                                                            objectRef17 = objectRef9;
                                                            z27 = z41;
                                                            map4 = map;
                                                            list9 = list15;
                                                            z28 = z40;
                                                            wmsConversationsEventsHandler8 = wmsConversationsEventsHandler3;
                                                            it6 = it3;
                                                            arrayList12 = arrayList23;
                                                            int i2022 = i13;
                                                            L10 = wmsConversationsEventsHandler8.L();
                                                            chatId = messageEntity5.getChatId();
                                                            messageId = messageEntity5.getMessageId();
                                                            wmsConversationsEventsHandler$onBotMessages$12.f43002n = aVar10;
                                                            wmsConversationsEventsHandler$onBotMessages$12.f43003o = list9;
                                                            wmsConversationsEventsHandler$onBotMessages$12.f43004p = objectRef4;
                                                            wmsConversationsEventsHandler$onBotMessages$12.f43005q = objectRef18;
                                                            wmsConversationsEventsHandler$onBotMessages$12.f43006r = str14;
                                                            Ref.ObjectRef objectRef2422 = objectRef18;
                                                            WmsConversationsEventsHandler wmsConversationsEventsHandler1022 = wmsConversationsEventsHandler8;
                                                            wmsConversationsEventsHandler$onBotMessages$12.f43007s = wmsConversationsEventsHandler1022;
                                                            wmsConversationsEventsHandler$onBotMessages$12.f43008t = aVar18;
                                                            wmsConversationsEventsHandler$onBotMessages$12.f43009u = objectRef17;
                                                            wmsConversationsEventsHandler$onBotMessages$12.f43010v = it6;
                                                            wmsConversationsEventsHandler$onBotMessages$12.f43011w = messageEntity5;
                                                            wmsConversationsEventsHandler$onBotMessages$12.f43012x = map4;
                                                            wmsConversationsEventsHandler$onBotMessages$12.f43013y = arrayList12;
                                                            wmsConversationsEventsHandler$onBotMessages$12.f42989A = z27;
                                                            wmsConversationsEventsHandler$onBotMessages$12.f42990B = z28;
                                                            wmsConversationsEventsHandler$onBotMessages$12.f42991C = i2022;
                                                            wmsConversationsEventsHandler$onBotMessages$12.f42992D = 7;
                                                            i14 = i2022;
                                                            aVar19 = aVar10;
                                                            obj16 = obj15;
                                                            if (L10.W(chatId, messageId, null, wmsConversationsEventsHandler$onBotMessages$12) != obj16) {
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable th21) {
                                                    th = th21;
                                                }
                                                aVar22 = r32;
                                            }
                                        } catch (Throwable th22) {
                                            th = th22;
                                            aVar22 = r32;
                                        }
                                        obj2 = aVar22;
                                    } catch (Throwable th23) {
                                        th = th23;
                                        aVar7 = a10;
                                    }
                                    obj3 = null;
                                    r22 = obj2;
                                    r22.g(obj3);
                                    throw th;
                                }
                            }
                        }
                        th = th8;
                        obj2 = aVar6;
                        obj3 = null;
                        r22 = obj2;
                        r22.g(obj3);
                        throw th;
                    }
                    str3 = "text";
                    objectRef6 = objectRef2;
                    objectRef4 = objectRef;
                    objectRef5 = objectRef3;
                    arrayList2 = null;
                    aVar3 = aVar;
                    str4 = str;
                    list4 = list;
                    wmsConversationsEventsHandler2 = wmsConversationsEventsHandler;
                    obj4 = coroutine_suspended;
                    if (arrayList2 != null) {
                    }
                    if (filterNotNull != null) {
                    }
                    if (z12) {
                    }
                    if (filterNotNull == null) {
                    }
                }
                return obj18;
            case 1:
                z10 = false;
                j10 = -1;
                boolean z43 = wmsConversationsEventsHandler$onBotMessages$14.f42990B;
                z12 = wmsConversationsEventsHandler$onBotMessages$14.f42989A;
                aVar = (Rf.a) wmsConversationsEventsHandler$onBotMessages$14.f43009u;
                intRef = (Ref.IntRef) wmsConversationsEventsHandler$onBotMessages$14.f43008t;
                wmsConversationsEventsHandler = (WmsConversationsEventsHandler) wmsConversationsEventsHandler$onBotMessages$14.f43007s;
                str = (String) wmsConversationsEventsHandler$onBotMessages$14.f43006r;
                objectRef2 = (Ref.ObjectRef) wmsConversationsEventsHandler$onBotMessages$14.f43005q;
                objectRef = (Ref.ObjectRef) wmsConversationsEventsHandler$onBotMessages$14.f43004p;
                List list16 = (List) wmsConversationsEventsHandler$onBotMessages$14.f43003o;
                Wh.a aVar29 = (Wh.a) wmsConversationsEventsHandler$onBotMessages$14.f43002n;
                ResultKt.throwOnFailure(obj);
                z11 = z43;
                a10 = aVar29;
                list = list16;
                objectRef3 = new Ref.ObjectRef();
                if (str == null) {
                    break;
                }
                if (list2 == null) {
                }
                break;
            case 2:
                z10 = false;
                j10 = -1;
                boolean z44 = wmsConversationsEventsHandler$onBotMessages$14.f42990B;
                z12 = wmsConversationsEventsHandler$onBotMessages$14.f42989A;
                MessageEntity messageEntity10 = (MessageEntity) wmsConversationsEventsHandler$onBotMessages$14.f43013y;
                collection = (Collection) wmsConversationsEventsHandler$onBotMessages$14.f43012x;
                it = (Iterator) wmsConversationsEventsHandler$onBotMessages$14.f43011w;
                ?? r92 = (Collection) wmsConversationsEventsHandler$onBotMessages$14.f43010v;
                objectRef5 = (Ref.ObjectRef) wmsConversationsEventsHandler$onBotMessages$14.f43009u;
                Rf.a aVar30 = (Rf.a) wmsConversationsEventsHandler$onBotMessages$14.f43008t;
                wmsConversationsEventsHandler2 = (WmsConversationsEventsHandler) wmsConversationsEventsHandler$onBotMessages$14.f43007s;
                str7 = (String) wmsConversationsEventsHandler$onBotMessages$14.f43006r;
                objectRef6 = (Ref.ObjectRef) wmsConversationsEventsHandler$onBotMessages$14.f43005q;
                objectRef4 = (Ref.ObjectRef) wmsConversationsEventsHandler$onBotMessages$14.f43004p;
                list3 = (List) wmsConversationsEventsHandler$onBotMessages$14.f43003o;
                a10 = (Wh.a) wmsConversationsEventsHandler$onBotMessages$14.f43002n;
                ResultKt.throwOnFailure(obj);
                messageEntity = messageEntity10;
                arrayList = r92;
                aVar3 = aVar30;
                z11 = z44;
                str6 = "text";
                K10 = obj;
                obj7 = coroutine_suspended;
                aVar2 = a10;
                collection.add(Intrinsics.areEqual(((C5582a) K10).b(), Boxing.boxBoolean(true)) ? null : (messageEntity.getTime().getPreviousMessageTime() == j10 && (salesIQChat = (SalesIQChat) objectRef5.element) != null && salesIQChat.getStatus() == 2) ? messageEntity : MessageEntity.copy$default(messageEntity, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, Boxing.boxBoolean(z10), null, null, null, null, false, null, null, 133693439, null));
                str2 = str7;
                str17 = str6;
                obj5 = obj7;
                aVar5 = aVar2;
                if (it.hasNext()) {
                }
                th = th8;
                obj2 = aVar6;
                obj3 = null;
                r22 = obj2;
                r22.g(obj3);
                throw th;
            case 3:
                z10 = false;
                boolean z45 = wmsConversationsEventsHandler$onBotMessages$14.f42990B;
                z12 = wmsConversationsEventsHandler$onBotMessages$14.f42989A;
                ?? r72 = (List) wmsConversationsEventsHandler$onBotMessages$14.f43011w;
                list5 = (List) wmsConversationsEventsHandler$onBotMessages$14.f43010v;
                objectRef5 = (Ref.ObjectRef) wmsConversationsEventsHandler$onBotMessages$14.f43009u;
                Rf.a aVar31 = (Rf.a) wmsConversationsEventsHandler$onBotMessages$14.f43008t;
                wmsConversationsEventsHandler2 = (WmsConversationsEventsHandler) wmsConversationsEventsHandler$onBotMessages$14.f43007s;
                str4 = (String) wmsConversationsEventsHandler$onBotMessages$14.f43006r;
                objectRef6 = (Ref.ObjectRef) wmsConversationsEventsHandler$onBotMessages$14.f43005q;
                objectRef4 = (Ref.ObjectRef) wmsConversationsEventsHandler$onBotMessages$14.f43004p;
                j10 = -1;
                list4 = (List) wmsConversationsEventsHandler$onBotMessages$14.f43003o;
                Wh.a aVar32 = (Wh.a) wmsConversationsEventsHandler$onBotMessages$14.f43002n;
                try {
                    ResultKt.throwOnFailure(obj);
                    z11 = z45;
                    a10 = aVar32;
                    aVar4 = aVar31;
                    str3 = "text";
                    arrayList2 = r72;
                    J10 = obj;
                    obj4 = coroutine_suspended;
                    List list122 = list5;
                    aVar3 = aVar4;
                    filterNotNull = list122;
                    if (z12) {
                    }
                    if (filterNotNull == null) {
                    }
                } catch (Throwable th24) {
                    th = th24;
                    obj2 = aVar32;
                    break;
                }
                break;
            case 4:
                z10 = false;
                int i21 = wmsConversationsEventsHandler$onBotMessages$14.f42991C;
                z14 = wmsConversationsEventsHandler$onBotMessages$14.f42990B;
                boolean z46 = wmsConversationsEventsHandler$onBotMessages$14.f42989A;
                ?? r62 = (List) wmsConversationsEventsHandler$onBotMessages$14.f43013y;
                Map map6 = (Map) wmsConversationsEventsHandler$onBotMessages$14.f43012x;
                MessageEntity messageEntity11 = (MessageEntity) wmsConversationsEventsHandler$onBotMessages$14.f43011w;
                Iterator it9 = (Iterator) wmsConversationsEventsHandler$onBotMessages$14.f43010v;
                Ref.ObjectRef objectRef25 = (Ref.ObjectRef) wmsConversationsEventsHandler$onBotMessages$14.f43009u;
                Rf.a aVar33 = (Rf.a) wmsConversationsEventsHandler$onBotMessages$14.f43008t;
                WmsConversationsEventsHandler wmsConversationsEventsHandler11 = (WmsConversationsEventsHandler) wmsConversationsEventsHandler$onBotMessages$14.f43007s;
                String str21 = (String) wmsConversationsEventsHandler$onBotMessages$14.f43006r;
                Ref.ObjectRef objectRef26 = (Ref.ObjectRef) wmsConversationsEventsHandler$onBotMessages$14.f43005q;
                Ref.ObjectRef objectRef27 = (Ref.ObjectRef) wmsConversationsEventsHandler$onBotMessages$14.f43004p;
                List list17 = (List) wmsConversationsEventsHandler$onBotMessages$14.f43003o;
                aVar10 = (Wh.a) wmsConversationsEventsHandler$onBotMessages$14.f43002n;
                ResultKt.throwOnFailure(obj);
                str3 = "text";
                obj9 = coroutine_suspended;
                objectRef7 = objectRef27;
                i12 = i21;
                objectRef8 = objectRef26;
                str8 = str21;
                wmsConversationsEventsHandler3 = wmsConversationsEventsHandler11;
                aVar11 = aVar33;
                objectRef9 = objectRef25;
                it3 = it9;
                messageEntity2 = messageEntity11;
                map = map6;
                arrayList6 = r62;
                z15 = z46;
                list4 = list17;
                if (z14) {
                }
                break;
            case 5:
                z10 = false;
                int i22 = wmsConversationsEventsHandler$onBotMessages$14.f42991C;
                z16 = wmsConversationsEventsHandler$onBotMessages$14.f42990B;
                z17 = wmsConversationsEventsHandler$onBotMessages$14.f42989A;
                ?? r63 = (List) wmsConversationsEventsHandler$onBotMessages$14.f43013y;
                Map map7 = (Map) wmsConversationsEventsHandler$onBotMessages$14.f43012x;
                MessageEntity messageEntity12 = (MessageEntity) wmsConversationsEventsHandler$onBotMessages$14.f43011w;
                Iterator it10 = (Iterator) wmsConversationsEventsHandler$onBotMessages$14.f43010v;
                Ref.ObjectRef objectRef28 = (Ref.ObjectRef) wmsConversationsEventsHandler$onBotMessages$14.f43009u;
                Rf.a aVar34 = (Rf.a) wmsConversationsEventsHandler$onBotMessages$14.f43008t;
                WmsConversationsEventsHandler wmsConversationsEventsHandler12 = (WmsConversationsEventsHandler) wmsConversationsEventsHandler$onBotMessages$14.f43007s;
                String str22 = (String) wmsConversationsEventsHandler$onBotMessages$14.f43006r;
                Ref.ObjectRef objectRef29 = (Ref.ObjectRef) wmsConversationsEventsHandler$onBotMessages$14.f43005q;
                Ref.ObjectRef objectRef30 = (Ref.ObjectRef) wmsConversationsEventsHandler$onBotMessages$14.f43004p;
                i13 = i22;
                List list18 = (List) wmsConversationsEventsHandler$onBotMessages$14.f43003o;
                aVar10 = (Wh.a) wmsConversationsEventsHandler$onBotMessages$14.f43002n;
                ResultKt.throwOnFailure(obj);
                arrayList7 = r63;
                objectRef10 = objectRef30;
                objectRef8 = objectRef29;
                str8 = str22;
                wmsConversationsEventsHandler3 = wmsConversationsEventsHandler12;
                aVar11 = aVar34;
                objectRef9 = objectRef28;
                it3 = it10;
                messageEntity2 = messageEntity12;
                map = map7;
                str3 = "text";
                obj10 = coroutine_suspended;
                list7 = list18;
                aVar13 = aVar10;
                str15 = (String) objectRef8.element;
                if (str15 == null) {
                }
                break;
            case 6:
                int i23 = wmsConversationsEventsHandler$onBotMessages$14.f42991C;
                boolean z47 = wmsConversationsEventsHandler$onBotMessages$14.f42990B;
                boolean z48 = wmsConversationsEventsHandler$onBotMessages$14.f42989A;
                ?? r64 = (List) wmsConversationsEventsHandler$onBotMessages$14.f43013y;
                Map map8 = (Map) wmsConversationsEventsHandler$onBotMessages$14.f43012x;
                messageEntity3 = (MessageEntity) wmsConversationsEventsHandler$onBotMessages$14.f43011w;
                it4 = (Iterator) wmsConversationsEventsHandler$onBotMessages$14.f43010v;
                objectRef11 = (Ref.ObjectRef) wmsConversationsEventsHandler$onBotMessages$14.f43009u;
                aVar12 = (Rf.a) wmsConversationsEventsHandler$onBotMessages$14.f43008t;
                wmsConversationsEventsHandler4 = (WmsConversationsEventsHandler) wmsConversationsEventsHandler$onBotMessages$14.f43007s;
                str9 = (String) wmsConversationsEventsHandler$onBotMessages$14.f43006r;
                objectRef12 = (Ref.ObjectRef) wmsConversationsEventsHandler$onBotMessages$14.f43005q;
                objectRef4 = (Ref.ObjectRef) wmsConversationsEventsHandler$onBotMessages$14.f43004p;
                i13 = i23;
                List list19 = (List) wmsConversationsEventsHandler$onBotMessages$14.f43003o;
                Wh.a aVar35 = (Wh.a) wmsConversationsEventsHandler$onBotMessages$14.f43002n;
                ResultKt.throwOnFailure(obj);
                str3 = "text";
                obj11 = coroutine_suspended;
                aVar13 = aVar35;
                z18 = z47;
                map2 = map8;
                z19 = false;
                list8 = list19;
                wmsConversationsEventsHandler$onBotMessages$12 = wmsConversationsEventsHandler$onBotMessages$14;
                z20 = z48;
                obj12 = null;
                arrayList14 = r64;
                j.s0(z19, 1, obj12);
                Unit unit32 = Unit.INSTANCE;
                z29 = z18;
                arrayList13 = arrayList14;
                objectRef19 = objectRef12;
                z30 = z20;
                str8 = str9;
                wmsConversationsEventsHandler3 = wmsConversationsEventsHandler4;
                aVar11 = aVar12;
                objectRef9 = objectRef11;
                it3 = it4;
                messageEntity2 = messageEntity3;
                map = map2;
                aVar20 = aVar13;
                obj15 = obj11;
                aVar18 = aVar11;
                wmsConversationsEventsHandler8 = wmsConversationsEventsHandler3;
                str14 = str8;
                objectRef18 = objectRef19;
                messageEntity5 = messageEntity2;
                it6 = it3;
                objectRef17 = objectRef9;
                arrayList12 = arrayList13;
                z27 = z30;
                map4 = map;
                z28 = z29;
                list9 = list8;
                aVar10 = aVar20;
                int i20222 = i13;
                L10 = wmsConversationsEventsHandler8.L();
                chatId = messageEntity5.getChatId();
                messageId = messageEntity5.getMessageId();
                wmsConversationsEventsHandler$onBotMessages$12.f43002n = aVar10;
                wmsConversationsEventsHandler$onBotMessages$12.f43003o = list9;
                wmsConversationsEventsHandler$onBotMessages$12.f43004p = objectRef4;
                wmsConversationsEventsHandler$onBotMessages$12.f43005q = objectRef18;
                wmsConversationsEventsHandler$onBotMessages$12.f43006r = str14;
                Ref.ObjectRef objectRef24222 = objectRef18;
                WmsConversationsEventsHandler wmsConversationsEventsHandler10222 = wmsConversationsEventsHandler8;
                wmsConversationsEventsHandler$onBotMessages$12.f43007s = wmsConversationsEventsHandler10222;
                wmsConversationsEventsHandler$onBotMessages$12.f43008t = aVar18;
                wmsConversationsEventsHandler$onBotMessages$12.f43009u = objectRef17;
                wmsConversationsEventsHandler$onBotMessages$12.f43010v = it6;
                wmsConversationsEventsHandler$onBotMessages$12.f43011w = messageEntity5;
                wmsConversationsEventsHandler$onBotMessages$12.f43012x = map4;
                wmsConversationsEventsHandler$onBotMessages$12.f43013y = arrayList12;
                wmsConversationsEventsHandler$onBotMessages$12.f42989A = z27;
                wmsConversationsEventsHandler$onBotMessages$12.f42990B = z28;
                wmsConversationsEventsHandler$onBotMessages$12.f42991C = i20222;
                wmsConversationsEventsHandler$onBotMessages$12.f42992D = 7;
                i14 = i20222;
                aVar19 = aVar10;
                obj16 = obj15;
                if (L10.W(chatId, messageId, null, wmsConversationsEventsHandler$onBotMessages$12) != obj16) {
                }
                break;
            case 7:
                int i24 = wmsConversationsEventsHandler$onBotMessages$14.f42991C;
                boolean z49 = wmsConversationsEventsHandler$onBotMessages$14.f42990B;
                boolean z50 = wmsConversationsEventsHandler$onBotMessages$14.f42989A;
                ?? r65 = (List) wmsConversationsEventsHandler$onBotMessages$14.f43013y;
                Map map9 = (Map) wmsConversationsEventsHandler$onBotMessages$14.f43012x;
                MessageEntity messageEntity13 = (MessageEntity) wmsConversationsEventsHandler$onBotMessages$14.f43011w;
                Iterator it11 = (Iterator) wmsConversationsEventsHandler$onBotMessages$14.f43010v;
                Ref.ObjectRef objectRef31 = (Ref.ObjectRef) wmsConversationsEventsHandler$onBotMessages$14.f43009u;
                Rf.a aVar36 = (Rf.a) wmsConversationsEventsHandler$onBotMessages$14.f43008t;
                wmsConversationsEventsHandler2 = (WmsConversationsEventsHandler) wmsConversationsEventsHandler$onBotMessages$14.f43007s;
                String str23 = (String) wmsConversationsEventsHandler$onBotMessages$14.f43006r;
                Ref.ObjectRef objectRef32 = (Ref.ObjectRef) wmsConversationsEventsHandler$onBotMessages$14.f43005q;
                objectRef4 = (Ref.ObjectRef) wmsConversationsEventsHandler$onBotMessages$14.f43004p;
                List list20 = (List) wmsConversationsEventsHandler$onBotMessages$14.f43003o;
                Wh.a aVar37 = (Wh.a) wmsConversationsEventsHandler$onBotMessages$14.f43002n;
                ResultKt.throwOnFailure(obj);
                str3 = "text";
                obj13 = coroutine_suspended;
                aVar14 = aVar37;
                arrayList8 = r65;
                i14 = i24;
                z21 = z50;
                z22 = z49;
                aVar15 = aVar36;
                str10 = str23;
                map3 = map9;
                wmsConversationsEventsHandler$onBotMessages$12 = wmsConversationsEventsHandler$onBotMessages$14;
                it5 = it11;
                objectRef13 = objectRef31;
                objectRef14 = objectRef32;
                messageEntity4 = messageEntity13;
                list9 = list20;
                message = messageEntity4.getMessage();
                if (message == null) {
                }
                if (aVar15 != Rf.a.Clicked) {
                }
                arrayList10 = arrayList8;
                obj14 = obj13;
                objectRef6 = objectRef14;
                str4 = str10;
                aVar8 = aVar15;
                objectRef5 = objectRef13;
                z14 = z24;
                it2 = it5;
                aVar23 = aVar14;
                r32 = aVar23;
                list4 = list9;
                obj17 = obj14;
                z13 = z21;
                wmsConversationsEventsHandler$onBotMessages$14 = wmsConversationsEventsHandler$onBotMessages$12;
                i11 = i14;
                arrayList3 = arrayList10;
                z10 = false;
                if (it2.hasNext()) {
                }
                obj2 = aVar22;
                obj3 = null;
                r22 = obj2;
                r22.g(obj3);
                throw th;
            case 8:
                int i25 = wmsConversationsEventsHandler$onBotMessages$14.f42991C;
                z26 = wmsConversationsEventsHandler$onBotMessages$14.f42990B;
                z21 = wmsConversationsEventsHandler$onBotMessages$14.f42989A;
                String str24 = (String) wmsConversationsEventsHandler$onBotMessages$14.f43014z;
                ?? r12 = (List) wmsConversationsEventsHandler$onBotMessages$14.f43013y;
                map3 = (Map) wmsConversationsEventsHandler$onBotMessages$14.f43012x;
                messageEntity4 = (MessageEntity) wmsConversationsEventsHandler$onBotMessages$14.f43011w;
                Iterator it12 = (Iterator) wmsConversationsEventsHandler$onBotMessages$14.f43010v;
                objectRef13 = (Ref.ObjectRef) wmsConversationsEventsHandler$onBotMessages$14.f43009u;
                aVar15 = (Rf.a) wmsConversationsEventsHandler$onBotMessages$14.f43008t;
                WmsConversationsEventsHandler wmsConversationsEventsHandler13 = (WmsConversationsEventsHandler) wmsConversationsEventsHandler$onBotMessages$14.f43007s;
                str10 = (String) wmsConversationsEventsHandler$onBotMessages$14.f43006r;
                objectRef14 = (Ref.ObjectRef) wmsConversationsEventsHandler$onBotMessages$14.f43005q;
                Ref.ObjectRef objectRef33 = (Ref.ObjectRef) wmsConversationsEventsHandler$onBotMessages$14.f43004p;
                List list21 = (List) wmsConversationsEventsHandler$onBotMessages$14.f43003o;
                Wh.a aVar38 = (Wh.a) wmsConversationsEventsHandler$onBotMessages$14.f43002n;
                ResultKt.throwOnFailure(obj);
                str3 = "text";
                obj14 = coroutine_suspended;
                aVar24 = aVar38;
                wmsConversationsEventsHandler7 = wmsConversationsEventsHandler13;
                str13 = str24;
                i14 = i25;
                list9 = list21;
                C10 = obj;
                wmsConversationsEventsHandler$onBotMessages$12 = wmsConversationsEventsHandler$onBotMessages$14;
                it5 = it12;
                objectRef4 = objectRef33;
                arrayList11 = r12;
                messageEntity7 = messageEntity4;
                if (((Boolean) C10).booleanValue()) {
                    break;
                }
                it8 = it5;
                objectRef6 = objectRef14;
                str4 = str10;
                arrayList10 = arrayList11;
                wmsConversationsEventsHandler2 = wmsConversationsEventsHandler7;
                aVar8 = aVar15;
                z14 = z26;
                objectRef5 = objectRef13;
                it2 = it8;
                aVar23 = aVar24;
                r32 = aVar23;
                list4 = list9;
                obj17 = obj14;
                z13 = z21;
                wmsConversationsEventsHandler$onBotMessages$14 = wmsConversationsEventsHandler$onBotMessages$12;
                i11 = i14;
                arrayList3 = arrayList10;
                z10 = false;
                if (it2.hasNext()) {
                }
                obj2 = aVar22;
                obj3 = null;
                r22 = obj2;
                r22.g(obj3);
                throw th;
            case 9:
                ?? r02 = (List) wmsConversationsEventsHandler$onBotMessages$14.f43005q;
                wmsConversationsEventsHandler6 = (WmsConversationsEventsHandler) wmsConversationsEventsHandler$onBotMessages$14.f43004p;
                objectRef16 = (Ref.ObjectRef) wmsConversationsEventsHandler$onBotMessages$14.f43003o;
                Wh.a aVar39 = (Wh.a) wmsConversationsEventsHandler$onBotMessages$14.f43002n;
                try {
                    ResultKt.throwOnFailure(obj);
                    arrayList9 = r02;
                    wmsConversationsEventsHandler$onBotMessages$1 = wmsConversationsEventsHandler$onBotMessages$14;
                    obj8 = coroutine_suspended;
                    aVar17 = aVar39;
                    z23 = false;
                    j.s0(z23, 1, null);
                    aVar16 = aVar17;
                    arrayList16 = arrayList9;
                    aVar24 = aVar16;
                    if (arrayList16 != null) {
                    }
                    function0 = (Function0) objectRef16.element;
                    if (function0 != null) {
                    }
                    Unit unit2222 = Unit.INSTANCE;
                    aVar24.g(null);
                    return Unit.INSTANCE;
                } catch (Throwable th25) {
                    th = th25;
                    obj2 = aVar39;
                    break;
                }
            case 10:
                objectRef23 = (Ref.ObjectRef) wmsConversationsEventsHandler$onBotMessages$14.f43003o;
                Wh.a aVar40 = (Wh.a) wmsConversationsEventsHandler$onBotMessages$14.f43002n;
                ResultKt.throwOnFailure(obj);
                aVar25 = aVar40;
                Unit unit52 = Unit.INSTANCE;
                objectRef16 = objectRef23;
                aVar24 = aVar25;
                function0 = (Function0) objectRef16.element;
                if (function0 != null) {
                }
                Unit unit22222 = Unit.INSTANCE;
                aVar24.g(null);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
