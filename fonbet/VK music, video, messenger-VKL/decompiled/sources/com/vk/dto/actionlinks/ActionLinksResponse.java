package com.vk.dto.actionlinks;

import com.vk.dto.common.data.VKList;

/* compiled from: ActionLinksResponse.kt */
/* loaded from: classes18.dex */
public final class ActionLinksResponse extends VKList<ActionLink> {
    public ActionLinksResponse() {
        throw null;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof ActionLink) {
            return super.contains((ActionLink) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj == null ? true : obj instanceof ActionLink) {
            return super.indexOf((ActionLink) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj == null ? true : obj instanceof ActionLink) {
            return super.lastIndexOf((ActionLink) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null ? true : obj instanceof ActionLink) {
            return super.remove((ActionLink) obj);
        }
        return false;
    }
}
