package com.vk.clips.favorites.impl.ui.folders.content.recycler;

import androidx.recyclerview.widget.m;
import java.util.ArrayList;
import xsna.asp;
import xsna.c3e;
import xsna.epx;
import xsna.hfz;
import xsna.zrp;

/* compiled from: ClipsFavoriteFolderContentListItemCallback.kt */
/* loaded from: classes16.dex */
public final class ClipsFavoriteFolderContentListItemCallback extends m.e<hfz> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClipsFavoriteFolderContentListItemCallback.kt */
    public static final class Payload {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Payload[] $VALUES;
        public static final Payload MULTI_SELECT_CHECKBOX_STATE;

        static {
            Payload payload = new Payload("MULTI_SELECT_CHECKBOX_STATE", 0);
            MULTI_SELECT_CHECKBOX_STATE = payload;
            Payload[] payloadArr = {payload};
            $VALUES = payloadArr;
            $ENTRIES = new asp(payloadArr);
        }

        public Payload() {
            throw null;
        }

        public static Payload valueOf(String str) {
            return (Payload) Enum.valueOf(Payload.class, str);
        }

        public static Payload[] values() {
            return (Payload[]) $VALUES.clone();
        }
    }

    @Override // androidx.recyclerview.widget.m.e
    public final boolean areContentsTheSame(hfz hfzVar, hfz hfzVar2) {
        return hfzVar.equals(hfzVar2);
    }

    @Override // androidx.recyclerview.widget.m.e
    public final boolean areItemsTheSame(hfz hfzVar, hfz hfzVar2) {
        return epx.f(hfzVar.getItemId(), hfzVar2.getItemId());
    }

    @Override // androidx.recyclerview.widget.m.e
    public final Object getChangePayload(hfz hfzVar, hfz hfzVar2) {
        hfz hfzVar3 = hfzVar;
        hfz hfzVar4 = hfzVar2;
        ArrayList arrayList = new ArrayList();
        if ((hfzVar3 instanceof c3e) && (hfzVar4 instanceof c3e) && ((c3e) hfzVar3).b != ((c3e) hfzVar4).b) {
            arrayList.add(Payload.MULTI_SELECT_CHECKBOX_STATE);
        }
        return arrayList;
    }
}
