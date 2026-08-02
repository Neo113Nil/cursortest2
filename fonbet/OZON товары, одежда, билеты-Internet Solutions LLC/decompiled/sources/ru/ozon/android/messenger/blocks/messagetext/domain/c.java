package ru.ozon.android.messenger.blocks.messagetext.domain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.messagetext.MessageTextDTO;

/* loaded from: classes10.dex */
public final class c {
    @NotNull
    public static ArrayList a(@NotNull List parts) {
        Intrinsics.checkNotNullParameter(parts, "parts");
        ArrayList arrayList = new ArrayList();
        Iterator it = parts.iterator();
        while (it.hasNext()) {
            b((MessageTextDTO.MessageTextType) it.next(), arrayList, 1, false);
        }
        return arrayList;
    }

    private static void b(MessageTextDTO.MessageTextType messageTextType, ArrayList arrayList, int i11, boolean z11) {
        if (messageTextType.getData() != null || messageTextType.isNullDataSupported()) {
            b bVar = (b) C7714v.Z(arrayList);
            MessageTextDTO.MessageTextType b11 = bVar != null ? bVar.b() : null;
            boolean z12 = messageTextType instanceof MessageTextDTO.MessageTextType.OlType;
            if (!z12 && !(messageTextType instanceof MessageTextDTO.MessageTextType.UlType)) {
                arrayList.add(new b(messageTextType, i11));
                return;
            }
            int i12 = 0;
            if (z12) {
                if (b11 != null && !b11.isNewLineAtTheEnd()) {
                    arrayList.add(new b(new MessageTextDTO.MessageTextType.NewLine(), i11));
                }
                if (z11) {
                    i11++;
                }
                MessageTextDTO.MessageTextType.OlType olType = (MessageTextDTO.MessageTextType.OlType) messageTextType;
                if (olType.getData() == null) {
                    return;
                }
                int i13 = 1;
                for (MessageTextDTO.MessageTextType messageTextType2 : olType.getData()) {
                    b(messageTextType2, arrayList, i11, true);
                    if (messageTextType2 instanceof MessageTextDTO.MessageTextType.NewLine) {
                        i13++;
                    } else if (i12 < i13 && !(messageTextType2 instanceof MessageTextDTO.MessageTextType.OlType) && !(messageTextType2 instanceof MessageTextDTO.MessageTextType.UlType)) {
                        b bVar2 = (b) C7714v.Z(arrayList);
                        if (bVar2 != null) {
                            bVar2.f(i13);
                        }
                        i12 = i13;
                    }
                }
                return;
            }
            if (messageTextType instanceof MessageTextDTO.MessageTextType.UlType) {
                if (b11 != null && !b11.isNewLineAtTheEnd()) {
                    arrayList.add(new b(new MessageTextDTO.MessageTextType.NewLine(), i11));
                }
                if (z11) {
                    i11++;
                }
                MessageTextDTO.MessageTextType.UlType ulType = (MessageTextDTO.MessageTextType.UlType) messageTextType;
                if (ulType.getData() == null) {
                    return;
                }
                while (true) {
                    boolean z13 = true;
                    for (MessageTextDTO.MessageTextType messageTextType3 : ulType.getData()) {
                        b(messageTextType3, arrayList, i11, true);
                        if (messageTextType3 instanceof MessageTextDTO.MessageTextType.NewLine) {
                            break;
                        }
                        if (z13 && !(messageTextType3 instanceof MessageTextDTO.MessageTextType.OlType) && !(messageTextType3 instanceof MessageTextDTO.MessageTextType.UlType)) {
                            b bVar3 = (b) C7714v.Z(arrayList);
                            if (bVar3 != null) {
                                bVar3.e();
                            }
                            z13 = false;
                        }
                    }
                    return;
                }
            }
        }
    }
}
