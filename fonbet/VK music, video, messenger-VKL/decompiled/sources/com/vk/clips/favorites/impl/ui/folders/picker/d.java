package com.vk.clips.favorites.impl.ui.folders.picker;

import com.vk.clips.favorites.api.params.ClipsFavoritesFoldersPickerParams;
import com.vk.clips.favorites.impl.ui.folders.picker.ClipsFavoritesFoldersPickerState;
import com.vk.clips.favorites.impl.ui.folders.picker.a;
import com.vk.clips.favorites.impl.ui.folders.picker.f;
import com.vk.clips.sdk.shared.FavoriteFolderId;
import com.vk.dto.common.Image;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.c5g;
import xsna.epx;
import xsna.g5g;
import xsna.izs;
import xsna.n4e;
import xsna.u2e;
import xsna.v4e;
import xsna.w4e;
import xsna.x4e;
import xsna.y4e;

/* compiled from: ClipsFavoritesFoldersPickerReducer.kt */
/* loaded from: classes16.dex */
public final /* synthetic */ class d extends FunctionReferenceImpl implements izs<ClipsFavoritesFoldersPickerState, f.b> {
    @Override // xsna.izs
    public final f.b invoke(ClipsFavoritesFoldersPickerState clipsFavoritesFoldersPickerState) {
        boolean z;
        int size;
        boolean z2;
        ClipsFavoritesFoldersPickerState clipsFavoritesFoldersPickerState2 = clipsFavoritesFoldersPickerState;
        n4e n4eVar = (n4e) this.receiver;
        n4eVar.getClass();
        if (clipsFavoritesFoldersPickerState2.equals(ClipsFavoritesFoldersPickerState.b.b)) {
            return f.b.d.a;
        }
        if (clipsFavoritesFoldersPickerState2.equals(ClipsFavoritesFoldersPickerState.a.b)) {
            return f.b.C0612b.a;
        }
        if (!(clipsFavoritesFoldersPickerState2 instanceof ClipsFavoritesFoldersPickerState.Content)) {
            throw new NoWhenBranchMatchedException();
        }
        ClipsFavoritesFoldersPickerState.Content content = (ClipsFavoritesFoldersPickerState.Content) clipsFavoritesFoldersPickerState2;
        Set<FavoriteFolderId> set = content.d;
        int i = n4e.a.$EnumSwitchMapping$0[content.b.ordinal()];
        boolean z3 = true;
        if (i == 1) {
            return f.b.c.a;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        u2e u2eVar = content.c;
        List<Image> list = u2eVar.c;
        String str = u2eVar.d;
        Set<FavoriteFolderId> set2 = set;
        boolean z4 = set2 instanceof Collection;
        if (!z4 || !set2.isEmpty()) {
            Iterator<T> it = set2.iterator();
            while (it.hasNext()) {
                if (epx.f((FavoriteFolderId) it.next(), u2eVar.a)) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        f.a aVar = new f.a(list, str, z);
        ArrayList arrayList = new ArrayList();
        boolean z5 = content.h < content.i;
        arrayList.add(new v4e(z5 ? a.f.C0605a.b : a.f.b.b, !z5));
        ClipsFavoritesFoldersPickerParams clipsFavoritesFoldersPickerParams = n4eVar.a;
        if (clipsFavoritesFoldersPickerParams instanceof ClipsFavoritesFoldersPickerParams.PickFolderToAddVideo) {
            size = 1;
        } else {
            if (!(clipsFavoritesFoldersPickerParams instanceof ClipsFavoritesFoldersPickerParams.PickFolderToMoveVideos)) {
                throw new NoWhenBranchMatchedException();
            }
            size = ((ClipsFavoritesFoldersPickerParams.PickFolderToMoveVideos) clipsFavoritesFoldersPickerParams).e.size();
        }
        List<u2e> list2 = content.e;
        ArrayList arrayList2 = new ArrayList(c5g.u(list2, 10));
        for (u2e u2eVar2 : list2) {
            int i2 = content.j;
            int i3 = u2eVar2.e;
            FavoriteFolderId favoriteFolderId = u2eVar2.a;
            boolean z6 = size <= i2 - i3 ? z3 : false;
            List<Image> list3 = u2eVar2.c;
            String str2 = u2eVar2.d;
            if (!z4 || !set2.isEmpty()) {
                Iterator<T> it2 = set2.iterator();
                while (it2.hasNext()) {
                    if (epx.f((FavoriteFolderId) it2.next(), favoriteFolderId)) {
                        z2 = true;
                        break;
                    }
                }
            }
            z2 = false;
            arrayList2.add(new w4e(favoriteFolderId, list3, str2, z2, z6 ? new a.f.d(favoriteFolderId, u2eVar2.d) : a.f.c.b, !z6));
            z3 = true;
        }
        g5g.y(arrayList2, arrayList);
        int i4 = n4e.a.$EnumSwitchMapping$1[content.g.ordinal()];
        if (i4 != 1) {
            if (i4 == 2) {
                arrayList.add(y4e.b);
            } else {
                if (i4 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                arrayList.add(x4e.b);
            }
        }
        return new f.b.a(aVar, arrayList);
    }
}
