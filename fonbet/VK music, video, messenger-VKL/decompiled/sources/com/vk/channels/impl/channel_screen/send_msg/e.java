package com.vk.channels.impl.channel_screen.send_msg;

import android.content.Context;
import com.ironsource.C4572u;
import com.vk.api.generated.market.dto.MarketCheckoutSettingsDto;
import com.vk.api.generated.market.dto.MarketCheckoutSettingsSectionDto;
import com.vk.api.generated.market.dto.MarketGeoSuggestResponseDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.Peer;
import com.vk.dto.newsfeed.PostDonut;
import com.vk.ecomm.cart.impl.checkout.feature.state.f;
import com.vk.im.engine.commands.channels.ChannelMsgSendConfig;
import com.vk.im.engine.models.attaches.AttachComments;
import com.vk.im.engine.models.attaches.AttachQuestion;
import com.vk.im.engine.models.attaches.AuthorAd;
import com.vk.im.engine.models.messages.CnvMsgId;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.log.L;
import com.vk.newsfeed.posting.crop_editor.presentation.base.fragment.CropEditorFragment;
import com.vk.newsfeed.posting.impl.presentation.base.view.PostingContentView;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PostAttachment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.a080;
import xsna.b7r;
import xsna.c5g;
import xsna.cew;
import xsna.e3a;
import xsna.izs;
import xsna.j5g;
import xsna.npr0;
import xsna.oba;
import xsna.ofk;
import xsna.q0c;
import xsna.qpr0;
import xsna.r0c;
import xsna.s3q0;
import xsna.t140;
import xsna.u40;
import xsna.u4c;
import xsna.vgg;
import xsna.wbu0;
import xsna.wdw;
import xsna.wpc0;
import xsna.wpr0;
import xsna.x1s;
import xsna.x65;
import xsna.xj20;
import xsna.xn50;
import xsna.y1s;

/* compiled from: ChannelMsgSendVc.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class e extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v0, types: [com.vk.im.engine.models.ProfilesSimpleInfo] */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.vk.channels.impl.channel_screen.send_msg.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [com.vk.im.engine.models.messages.Msg] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.util.List<com.vk.dto.common.Attachment>] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Integer num;
        boolean z;
        Object obj2;
        ?? r6;
        AuthorAd authorAd;
        boolean z2 = false;
        switch (this.b) {
            case 0:
                t140 t140Var = (t140) obj;
                ?? r4 = (a) this.receiver;
                r4.getClass();
                ?? r5 = (Msg) j5g.X(t140Var.a.c.values());
                t140Var.b.Ob();
                r4.y();
                if (r5 instanceof MsgFromChannel) {
                    MsgFromChannel msgFromChannel = (MsgFromChannel) r5;
                    r4.q = msgFromChannel;
                    Date date = r4.i ? new Date(msgFromChannel.I.s) : null;
                    MsgFromChannel.b bVar = msgFromChannel.I;
                    AttachComments attachComments = bVar.l;
                    if (attachComments == null || !attachComments.f) {
                        num = null;
                        z = false;
                    } else {
                        num = null;
                        z = true;
                    }
                    Peer peer = bVar.m;
                    peer.getClass();
                    boolean z3 = !peer.Ab(Peer.Type.UNKNOWN);
                    MsgFromChannel.b bVar2 = msgFromChannel.I;
                    PostDonut postDonut = bVar2.g;
                    Integer num2 = postDonut != null ? postDonut.d : num;
                    boolean z4 = bVar2.n;
                    Object obj3 = (!z4 || (authorAd = bVar2.h) == null) ? num : authorAd.c;
                    Boolean valueOf = Boolean.valueOf(z4);
                    cew.b.getClass();
                    ?? r14 = num;
                    r4.p = new ChannelMsgSendConfig(date, z, false, z3, false, num2, obj3, null, false, valueOf, false, cew.i(), false, msgFromChannel.I.z, null, 21908, null);
                    WriteBar writeBar = r4.x;
                    if (writeBar == null) {
                        writeBar = r14;
                    }
                    writeBar.setDonutPhotos(msgFromChannel.I.z);
                    r4.r = r4.p;
                    if (msgFromChannel.da()) {
                        r4.M(r5, msgFromChannel.ec());
                    } else {
                        com.vk.im.engine.models.messages.a aVar = (com.vk.im.engine.models.messages.a) r5;
                        CharSequence a = r4.m.a(aVar.getBody(), aVar.a4());
                        List<Attach> K0 = aVar.K0();
                        ArrayList arrayList = new ArrayList();
                        Iterator it = K0.iterator();
                        while (it.hasNext()) {
                            Attachment b = wdw.b((Attach) it.next(), r14, false, 6);
                            if (b != null) {
                                arrayList.add(b);
                            }
                        }
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj2 = it2.next();
                                if (obj2 instanceof PostAttachment) {
                                }
                            } else {
                                obj2 = r14;
                            }
                        }
                        if (!(obj2 instanceof PostAttachment)) {
                            obj2 = r14;
                        }
                        PostAttachment postAttachment = (PostAttachment) obj2;
                        if (postAttachment != null && (r6 = postAttachment.k) != 0) {
                            arrayList = r6;
                        }
                        ArrayList<NestedMsg> X1 = aVar.X1();
                        ArrayList arrayList2 = new ArrayList(c5g.u(X1, 10));
                        for (NestedMsg nestedMsg : X1) {
                            arrayList2.add(new CnvMsgId(nestedMsg.e, nestedMsg.d));
                        }
                        r4.N(a, arrayList, arrayList2);
                        WriteBar writeBar2 = r4.x;
                        if (writeBar2 == null) {
                            writeBar2 = r14;
                        }
                        List<Attach> K02 = aVar.K0();
                        if (!(K02 instanceof Collection) || !K02.isEmpty()) {
                            Iterator it3 = K02.iterator();
                            while (it3.hasNext()) {
                                if (((Attach) it3.next()) instanceof AttachQuestion) {
                                    writeBar2.setAddAttachAllowed(z2);
                                }
                            }
                        }
                        z2 = true;
                        writeBar2.setAddAttachAllowed(z2);
                    }
                }
                break;
            case 1:
                ((com.vk.metrics.eventtracking.b) this.receiver).a((Throwable) obj);
                break;
            case 2:
                ((e3a) this.receiver).getClass();
                break;
            case 3:
                oba obaVar = (oba) this.receiver;
                obaVar.getClass();
                xn50.a.c(obaVar, (a080) obj);
                break;
            case 4:
                L.i((Throwable) obj);
                break;
            case 5:
                vgg vggVar = (vgg) obj;
                r0c r0cVar = (r0c) this.receiver;
                xj20 xj20Var = r0cVar.Q;
                Context context = r0cVar.b;
                r0cVar.P.c = true;
                boolean S0 = r0cVar.S0(vggVar);
                Throwable th = vggVar.a;
                if (!S0) {
                    xj20Var.getClass();
                    boolean z5 = th instanceof VKApiExecutionException;
                    if (z5 && ((VKApiExecutionException) th).s() == 3615) {
                        r0cVar.U0();
                        s3q0 s3q0Var = s3q0.a;
                    } else if (z5 && ((VKApiExecutionException) th).s() == 3616) {
                        r0cVar.U0();
                        s3q0 s3q0Var2 = s3q0.a;
                    } else if (z5) {
                        String str = wbu0.a(context, th, false).a;
                        u40 u40Var = new u40(r0cVar, 11);
                        q0c q0cVar = (q0c) r0cVar.a;
                        if (q0cVar != null) {
                            x65.a.a(q0cVar, context.getString(R.string.vk_auth_error), str, context.getString(R.string.vk_ok), u40Var, null, u40Var, false, u40Var, u40Var, 16);
                        }
                    }
                }
                break;
            case 6:
                MarketCheckoutSettingsDto marketCheckoutSettingsDto = (MarketCheckoutSettingsDto) obj;
                u4c u4cVar = (u4c) this.receiver;
                u4cVar.getClass();
                List<MarketCheckoutSettingsSectionDto> e = marketCheckoutSettingsDto.d().e();
                LinkedHashMap<String, b7r> c = e != null ? u4cVar.c(e) : new LinkedHashMap<>();
                List<MarketCheckoutSettingsSectionDto> g = marketCheckoutSettingsDto.d().g();
                LinkedHashMap<String, b7r> c2 = g != null ? u4cVar.c(g) : new LinkedHashMap<>();
                List<MarketCheckoutSettingsSectionDto> d = marketCheckoutSettingsDto.d().d();
                LinkedHashMap<String, b7r> c3 = d != null ? u4cVar.c(d) : new LinkedHashMap<>();
                List<MarketCheckoutSettingsSectionDto> f = marketCheckoutSettingsDto.d().f();
                LinkedHashMap<String, b7r> c4 = f != null ? u4cVar.c(f) : new LinkedHashMap<>();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put(C4572u.g, c);
                linkedHashMap.put("recipient", c2);
                linkedHashMap.put("comment", c3);
                linkedHashMap.put("order_list", f.a.a());
                linkedHashMap.put("payment", c4);
                break;
            case 7:
                com.vk.ecomm.catalog.impl.geo.b bVar3 = (com.vk.ecomm.catalog.impl.geo.b) this.receiver;
                ArrayList arrayList3 = bVar3.k;
                arrayList3.clear();
                arrayList3.addAll(((MarketGeoSuggestResponseDto) obj).d());
                if (!arrayList3.isEmpty()) {
                    bVar3.x();
                }
                break;
            case 8:
                CropEditorFragment cropEditorFragment = (CropEditorFragment) this.receiver;
                cropEditorFragment.getClass();
                xn50.a.c(cropEditorFragment, (ofk) obj);
                break;
            case 9:
                ((y1s) this.receiver).c.onNext(new x1s.a((List) obj));
                break;
            case 10:
                break;
            case 11:
                L.i((Throwable) obj);
                break;
            case 12:
                PostingContentView.a((PostingContentView) this.receiver, (wpc0) obj);
                break;
            default:
                List list = (List) obj;
                npr0 npr0Var = (npr0) this.receiver;
                npr0Var.i.b(new wpr0.d(list));
                npr0Var.T(new qpr0.a(list));
                break;
        }
        return s3q0.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Object obj, int i) {
        super(1, obj, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0);
        this.b = i;
        switch (i) {
            case 2:
                super(1, obj, e3a.class, "mapToDefaultSection", "mapToDefaultSection(Lcom/vk/api/generated/catalog/dto/CatalogCatalogResponseObjectDto;)Lcom/vk/catalog2/common/dto/api/CatalogResponse;", 0);
                break;
            case 4:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            case 11:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            case 12:
                super(1, obj, PostingContentView.class, "onRenderUpdated", "onRenderUpdated(Lcom/vk/newsfeed/posting/impl/presentation/model/PostingViewStateRender;)V", 0);
                break;
            default:
                break;
        }
    }
}
