package com.vk.photos.legacy;

import com.vk.dto.photo.Photo;
import com.vk.photos.legacy.PhotoListFragment;
import com.vk.photos.legacy.SectionedPhotoListFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import xsna.xy9;

/* loaded from: classes16.dex */
public class YearSectionedPhotoListFragment extends SectionedPhotoListFragment {
    public final Calendar U0 = Calendar.getInstance();

    @Override // com.vk.photos.legacy.PhotoListFragment, me.grishka.appkit.fragments.BaseRecyclerFragment, xsna.w1d0.a
    public final void A3(List<Photo> list) {
        int i;
        ArrayList<SectionedPhotoListFragment.a> arrayList = this.T0;
        if (arrayList.size() == 0) {
            i = 0;
        } else {
            Calendar calendar = this.U0;
            calendar.setTimeInMillis(((Photo) this.v0.get(((SectionedPhotoListFragment.a) xy9.b(1, arrayList)).e - 1)).g * 1000);
            i = calendar.get(1);
        }
        SectionedPhotoListFragment.a aVar = arrayList.size() == 0 ? null : (SectionedPhotoListFragment.a) xy9.b(1, arrayList);
        int i2 = aVar != null ? aVar.e : 0;
        Iterator<Photo> it = list.iterator();
        while (it.hasNext()) {
            Calendar calendar2 = this.U0;
            calendar2.setTimeInMillis(it.next().g * 1000);
            int i3 = calendar2.get(1);
            if (i3 != i) {
                if (aVar != null) {
                    int i4 = aVar.d;
                    aVar.c = new PhotoListFragment.l(i4, i2 - i4);
                    aVar.e = i2;
                    if (!arrayList.contains(aVar)) {
                        arrayList.add(aVar);
                    }
                }
                SectionedPhotoListFragment.a aVar2 = new SectionedPhotoListFragment.a();
                String string = getString(R.string.year_x, Integer.valueOf(i3));
                aVar2.a = string;
                aVar2.b = new SectionedPhotoListFragment.b(string);
                aVar2.d = i2;
                aVar = aVar2;
            }
            i2++;
            i = i3;
        }
        if (aVar != null) {
            int i5 = aVar.d;
            aVar.c = new PhotoListFragment.l(i5, i2 - i5);
            aVar.e = i2;
            if (!arrayList.contains(aVar)) {
                arrayList.add(aVar);
            }
        }
        super.A3(list);
        this.J0.P0();
        if (this.M0) {
            this.J0.K0(new PhotoListFragment.i());
        }
        Iterator<SectionedPhotoListFragment.a> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            SectionedPhotoListFragment.a next = it2.next();
            this.J0.K0(next.b);
            this.J0.K0(next.c);
        }
    }

    @Override // me.grishka.appkit.fragments.BaseRecyclerFragment, xsna.w1d0.a
    public final void Kj() {
        this.T0.clear();
    }
}
