package ru.ozon.android.messenger.framework.data.repository;

import android.content.Context;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.android.messenger.blocks.chat.common.PreviewVO;
import ru.ozon.android.messenger.blocks.input.CustomBlockDTO;
import ru.ozon.android.messenger.blocks.input.attachments.presentation.b;
import ru.ozon.android.messenger.framework.presentation.models.z;
import ru.ozon.app.android.messenger.R$string;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

/* loaded from: classes10.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f88496a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f88497b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f88498c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f88499d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final String f88500e;

    public b0(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f88496a = ru.ozon.android.messenger.utils.c.d(R$string.messenger_message, context);
        this.f88497b = ru.ozon.android.messenger.utils.c.d(R$string.messenger_image, context);
        this.f88498c = ru.ozon.android.messenger.utils.c.d(R$string.messenger_image, context);
        this.f88499d = ru.ozon.android.messenger.utils.c.d(R$string.messenger_file, context);
        this.f88500e = ru.ozon.android.messenger.utils.c.d(R$string.messenger_image_and_file_with_text, context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006b, code lost:
    
        if (r4 != null) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PreviewVO a(PreviewVO previewVO, ru.ozon.android.messenger.framework.presentation.models.q qVar, @NotNull ru.ozon.android.messenger.blocks.input.b draftVO) {
        Object obj;
        Object obj2;
        String str;
        String str2;
        DateTime date;
        ru.ozon.android.messenger.blocks.chat.common.f fVar;
        OzonSpannableString ozonSpannableString;
        TextDTO title;
        Intrinsics.checkNotNullParameter(draftVO, "draftVO");
        if (draftVO.e()) {
            return null;
        }
        Iterator it = draftVO.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((ru.ozon.android.messenger.blocks.input.attachments.presentation.b) obj) instanceof b.C1500b) {
                break;
            }
        }
        boolean z11 = obj != null;
        Iterator it2 = draftVO.a().iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (((ru.ozon.android.messenger.blocks.input.attachments.presentation.b) obj2) instanceof b.a) {
                break;
            }
        }
        boolean z12 = obj2 != null;
        CustomBlockDTO b11 = draftVO.b();
        String c11 = draftVO.c();
        if (c11.length() == 0) {
            if (b11 != null && (title = b11.getTitle()) != null) {
                OzonSpannableString text = title.getText();
                ozonSpannableString = text;
            }
            ozonSpannableString = "";
            c11 = ozonSpannableString;
        }
        CharSequence z02 = kotlin.text.h.z0(c11);
        if (z11 && z12) {
            z02 = String.format(this.f88500e, Arrays.copyOf(new Object[]{z02}, 1));
            Intrinsics.checkNotNullExpressionValue(z02, "format(...)");
        } else if (z11) {
            int length = z02.length();
            str = this.f88498c;
            if (length > 0) {
                str2 = str + "\n" + ((Object) z02);
                z02 = str2;
            }
            z02 = str;
        } else if (z12) {
            int length2 = z02.length();
            str = this.f88499d;
            if (length2 > 0) {
                str2 = str + "\n" + ((Object) z02);
                z02 = str2;
            }
            z02 = str;
        } else if (z02.length() <= 0) {
            z02 = this.f88496a;
        }
        ru.ozon.android.messenger.framework.presentation.models.p c12 = qVar != null ? qVar.c() : null;
        ru.ozon.android.messenger.framework.presentation.models.s sVar = c12 instanceof ru.ozon.android.messenger.framework.presentation.models.s ? (ru.ozon.android.messenger.framework.presentation.models.s) c12 : null;
        if (sVar == null || (date = sVar.h()) == null) {
            date = previewVO != null ? previewVO.getDate() : new DateTime(draftVO.d());
        }
        DateTime dateTime = date;
        String obj3 = z02.toString();
        kotlin.collections.K k11 = kotlin.collections.K.f71697a;
        z.a aVar = z.a.f91563a;
        if (previewVO == null || (fVar = previewVO.getChatStatus()) == null) {
            fVar = ru.ozon.android.messenger.blocks.chat.common.f.CHAT_STATUS_ACTIVE;
        }
        return new PreviewVO(obj3, k11, dateTime, aVar, fVar, true);
    }

    public final PreviewVO b(@NotNull ru.ozon.android.messenger.framework.presentation.models.q undeliveredMessage) {
        ru.ozon.android.messenger.framework.presentation.models.g c11;
        String str;
        Intrinsics.checkNotNullParameter(undeliveredMessage, "undeliveredMessage");
        ru.ozon.android.messenger.framework.presentation.models.u uVar = (ru.ozon.android.messenger.framework.presentation.models.u) C7714v.M(undeliveredMessage.b());
        ru.ozon.android.messenger.blocks.messagetext.f fVar = null;
        if (uVar != null && (c11 = uVar.c()) != null) {
            ru.ozon.android.messenger.framework.presentation.models.p c12 = undeliveredMessage.c();
            ru.ozon.android.messenger.framework.presentation.models.s sVar = c12 instanceof ru.ozon.android.messenger.framework.presentation.models.s ? (ru.ozon.android.messenger.framework.presentation.models.s) c12 : null;
            if (sVar != null) {
                List list = kotlin.collections.K.f71697a;
                if (c11 instanceof ru.ozon.android.messenger.blocks.messagetext.f) {
                    str = ((ru.ozon.android.messenger.blocks.messagetext.f) c11).d().toString();
                } else if (c11 instanceof ru.ozon.android.messenger.blocks.order.b) {
                    if (undeliveredMessage.b().size() > 1) {
                        ru.ozon.android.messenger.framework.presentation.models.g c13 = undeliveredMessage.b().get(1).c();
                        if (c13 instanceof ru.ozon.android.messenger.blocks.messagetext.f) {
                            fVar = (ru.ozon.android.messenger.blocks.messagetext.f) c13;
                        }
                    }
                    str = fVar != null ? fVar.d().toString() : this.f88496a;
                } else if (c11 instanceof ru.ozon.android.messenger.blocks.messageimage.c) {
                    ru.ozon.android.messenger.blocks.messageimage.c cVar = (ru.ozon.android.messenger.blocks.messageimage.c) c11;
                    String c14 = cVar.c();
                    if (c14 == null) {
                        c14 = cVar.e();
                    }
                    list = C7714v.a0(new Icon(c14, null));
                    str = this.f88497b;
                } else if (c11 instanceof ru.ozon.android.messenger.blocks.messagefile.c) {
                    str = ((ru.ozon.android.messenger.blocks.messagefile.c) c11).g();
                    list = C7714v.a0(new Icon("ic_s_document_filled", "graphicTertiary"));
                } else {
                    str = "";
                }
                return new PreviewVO(str, list, sVar.h(), sVar.k(), ru.ozon.android.messenger.blocks.chat.common.f.CHAT_STATUS_ACTIVE, false);
            }
        }
        return null;
    }
}
