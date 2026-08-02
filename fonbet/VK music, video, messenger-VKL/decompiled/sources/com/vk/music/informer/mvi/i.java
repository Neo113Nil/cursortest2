package com.vk.music.informer.mvi;

import com.vk.api.generated.artist.dto.ArtistArtistPromoDto;
import com.vk.music.informer.mvi.MusicPlayerInformerViewState;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.izs;
import xsna.mx40;
import xsna.nx40;

/* compiled from: MusicPlayerInformerReducer.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class i extends FunctionReferenceImpl implements izs<nx40, MusicPlayerInformerViewState.a> {
    @Override // xsna.izs
    public final MusicPlayerInformerViewState.a invoke(nx40 nx40Var) {
        MusicPlayerInformerViewState.Icons icons;
        ((mx40) this.receiver).getClass();
        ArtistArtistPromoDto artistArtistPromoDto = nx40Var.b;
        if (artistArtistPromoDto == null) {
            return null;
        }
        String d = artistArtistPromoDto.d();
        String url = artistArtistPromoDto.getUrl();
        int i = mx40.a.$EnumSwitchMapping$0[artistArtistPromoDto.f().ordinal()];
        if (i == 1) {
            icons = MusicPlayerInformerViewState.Icons.TICKET_ICON;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            icons = MusicPlayerInformerViewState.Icons.MERCH_ICON;
        }
        return new MusicPlayerInformerViewState.a(d, url, icons);
    }
}
