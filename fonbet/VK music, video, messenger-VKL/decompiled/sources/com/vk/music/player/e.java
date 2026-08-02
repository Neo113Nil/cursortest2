package com.vk.music.player;

import androidx.annotation.Nullable;
import com.vk.music.player.error.VkPlayerException;
import java.util.List;

/* compiled from: PlayerListener.java */
/* loaded from: classes.dex */
public interface e {
    void B1();

    void K1();

    void N3(PlayState playState, @Nullable f fVar);

    void W3(f fVar);

    void n3();

    void o2(f fVar);

    void onError(@Nullable String str);

    boolean t3(VkPlayerException vkPlayerException);

    void x0();

    void y4(List<PlayerTrack> list);

    void z3();

    /* compiled from: PlayerListener.java */
    public static class a implements e {
        @Override // com.vk.music.player.e
        public boolean t3(VkPlayerException vkPlayerException) {
            return false;
        }

        @Override // com.vk.music.player.e
        public void B1() {
        }

        @Override // com.vk.music.player.e
        public void K1() {
        }

        @Override // com.vk.music.player.e
        public void n3() {
        }

        @Override // com.vk.music.player.e
        public final void x0() {
        }

        @Override // com.vk.music.player.e
        public void z3() {
        }

        @Override // com.vk.music.player.e
        public void W3(f fVar) {
        }

        @Override // com.vk.music.player.e
        public void o2(f fVar) {
        }

        @Override // com.vk.music.player.e
        public void onError(String str) {
        }

        @Override // com.vk.music.player.e
        public void y4(List<PlayerTrack> list) {
        }

        @Override // com.vk.music.player.e
        public void N3(PlayState playState, f fVar) {
        }
    }
}
