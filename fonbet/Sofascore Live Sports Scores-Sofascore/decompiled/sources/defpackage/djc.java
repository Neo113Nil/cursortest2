package defpackage;

import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class djc {
    public static final String[] a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    public static TextInformationFrame a(int i, nkk nkkVar, String str) {
        int f = nkkVar.f();
        if (nkkVar.f() == 1684108385 && f >= 22) {
            nkkVar.F(10);
            int x = nkkVar.x();
            if (x > 0) {
                String j = ljg.j(x, "");
                int x2 = nkkVar.x();
                if (x2 > 0) {
                    j = mz1.j(x2, j, "/");
                }
                return new TextInformationFrame(str, null, j);
            }
        }
        "Failed to parse index/count attribute: ".concat(ffb.g(i));
        m6k.f0();
        return null;
    }

    public static TextInformationFrame b(int i, nkk nkkVar, String str) {
        int f = nkkVar.f();
        if (nkkVar.f() == 1684108385) {
            nkkVar.F(8);
            return new TextInformationFrame(str, null, nkkVar.o(f - 16));
        }
        "Failed to parse text attribute: ".concat(ffb.g(i));
        m6k.f0();
        return null;
    }

    public static Id3Frame c(int i, String str, nkk nkkVar, boolean z, boolean z2) {
        int d = d(nkkVar);
        if (z2) {
            d = Math.min(1, d);
        }
        if (d >= 0) {
            return z ? new TextInformationFrame(str, null, Integer.toString(d)) : new CommentFrame(C.LANGUAGE_UNDETERMINED, str, Integer.toString(d));
        }
        "Failed to parse uint8 attribute: ".concat(ffb.g(i));
        m6k.f0();
        return null;
    }

    public static int d(nkk nkkVar) {
        nkkVar.F(4);
        if (nkkVar.f() == 1684108385) {
            nkkVar.F(8);
            return nkkVar.s();
        }
        m6k.f0();
        return -1;
    }
}
