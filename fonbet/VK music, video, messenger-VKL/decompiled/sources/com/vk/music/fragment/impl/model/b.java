package com.vk.music.fragment.impl.model;

import androidx.annotation.NonNull;
import com.vk.api.generated.audio.dto.AudioGetResponseDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.music.MusicTrack;
import com.vk.music.fragment.impl.container.MusicEditPlaylistDataContainer;
import java.util.ArrayList;
import java.util.stream.Collectors;
import xsna.bn40;
import xsna.hx2;
import xsna.i0p;
import xsna.mzp0;
import xsna.nbb0;
import xsna.obb0;
import xsna.p0p;
import xsna.tq70;

/* compiled from: EditPlaylistModelImpl.java */
/* loaded from: classes3.dex */
public final class b implements hx2<AudioGetResponseDto> {
    public final /* synthetic */ int b;
    public final /* synthetic */ com.vk.music.fragment.impl.model.a c;

    /* compiled from: EditPlaylistModelImpl.java */
    public class a implements tq70.b<i0p.a> {
        public final /* synthetic */ VKApiExecutionException b;

        public a(VKApiExecutionException vKApiExecutionException) {
            this.b = vKApiExecutionException;
        }

        @Override // xsna.tq70.b
        public final void accept(i0p.a aVar) {
            i0p.a aVar2 = aVar;
            int i = b.this.b;
            VKApiExecutionException vKApiExecutionException = this.b;
            if (i == 0) {
                aVar2.d(vKApiExecutionException);
            } else {
                aVar2.l(vKApiExecutionException);
            }
        }
    }

    public b(com.vk.music.fragment.impl.model.a aVar, int i) {
        this.c = aVar;
        this.b = i;
    }

    @Override // xsna.hx2
    public final void b(AudioGetResponseDto audioGetResponseDto) {
        AudioGetResponseDto audioGetResponseDto2 = audioGetResponseDto;
        com.vk.music.fragment.impl.model.a aVar = this.c;
        mzp0 mzp0Var = aVar.p;
        if (mzp0Var != null) {
            mzp0Var.c(false);
        }
        aVar.f = null;
        ArrayList arrayList = (ArrayList) audioGetResponseDto2.d().stream().map(new nbb0()).collect(Collectors.toCollection(new obb0()));
        aVar.e.b = !arrayList.isEmpty();
        MusicEditPlaylistDataContainer musicEditPlaylistDataContainer = aVar.e;
        ArrayList<MusicTrack> arrayList2 = musicEditPlaylistDataContainer.h;
        int i = this.b;
        if (arrayList2 == null || i == 0) {
            musicEditPlaylistDataContainer.h = new ArrayList<>();
        }
        MusicEditPlaylistDataContainer musicEditPlaylistDataContainer2 = aVar.e;
        if (musicEditPlaylistDataContainer2.b) {
            musicEditPlaylistDataContainer2.c = i + 100;
            musicEditPlaylistDataContainer2.h.addAll(arrayList);
            aVar.e.l.addAll(arrayList);
        }
        aVar.y(new p0p(this, arrayList));
    }

    @Override // xsna.hx2
    public final void e(@NonNull VKApiExecutionException vKApiExecutionException) {
        com.vk.music.fragment.impl.model.a aVar = this.c;
        mzp0 mzp0Var = aVar.p;
        if (mzp0Var != null) {
            mzp0Var.f();
        }
        aVar.f = null;
        bn40.c(vKApiExecutionException, new Object[0]);
        aVar.y(new a(vKApiExecutionException));
    }
}
