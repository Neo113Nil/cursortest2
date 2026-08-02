package com.vk.im.engine.internal.api_commands.diff;

import com.vk.dto.attaches.Attach;
import com.vk.im.engine.internal.api_commands.diff.MessagesGetDiffContentApiCmd;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.messages.NestedMsg;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.bh30;
import xsna.gtx0;
import xsna.w04;
import xsna.wzs;

/* compiled from: MessagesGetDiffContentApiCmd.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class a extends FunctionReferenceImpl implements wzs<MessagesGetDiffContentApiCmd.b, ProfilesSimpleInfo, MessagesGetDiffContentApiCmd.b> {
    @Override // xsna.wzs
    public final MessagesGetDiffContentApiCmd.b invoke(MessagesGetDiffContentApiCmd.b bVar, ProfilesSimpleInfo profilesSimpleInfo) {
        MessagesGetDiffContentApiCmd.b bVar2 = bVar;
        ProfilesSimpleInfo profilesSimpleInfo2 = profilesSimpleInfo;
        ((MessagesGetDiffContentApiCmd) this.receiver).getClass();
        List<MessagesGetDiffContentApiCmd.a> list = bVar2.a;
        for (MessagesGetDiffContentApiCmd.a aVar : list) {
            for (gtx0 gtx0Var : aVar.b) {
                if (!profilesSimpleInfo2.isEmpty() && (gtx0Var instanceof com.vk.im.engine.models.messages.a)) {
                    com.vk.im.engine.models.messages.a aVar2 = (com.vk.im.engine.models.messages.a) gtx0Var;
                    Iterator<T> it = aVar2.K0().iterator();
                    while (it.hasNext()) {
                        w04.b((Attach) it.next(), profilesSimpleInfo2);
                    }
                    Iterator<T> it2 = aVar2.q7().iterator();
                    while (it2.hasNext()) {
                        bh30.c((NestedMsg) it2.next(), profilesSimpleInfo2);
                    }
                }
            }
            Iterator<T> it3 = aVar.d.iterator();
            while (it3.hasNext()) {
                for (gtx0 gtx0Var2 : (List) it3.next()) {
                    if (!profilesSimpleInfo2.isEmpty() && (gtx0Var2 instanceof com.vk.im.engine.models.messages.a)) {
                        com.vk.im.engine.models.messages.a aVar3 = (com.vk.im.engine.models.messages.a) gtx0Var2;
                        Iterator<T> it4 = aVar3.K0().iterator();
                        while (it4.hasNext()) {
                            w04.b((Attach) it4.next(), profilesSimpleInfo2);
                        }
                        Iterator<T> it5 = aVar3.q7().iterator();
                        while (it5.hasNext()) {
                            bh30.c((NestedMsg) it5.next(), profilesSimpleInfo2);
                        }
                    }
                }
            }
            for (gtx0 gtx0Var3 : aVar.b) {
                if (!profilesSimpleInfo2.isEmpty() && (gtx0Var3 instanceof com.vk.im.engine.models.messages.a)) {
                    com.vk.im.engine.models.messages.a aVar4 = (com.vk.im.engine.models.messages.a) gtx0Var3;
                    Iterator<T> it6 = aVar4.K0().iterator();
                    while (it6.hasNext()) {
                        w04.b((Attach) it6.next(), profilesSimpleInfo2);
                    }
                    Iterator<T> it7 = aVar4.q7().iterator();
                    while (it7.hasNext()) {
                        bh30.c((NestedMsg) it7.next(), profilesSimpleInfo2);
                    }
                }
            }
        }
        return new MessagesGetDiffContentApiCmd.b(list, bVar2.b.Ib(profilesSimpleInfo2), bVar2.c);
    }
}
