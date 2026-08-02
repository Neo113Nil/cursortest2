package com.vk.mediapicker.impl.presentation.fragment;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vk.core.view.mediapicker.VkMediaPicker;
import com.vk.mediapicker.api.models.MediaPickerConfiguration;
import com.vk.mediapicker.api.models.MediaPickerFragmentArguments;
import com.vk.mediapicker.api.models.MediaPickerItem;
import com.vk.mediapicker.api.models.MediaPickerViewState;
import com.vk.mediapicker.impl.presentation.fragment.MediaPickerFragment;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.mediastore.system.MediaStoreVideoEntry;
import com.vk.permission.PermissionHelper;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.c5g;
import xsna.cf00;
import xsna.ehw;
import xsna.ekh;
import xsna.epx;
import xsna.fgm;
import xsna.fk90;
import xsna.ikv0;
import xsna.ko00;
import xsna.l8k;
import xsna.msy;
import xsna.mt10;
import xsna.nht;
import xsna.oe5;
import xsna.oz50;
import xsna.p4g;
import xsna.pg9;
import xsna.pvo0;
import xsna.tp10;
import xsna.tt10;
import xsna.tvo;
import xsna.u110;
import xsna.uai0;
import xsna.ut10;
import xsna.wlb0;
import xsna.x3v0;
import xsna.yfb;
import xsna.yp10;

/* compiled from: MediaPickerFragment.kt */
/* loaded from: classes3.dex */
public final class MediaPickerFragment extends FragmentImpl implements tvo.a, x3v0, mt10.a, nht {
    public static final /* synthetic */ int Q = 0;
    public final Object N;
    public VkMediaPicker O;
    public final Object P;

    /* compiled from: MediaPickerFragment.kt */
    public static final class a extends oz50 {
    }

    /* compiled from: MediaPickerFragment.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[MediaPickerConfiguration.MediaType.values().length];
            try {
                iArr[MediaPickerConfiguration.MediaType.Image.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MediaPickerConfiguration.MediaType.Video.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[MediaPickerFragmentArguments.CellAspectRation.values().length];
            try {
                iArr2[MediaPickerFragmentArguments.CellAspectRation.Square.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[MediaPickerFragmentArguments.CellAspectRation.Vertical.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[MediaPickerViewState.Medias.Pagination.values().length];
            try {
                iArr3[MediaPickerViewState.Medias.Pagination.Loading.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[MediaPickerViewState.Medias.Pagination.Error.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[MediaPickerViewState.Medias.Pagination.Loaded.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public MediaPickerFragment() {
        cf00 cf00Var = new cf00(this, 2);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.N = msy.a(lazyThreadSafetyMode, cf00Var);
        this.P = msy.a(lazyThreadSafetyMode, new u110(this, 1));
    }

    @Override // xsna.mt10.a
    public final void Ag(List<? extends MediaStoreEntry> list) {
        getParentFragmentManager().k0(yfb.b(new Pair("media_picker_selected", p4g.q(list))), "media_picker_result");
    }

    @Override // xsna.x3v0
    public final void C() {
        fo().C();
    }

    @Override // xsna.x3v0
    public final void C0() {
        fo().e(this, MediaPickerConfiguration.MediaType.Video);
    }

    @Override // xsna.x3v0
    public final void G0(uai0 uai0Var) {
        fo().f(uai0Var.a);
    }

    @Override // xsna.x3v0
    public final void Gj() {
        fo().D();
    }

    @Override // xsna.nht
    public final void K0(int i, String[] strArr) {
        fo().K0(i, strArr);
    }

    @Override // xsna.mt10.a
    public final void K3(FrameLayout frameLayout) {
        VkMediaPicker vkMediaPicker = this.O;
        if (vkMediaPicker == null) {
            vkMediaPicker = null;
        }
        vkMediaPicker.setState(new VkMediaPicker.State.a(frameLayout));
    }

    @Override // xsna.mt10.a
    public final void Kc(MediaStoreEntry mediaStoreEntry) {
        fo().i(mediaStoreEntry.getId());
    }

    @Override // xsna.x3v0
    public final void N0() {
        fo().g();
    }

    @Override // xsna.x3v0
    public final void P0() {
        fo().e(this, MediaPickerConfiguration.MediaType.Image);
    }

    @Override // xsna.mt10.a
    public final void U6(MediaPickerConfiguration.MediaType mediaType) {
        int i = b.$EnumSwitchMapping$0[mediaType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            wlb0.q(this);
        } else {
            Context mo2getContext = mo2getContext();
            if (mo2getContext == null) {
                return;
            }
            PermissionHelper permissionHelper = PermissionHelper.a;
            permissionHelper.getClass();
            PermissionHelper.f(permissionHelper, mo2getContext, PermissionHelper.t, R.string.vk_permissions_intent_photo, R.string.vk_permissions_intent_photo, new oe5(23, mo2getContext, this), null, 32);
        }
    }

    @Override // xsna.x3v0
    public final void Z1(uai0 uai0Var) {
        fo().a(uai0Var.a);
    }

    @Override // xsna.mt10.a
    public final void bl(MediaPickerViewState mediaPickerViewState) {
        VkMediaPicker.State.Footer footer;
        VkMediaPicker.State bVar;
        ehw.b bVar2;
        String str;
        ehw.a aVar;
        ehw.a aVar2;
        yp10 yp10Var;
        yp10 yp10Var2;
        tp10 tp10Var = mediaPickerViewState.a;
        VkMediaPicker vkMediaPicker = this.O;
        ehw.a aVar3 = null;
        if (vkMediaPicker == null) {
            vkMediaPicker = null;
        }
        vkMediaPicker.setAlbums(new VkMediaPicker.a(tp10Var.a, tp10Var.b));
        VkMediaPicker vkMediaPicker2 = this.O;
        if (vkMediaPicker2 == null) {
            vkMediaPicker2 = null;
        }
        MediaPickerViewState.Medias medias = mediaPickerViewState.b;
        boolean z = false;
        if (epx.f(medias, MediaPickerViewState.Medias.a.a)) {
            bVar = new VkMediaPicker.State.a(new VkPlaceholder(requireContext(), null, 6, 0));
        } else if (epx.f(medias, MediaPickerViewState.Medias.c.a)) {
            bVar = VkMediaPicker.State.c.a;
        } else {
            if (!(medias instanceof MediaPickerViewState.Medias.b)) {
                throw new NoWhenBranchMatchedException();
            }
            MediaPickerViewState.Medias.b bVar3 = (MediaPickerViewState.Medias.b) medias;
            ArrayList arrayList = bVar3.a;
            ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    MediaPickerItem mediaPickerItem = (MediaPickerItem) it.next();
                    if (epx.f(mediaPickerItem, MediaPickerItem.PartMediaPermissionWarningItem.b)) {
                        yp10Var2 = fk90.a;
                        aVar = aVar3;
                    } else {
                        if (mediaPickerItem instanceof MediaPickerItem.CameraItem) {
                            boolean z2 = ((MediaPickerItem.CameraItem) mediaPickerItem).b;
                            boolean z3 = eo().f.d != MediaPickerConfiguration.MediaType.All ? z : true;
                            aVar = aVar3;
                            yp10Var = new pg9(z2, z3);
                        } else {
                            if (!(mediaPickerItem instanceof MediaPickerItem.ImageItem)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            MediaPickerItem.ImageItem imageItem = (MediaPickerItem.ImageItem) mediaPickerItem;
                            MediaStoreEntry mediaStoreEntry = imageItem.b;
                            int id = mediaStoreEntry.getId();
                            Uri f = mediaStoreEntry.f();
                            long d = mediaStoreEntry.d() * 1000;
                            String str2 = imageItem.c;
                            MediaPickerItem.ImageItem.SelectedState selectedState = imageItem.d;
                            if (epx.f(selectedState, MediaPickerItem.ImageItem.SelectedState.Checked.b)) {
                                bVar2 = ehw.b.a.a;
                            } else if (selectedState instanceof MediaPickerItem.ImageItem.SelectedState.Counted) {
                                bVar2 = new ehw.b.C2813b(((MediaPickerItem.ImageItem.SelectedState.Counted) selectedState).b);
                            } else if (epx.f(selectedState, MediaPickerItem.ImageItem.SelectedState.Disabled.b)) {
                                bVar2 = ehw.b.c.a;
                            } else {
                                if (!epx.f(selectedState, MediaPickerItem.ImageItem.SelectedState.NotSelected.b)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                bVar2 = ehw.b.d.a;
                            }
                            ehw.b bVar4 = bVar2;
                            if (mediaStoreEntry instanceof MediaStoreVideoEntry) {
                                str = str2;
                                aVar = null;
                                aVar2 = new ehw.a(null, new ehw.a.AbstractC2809a.b(pvo0.b(((MediaStoreVideoEntry) mediaStoreEntry).q / 1000)), 5);
                            } else {
                                str = str2;
                                aVar = aVar3;
                                aVar2 = aVar;
                            }
                            yp10Var = new ehw(id, f, d, str, null, bVar4, aVar2);
                        }
                        yp10Var2 = yp10Var;
                    }
                    arrayList2.add(yp10Var2);
                    aVar3 = aVar;
                    z = false;
                } else {
                    List<MediaStoreEntry> list = bVar3.b;
                    ArrayList arrayList3 = new ArrayList(c5g.u(list, 10));
                    for (MediaStoreEntry mediaStoreEntry2 : list) {
                        arrayList3.add(new uai0(mediaStoreEntry2.getId(), mediaStoreEntry2.f()));
                    }
                    int i = b.$EnumSwitchMapping$2[bVar3.c.ordinal()];
                    if (i == 1) {
                        footer = VkMediaPicker.State.Footer.Loading;
                    } else if (i == 2) {
                        footer = VkMediaPicker.State.Footer.Error;
                    } else {
                        if (i != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        footer = VkMediaPicker.State.Footer.Invisible;
                    }
                    bVar = new VkMediaPicker.State.b(arrayList2, arrayList3, footer);
                }
            }
        }
        vkMediaPicker2.setState(bVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final MediaPickerFragmentArguments eo() {
        return (MediaPickerFragmentArguments) this.P.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final mt10 fo() {
        return (mt10) this.N.getValue();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        fo().h(this, i, i2, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.media_picker_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment, xsna.h90.a
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        fo().onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        fo().onResume();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        VkMediaPicker.CellAspectRation cellAspectRation;
        final List<String> list;
        Long l;
        Long l2;
        Long l3;
        super.onViewCreated(view, bundle);
        this.O = (VkMediaPicker) view.findViewById(R.id.media_picker_view);
        MediaPickerFragmentArguments.MediaFilterPresets mediaFilterPresets = eo().e;
        ArrayList arrayList = new ArrayList();
        if (mediaFilterPresets != null && (l3 = mediaFilterPresets.d) != null) {
            final long longValue = l3.longValue();
            arrayList.add(new tt10() { // from class: xsna.vt10
                @Override // xsna.tt10
                public final boolean a(MediaStoreEntry mediaStoreEntry) {
                    int i = MediaPickerFragment.Q;
                    return mediaStoreEntry.g() <= longValue;
                }
            });
        }
        if (mediaFilterPresets != null && (l2 = mediaFilterPresets.b) != null) {
            final long longValue2 = l2.longValue();
            arrayList.add(new ut10() { // from class: xsna.wt10
                @Override // xsna.tt10
                public final boolean a(MediaStoreEntry mediaStoreEntry) {
                    int i = MediaPickerFragment.Q;
                    return (mediaStoreEntry instanceof MediaStoreVideoEntry) && ((MediaStoreVideoEntry) mediaStoreEntry).q >= longValue2;
                }
            });
        }
        if (mediaFilterPresets != null && (l = mediaFilterPresets.c) != null) {
            final long longValue3 = l.longValue();
            arrayList.add(new ut10() { // from class: xsna.xt10
                @Override // xsna.tt10
                public final boolean a(MediaStoreEntry mediaStoreEntry) {
                    int i = MediaPickerFragment.Q;
                    return (mediaStoreEntry instanceof MediaStoreVideoEntry) && ((MediaStoreVideoEntry) mediaStoreEntry).q <= longValue3;
                }
            });
        }
        if (mediaFilterPresets != null && (list = mediaFilterPresets.e) != null) {
            arrayList.add(new tt10() { // from class: xsna.yt10
                @Override // xsna.tt10
                public final boolean a(MediaStoreEntry mediaStoreEntry) {
                    int i = MediaPickerFragment.Q;
                    List<String> list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        for (String str : list2) {
                            String lastPathSegment = mediaStoreEntry.f().getLastPathSegment();
                            if (lastPathSegment != null ? brm0.v(lastPathSegment, str, false) : false) {
                                return true;
                            }
                        }
                    }
                    return false;
                }
            });
        }
        fo().l(this, eo().f, arrayList, this);
        VkMediaPicker vkMediaPicker = this.O;
        if (vkMediaPicker == null) {
            vkMediaPicker = null;
        }
        boolean z = eo().b;
        boolean z2 = eo().c;
        int i = b.$EnumSwitchMapping$1[eo().d.ordinal()];
        if (i == 1) {
            cellAspectRation = VkMediaPicker.CellAspectRation.Square;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            cellAspectRation = VkMediaPicker.CellAspectRation.Vertical;
        }
        vkMediaPicker.d(new VkMediaPicker.c(this, z, z2, cellAspectRation, new VkMediaPicker.e.b(new ko00(this, 3), new ekh(this, 17)), new VkMediaPicker.b.C0889b(new fgm(this, 24))));
        fo().d();
    }

    @Override // xsna.tvo.a
    public final void pc(int i, List<String> list) {
        fo().j(i, (ArrayList) list);
    }

    @Override // xsna.mt10.a
    public final void tl(int i) {
        Context mo2getContext = mo2getContext();
        if (mo2getContext == null) {
            return;
        }
        ikv0.a aVar = new ikv0.a(mo2getContext);
        aVar.u = new ikv0.d(mo2getContext.getString(i), (String) null, (ikv0.d.a) null, 6);
        aVar.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, mo2getContext.getString(R.string.picker_selection_snackbar_button), new l8k(18));
        aVar.n();
    }

    @Override // xsna.x3v0
    public final void u2(uai0 uai0Var) {
        fo().i(uai0Var.a);
    }

    @Override // xsna.tvo.a
    public final void wi(int i, List<String> list) {
        fo().c(i, (ArrayList) list);
    }
}
