package com.vk.im.engine.commands.messages;

import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachWithTranscription;
import com.vk.dto.common.id.UserId;
import com.vk.dto.messages.MsgSyncState;
import com.vk.im.engine.exceptions.MsgNotFoundException;
import com.vk.im.engine.internal.merge.messages.WeightStrategy;
import com.vk.im.engine.models.attaches.AttachLink;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.toggle.features.ComFeatures;
import com.vkontakte.android.data.groups.FullSourceJoinApi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.drm0;
import xsna.fkq0;
import xsna.gqu;
import xsna.izs;
import xsna.kwm0;
import xsna.oj30;
import xsna.rsg0;
import xsna.rwv;
import xsna.w2w;
import xsna.xqu;
import xsna.yfb;
import xsna.zlm0;
import xsna.zm00;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements izs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ c(UserId userId, boolean z, String str, String str2, kwm0 kwm0Var, FullSourceJoinApi fullSourceJoinApi) {
        this.d = userId;
        this.c = z;
        this.e = str;
        this.f = str2;
        this.g = kwm0Var;
        this.h = fullSourceJoinApi;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fe  */
    /* JADX WARN: Type inference failed for: r4v3, types: [T, com.vk.im.engine.models.messages.Msg, com.vk.im.engine.models.messages.MsgFromUser, com.vk.im.engine.models.messages.a] */
    /* JADX WARN: Type inference failed for: r6v5, types: [T, com.vk.im.engine.models.messages.MsgFromUser] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        boolean z;
        ?? r4;
        rsg0 rsg0Var;
        switch (this.b) {
            case 0:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.d;
                d dVar = (d) this.e;
                w2w w2wVar = (w2w) this.f;
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) this.g;
                ArrayList arrayList = (ArrayList) this.h;
                ?? r6 = (MsgFromUser) w2wVar.I0().o().L(dVar.c);
                if (r6 == 0) {
                    throw new MsgNotFoundException("Can't find msg for edit", null);
                }
                ref$ObjectRef.element = r6;
                List<Attach> list = dVar.h;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (((Attach) it.next()) instanceof AttachLink) {
                            z = true;
                            ref$BooleanRef.element = z;
                            r4 = (MsgFromUser) ref$ObjectRef.element;
                            String str = dVar.d;
                            r4.o = MsgSyncState.EDITING;
                            if (r4.da()) {
                                r4.F = drm0.p0(str).toString();
                                r4.G = dVar.e;
                            } else {
                                AttachWithTranscription bc = r4.bc();
                                if (bc != null) {
                                    bc.ya(str);
                                }
                            }
                            ArrayList arrayList2 = r4.H;
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            rwv.b(arrayList, linkedHashMap, false);
                            rwv.b(arrayList2, linkedHashMap, true);
                            r4.H = new ArrayList(linkedHashMap.values());
                            r4.l = r4.Mb();
                            r4.I = !this.c ? r4.I : new ArrayList<>();
                            ref$ObjectRef.element = r4;
                            return !r4.H6() ? (List) new oj30((Msg) ref$ObjectRef.element, WeightStrategy.FORCE_LATEST).o(w2wVar) : (List) new com.vk.im.engine.internal.merge.messages.b((Msg) ref$ObjectRef.element).o(w2wVar);
                        }
                    }
                }
                z = false;
                ref$BooleanRef.element = z;
                r4 = (MsgFromUser) ref$ObjectRef.element;
                String str2 = dVar.d;
                r4.o = MsgSyncState.EDITING;
                if (r4.da()) {
                }
                ArrayList arrayList22 = r4.H;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                rwv.b(arrayList, linkedHashMap2, false);
                rwv.b(arrayList22, linkedHashMap2, true);
                r4.H = new ArrayList(linkedHashMap2.values());
                r4.l = r4.Mb();
                r4.I = !this.c ? r4.I : new ArrayList<>();
                ref$ObjectRef.element = r4;
                if (!r4.H6()) {
                }
                break;
            default:
                UserId userId = (UserId) this.d;
                String str3 = (String) this.e;
                String str4 = (String) this.f;
                boolean z2 = ((kwm0) this.g).b;
                FullSourceJoinApi fullSourceJoinApi = (FullSourceJoinApi) this.h;
                ComFeatures comFeatures = ComFeatures.COM_CODEGEN_GROUPS_JOIN;
                comFeatures.getClass();
                boolean a = com.vk.toggle.b.A.a(comFeatures);
                boolean z3 = this.c;
                if (a) {
                    rsg0Var = yfb.y(xqu.a.c((240 & 2) != 0 ? null : zm00.g(z3), (240 & 4) != 0 ? null : str3, (240 & 8) != 0 ? null : str4, null, fkq0.a(userId), null, null, (240 & 256) != 0 ? null : (!z2 || fullSourceJoinApi == null) ? null : fullSourceJoinApi.a()), new zlm0(1));
                } else {
                    gqu gquVar = new gqu(userId, z3, z2, 60);
                    gquVar.P0(str3);
                    gquVar.N0(fullSourceJoinApi);
                    gquVar.U0(str4);
                    rsg0Var = gquVar;
                }
                return rsg0.y0(rsg0Var, null, null, 3);
        }
    }

    public /* synthetic */ c(Ref$ObjectRef ref$ObjectRef, d dVar, w2w w2wVar, Ref$BooleanRef ref$BooleanRef, ArrayList arrayList, boolean z) {
        this.d = ref$ObjectRef;
        this.e = dVar;
        this.f = w2wVar;
        this.g = ref$BooleanRef;
        this.h = arrayList;
        this.c = z;
    }
}
