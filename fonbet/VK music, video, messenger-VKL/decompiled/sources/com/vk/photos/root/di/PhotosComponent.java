package com.vk.photos.root.di;

import com.vk.core.fragments.FragmentImpl;
import com.vk.di.component.DiScopedComponent;
import com.vk.dto.common.id.UserId;
import com.vk.photos.root.common.PhotoUploadInteractor;
import com.vk.photos.root.photoflow.domain.AlbumsRepository;
import xsna.bj1;
import xsna.ch1;
import xsna.eha0;
import xsna.el1;
import xsna.f8a0;
import xsna.gzs;
import xsna.mpn0;
import xsna.oca0;
import xsna.oga0;
import xsna.pwj0;
import xsna.qfa0;
import xsna.qga0;
import xsna.s0e0;
import xsna.vi3;
import xsna.x7a0;

/* compiled from: PhotosComponent.kt */
/* loaded from: classes.dex */
public interface PhotosComponent extends DiScopedComponent<pwj0> {
    bj1 D7();

    qfa0 F4();

    ch1 G6();

    oca0 J3();

    x7a0 L9();

    eha0 Od();

    vi3 Y5();

    el1 d3();

    AlbumsRepository i3();

    gzs<FragmentImpl> m2(UserId userId);

    PhotoUploadInteractor.a o5();

    qga0 p7();

    f8a0 r1();

    oga0 r4();

    mpn0 t9();

    s0e0 z8();
}
