package com.vk.im.engine.commands.chats.backgrounds;

import com.vk.api.generated.messages.dto.MessagesConversationStyleBackgroundBlurDto;
import com.vk.api.generated.messages.dto.MessagesConversationStyleBackgroundColorEllipseDto;
import com.vk.api.generated.messages.dto.MessagesConversationStyleBackgroundDto;
import com.vk.api.generated.messages.dto.MessagesConversationStyleBackgroundShadeDto;
import com.vk.api.generated.messages.dto.MessagesConversationStyleBackgroundSvgDto;
import com.vk.api.generated.messages.dto.MessagesConversationStyleGradientDto;
import com.vk.api.generated.messages.dto.MessagesGetBackgroundsResponseDto;
import com.vk.api.generated.messages.dto.MessagesGetBackgroundsSizeDto;
import com.vk.im.engine.commands.chats.backgrounds.BackgroundImageSize;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;
import kotlin.Pair;
import xsna.as;
import xsna.brm0;
import xsna.bz2;
import xsna.c5g;
import xsna.iah0;
import xsna.l7r0;
import xsna.lam;
import xsna.nx2;
import xsna.on00;
import xsna.p11;
import xsna.tfx;
import xsna.xpp;

/* compiled from: DialogBackgroundsLoadByIdsApiCmd.kt */
/* loaded from: classes2.dex */
public final class a extends nx2<xpp<List<? extends lam>>> {
    public final List<String> b;
    public final boolean c;

    public a(List<String> list, boolean z) {
        this.b = list;
        this.c = z;
    }

    public static lam.a g(MessagesConversationStyleBackgroundShadeDto messagesConversationStyleBackgroundShadeDto) {
        lam.a.b bVar;
        lam.a.b.d dVar;
        ArrayList arrayList;
        MessagesConversationStyleBackgroundShadeDto.MessagesConversationStyleBackgroundShadeVectorDto messagesConversationStyleBackgroundShadeVectorDto = messagesConversationStyleBackgroundShadeDto instanceof MessagesConversationStyleBackgroundShadeDto.MessagesConversationStyleBackgroundShadeVectorDto ? (MessagesConversationStyleBackgroundShadeDto.MessagesConversationStyleBackgroundShadeVectorDto) messagesConversationStyleBackgroundShadeDto : null;
        if (messagesConversationStyleBackgroundShadeVectorDto != null) {
            MessagesConversationStyleBackgroundSvgDto g = messagesConversationStyleBackgroundShadeVectorDto.d().g();
            if (g != null) {
                String url = g.getUrl();
                int width = g.getWidth();
                int height = g.getHeight();
                float d = g.d();
                Boolean e = g.e();
                dVar = new lam.a.b.d(url, width, height, d, e != null ? e.booleanValue() : false);
            } else {
                dVar = null;
            }
            MessagesConversationStyleGradientDto f = messagesConversationStyleBackgroundShadeVectorDto.d().f();
            lam.a.b.c cVar = f != null ? new lam.a.b.c(f.e(), f.d()) : null;
            MessagesConversationStyleBackgroundBlurDto d2 = messagesConversationStyleBackgroundShadeVectorDto.d().d();
            lam.a.b.C3244a c3244a = d2 != null ? new lam.a.b.C3244a(d2.d(), d2.e(), d2.f()) : null;
            List<MessagesConversationStyleBackgroundColorEllipseDto> e2 = messagesConversationStyleBackgroundShadeVectorDto.d().e();
            if (e2 != null) {
                List<MessagesConversationStyleBackgroundColorEllipseDto> list = e2;
                arrayList = new ArrayList(c5g.u(list, 10));
                for (MessagesConversationStyleBackgroundColorEllipseDto messagesConversationStyleBackgroundColorEllipseDto : list) {
                    arrayList.add(new lam.a.b.C3245b(messagesConversationStyleBackgroundColorEllipseDto.g(), messagesConversationStyleBackgroundColorEllipseDto.i(), messagesConversationStyleBackgroundColorEllipseDto.d(), messagesConversationStyleBackgroundColorEllipseDto.e(), messagesConversationStyleBackgroundColorEllipseDto.f()));
                }
            } else {
                arrayList = null;
            }
            bVar = new lam.a.b(dVar, cVar, c3244a, arrayList);
        } else {
            bVar = null;
        }
        MessagesConversationStyleBackgroundShadeDto.MessagesConversationStyleBackgroundShadeRasterDto messagesConversationStyleBackgroundShadeRasterDto = messagesConversationStyleBackgroundShadeDto instanceof MessagesConversationStyleBackgroundShadeDto.MessagesConversationStyleBackgroundShadeRasterDto ? (MessagesConversationStyleBackgroundShadeDto.MessagesConversationStyleBackgroundShadeRasterDto) messagesConversationStyleBackgroundShadeDto : null;
        return new lam.a(bVar, messagesConversationStyleBackgroundShadeRasterDto != null ? new lam.a.C3243a(messagesConversationStyleBackgroundShadeRasterDto.d().getUrl(), messagesConversationStyleBackgroundShadeRasterDto.d().getWidth(), messagesConversationStyleBackgroundShadeRasterDto.d().getHeight()) : null);
    }

    @Override // xsna.nx2
    public final xpp<List<? extends lam>> f(l7r0 l7r0Var) {
        MessagesGetBackgroundsSizeDto messagesGetBackgroundsSizeDto;
        Object obj;
        BackgroundImageSize backgroundImageSize;
        MessagesGetBackgroundsSizeDto[] values = MessagesGetBackgroundsSizeDto.values();
        int length = values.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                messagesGetBackgroundsSizeDto = null;
                break;
            }
            MessagesGetBackgroundsSizeDto messagesGetBackgroundsSizeDto2 = values[i2];
            String i3 = messagesGetBackgroundsSizeDto2.i();
            BackgroundImageSize.Companion.getClass();
            int sqrt = (int) Math.sqrt(Math.pow(iah0.f().heightPixels, 2.0d) + Math.pow(iah0.f().widthPixels, 2.0d));
            BackgroundImageSize[] values2 = BackgroundImageSize.values();
            TreeMap g = on00.g(new Pair[i]);
            int length2 = values2.length;
            int i4 = i;
            while (i4 < length2) {
                BackgroundImageSize backgroundImageSize2 = values2[i4];
                BackgroundImageSize.a aVar = BackgroundImageSize.Companion;
                int width = backgroundImageSize2.getWidth();
                int height = backgroundImageSize2.getHeight();
                aVar.getClass();
                g.put(Integer.valueOf((int) Math.sqrt(Math.pow(height, 2.0d) + Math.pow(width, 2.0d))), backgroundImageSize2);
                i4++;
                values = values;
                length = length;
            }
            MessagesGetBackgroundsSizeDto[] messagesGetBackgroundsSizeDtoArr = values;
            int i5 = length;
            Iterator it = g.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                Object next = it.next();
                if (((Integer) next).intValue() >= sqrt) {
                    obj = next;
                    break;
                }
            }
            Integer num = (Integer) obj;
            if (num == null || (backgroundImageSize = (BackgroundImageSize) g.get(Integer.valueOf(num.intValue()))) == null) {
                backgroundImageSize = BackgroundImageSize.XXXXHDPI;
            }
            if (brm0.w(i3, backgroundImageSize.name(), true)) {
                messagesGetBackgroundsSizeDto = messagesGetBackgroundsSizeDto2;
                break;
            }
            i2++;
            values = messagesGetBackgroundsSizeDtoArr;
            length = i5;
            i = 0;
        }
        if (messagesGetBackgroundsSizeDto == null) {
            messagesGetBackgroundsSizeDto = MessagesGetBackgroundsSizeDto.HDPI;
        }
        tfx tfxVar = new tfx("messages.getBackgrounds", new as(22), new p11(20));
        List<String> list = this.b;
        if (list != null) {
            tfxVar.i("background_ids", list);
        }
        if (messagesGetBackgroundsSizeDto != null) {
            tfx.o(tfxVar, "size", messagesGetBackgroundsSizeDto.i(), 0, 0, 12);
        }
        List<MessagesConversationStyleBackgroundDto> d = ((MessagesGetBackgroundsResponseDto) bz2.l(tfxVar, this.c)).d();
        ArrayList arrayList = new ArrayList(c5g.u(d, 10));
        for (MessagesConversationStyleBackgroundDto messagesConversationStyleBackgroundDto : d) {
            String id = messagesConversationStyleBackgroundDto.getId();
            long g2 = messagesConversationStyleBackgroundDto.g();
            lam.a g3 = g(messagesConversationStyleBackgroundDto.e());
            lam.a g4 = g(messagesConversationStyleBackgroundDto.d());
            Boolean i6 = messagesConversationStyleBackgroundDto.i();
            arrayList.add(new lam(id, g2, g3, g4, i6 != null ? i6.booleanValue() : false, messagesConversationStyleBackgroundDto.f()));
        }
        return new xpp<>(arrayList, false);
    }
}
